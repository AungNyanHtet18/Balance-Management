package com.anh.balances.controller.management.dto;

import java.time.LocalDateTime;

import com.anh.balances.model.entity.Member;
import com.anh.balances.model.entity.consts.MemberStatus;
import com.anh.balances.model.entity.MemberActivity_;
import com.anh.balances.model.entity.Member_;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public record MemberListItem(
	long id,
	String name,
	LocalDateTime registerAt,
	LocalDateTime lastLoginAt,
	MemberStatus status,
	LocalDateTime changeAt,
	String remark) {

	public static void select(CriteriaQuery<MemberListItem> cq, Root<Member> root) {
		
		cq.multiselect(
			root.get(Member_.id),
			root.get(Member_.name),
			root.get(Member_.activity).get(MemberActivity_.registeredAt),
			root.get(Member_.activity).get(MemberActivity_.lastAccessAt),
			root.get(Member_.activity).get(MemberActivity_.status),
			root.get(Member_.activity).get(MemberActivity_.updatedAt),
			root.get(Member_.activity).get(MemberActivity_.statusChangeReason)
		);
		
		
	}
    
}
