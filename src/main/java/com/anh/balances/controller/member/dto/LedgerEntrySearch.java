package com.anh.balances.controller.member.dto;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.util.StringUtils;

import com.anh.balances.model.entity.LedgerEntry;
import com.anh.balances.model.entity.consts.BalanceType;
import com.anh.balances.model.entity.Account_;
import com.anh.balances.model.entity.LedgerEntry_;
import com.anh.balances.model.entity.Ledger_;
import com.anh.balances.model.entity.Member_;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.Data;

@Data
public class LedgerEntrySearch {

	 private LocalDate dateFrom;
	 private LocalDate dateTo;
	 private String keyword;
	 
	 
	public Predicate[] where(String username, BalanceType type, CriteriaBuilder cb, Root<LedgerEntry> root) {
		
		var params = new ArrayList<Predicate>();
		

		params.add(cb.equal(root.get(LedgerEntry_.ledger).get(Ledger_.member).get(Member_.account).get(Account_.username), username));
		params.add(cb.equal(root.get(LedgerEntry_.ledger).get(Ledger_.type), type));
		
		
		if(null !=dateFrom) {
			 params.add(cb.greaterThanOrEqualTo(root.get(LedgerEntry_.issueAt), dateFrom.atStartOfDay()));
		}
		
		if(null != dateTo) {
			 params.add(cb.lessThan(root.get(LedgerEntry_.issueAt), dateTo.plusDays(1).atStartOfDay()));
		}
		
		if(StringUtils.hasLength(keyword)) {
			 params.add(cb.like(cb.lower (root.get(LedgerEntry_.particular)), keyword.toLowerCase().concat("%")));
		}
		
		return params.toArray(size -> new Predicate[size]);
	}
	 
}
