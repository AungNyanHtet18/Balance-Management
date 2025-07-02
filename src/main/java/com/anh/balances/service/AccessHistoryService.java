package com.anh.balances.service;

import java.time.Instant;
import java.util.function.Function;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anh.balances.controller.member.dto.AccessHistoryListItem;
import com.anh.balances.controller.member.dto.AccessHistorySearch;
import com.anh.balances.model.PageResult;
import com.anh.balances.model.entity.AccessHistory;
import com.anh.balances.model.entity.consts.AccessStatus;
import com.anh.balances.model.entity.consts.AccessType;
import com.anh.balances.model.entity.embeddables.AccessHistoryPk;
import com.anh.balances.model.repo.AccessHistoryRepo;
import com.anh.balances.model.entity.AccessHistory_;
import com.anh.balances.model.entity.embeddables.AccessHistoryPk_;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class AccessHistoryService {

	private final AccessHistoryRepo repo;
	
	@Transactional
	public void signUp(String username) {
	 createHistory(username,AccessType.SignUp,AccessStatus.Success);	
	}
	
	@Transactional
	public void loginSuccess(String name) {
	   createHistory(name,AccessType.Login,AccessStatus.Success);		
	}
	
	@Transactional
	public void logoutSuccess(String name) {
		createHistory(name,AccessType.Logout,AccessStatus.Success);	
		
	}
	
	@Transactional
	public void loginError(String name, String message) {
		createHistory(name,AccessType.Login,AccessStatus.Fails,message);	
		
	}
	
	@Transactional(readOnly = true)
	public PageResult<AccessHistoryListItem> search(AccessHistorySearch form, 
			                                       int page, 
			                                       int size) {
		 
		return repo.search(queryFunc(form), countFunc(form), page, size);
	}
	
	
	private Function<CriteriaBuilder,CriteriaQuery<AccessHistoryListItem>> queryFunc(AccessHistorySearch form) {
		return cb-> {
			 var cq = cb.createQuery(AccessHistoryListItem.class);
			 var root = cq.from(AccessHistory.class);
			 
			 AccessHistoryListItem.select(cq,root);
			 cq.where(form.where(cb,root));
			 cq.orderBy(cb.desc(root.get(AccessHistory_.id).get(AccessHistoryPk_.accessAt)));
			 
			 return cq;
		};
	}
	
	
	private Function<CriteriaBuilder,CriteriaQuery<Long>> countFunc(AccessHistorySearch form) {
		return cb-> {
			 var cq = cb.createQuery(Long.class);
			 var root = cq.from(AccessHistory.class);
			 
			 cq.select(cb.count(root.get(AccessHistory_.id)));
			 cq.where(form.where(cb,root));
			 
			 return cq;
		};
	}

	private void createHistory(String username, AccessType type, AccessStatus status) {
		createHistory(username,type,status,null);
	}
	

	private void createHistory(String username, AccessType type, AccessStatus status,String message) {
        
		var id = new AccessHistoryPk();
		id.setAccessAt(Instant.now());
		id.setUsername(username);

		var history = new AccessHistory();
		history.setId(id);
		history.setType(type);
		history.setStatus(status);
		history.setRemark(message);
		
		repo.save(history);
	}

}
