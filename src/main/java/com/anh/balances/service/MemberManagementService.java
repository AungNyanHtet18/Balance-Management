package com.anh.balances.service;

import static com.anh.balances.utils.EntityOperations.safeCall;

import java.time.LocalDate;
import java.util.function.Function;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anh.balances.controller.management.dto.MemberDetails;
import com.anh.balances.controller.management.dto.MemberListItem;
import com.anh.balances.controller.management.dto.MemberSearch;
import com.anh.balances.controller.management.dto.MemberStatusForm;
import com.anh.balances.model.PageResult;
import com.anh.balances.model.entity.Member;
import com.anh.balances.model.entity.consts.MemberStatus;
import com.anh.balances.model.repo.MemberActivityRepo;
import com.anh.balances.model.repo.MemberRepo;
import com.anh.balances.model.entity.MemberActivity_;
import com.anh.balances.model.entity.Member_;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberManagementService {

	private static final String RESOURCE_NAME = "member";
	private static final String KEY_NAME = "id";
	
	private final MemberRepo memberRepo;
	private final MemberActivityRepo activityRepo;
	
	@Transactional
	public void updateStatus(long id, MemberStatusForm form) {
	 var member =  safeCall(memberRepo.findById(id), RESOURCE_NAME,KEY_NAME,id);   // member is managed stage
	 
	 member.getAccount().setActive(form.getStatus());
	 
	 var activity = member.getActivity();  //activity is managed stage
	 activity.setStatus(form.getStatus() ? MemberStatus.Active : MemberStatus.Denined);
	 activity.setStatusChangeReason(form.getReason());
	 
	}

	public MemberDetails findById(long id) {
		return safeCall(memberRepo.findById(id).map(MemberDetails::from), RESOURCE_NAME, KEY_NAME, id);
	}

	public PageResult<MemberListItem> search(MemberSearch search, int page, int size) {
		return  memberRepo.search(queryFunc(search), countFunc(search), page, size);
	}

	private Function<CriteriaBuilder,CriteriaQuery<MemberListItem>> queryFunc(MemberSearch search) {
		return cb->{
			 var cq = cb.createQuery(MemberListItem.class);
			 var root = cq.from(Member.class);
			 
			 MemberListItem.select(cq,root);
			 cq.where(search.where(cb,root));
			 cq.orderBy(cb.desc(root.get(Member_.activity).get(MemberActivity_.updatedAt)));
			  
			 return cq;
		};
	}

    private Function<CriteriaBuilder,CriteriaQuery<Long>> countFunc(MemberSearch search) {
		return cb->{
			 var cq = cb.createQuery(Long.class);
			 var root = cq.from(Member.class);
			 
			 cq.select(cb.count(root.get(Member_.id)));
			 cq.where(search.where(cb,root));
			 
			 return cq;
		};
	}

   
	public Long findMemberCount(LocalDate dateFrom) {
        
		if(null == dateFrom) {
			 return memberRepo.count();
		}
		
		return activityRepo.countByRegisteredAtIsGreaterThanEqual(dateFrom.atStartOfDay());
	}
	
}
