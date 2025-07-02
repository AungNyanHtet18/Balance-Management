package com.anh.balances.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anh.balances.controller.annonymous.dto.SignUpForm;
import com.anh.balances.model.entity.Account;
import com.anh.balances.model.entity.Member;
import com.anh.balances.model.entity.MemberActivity;
import com.anh.balances.model.entity.consts.MemberStatus;
import com.anh.balances.model.entity.consts.Role;
import com.anh.balances.model.repo.AccountRepo;
import com.anh.balances.model.repo.MemberActivityRepo;
import com.anh.balances.model.repo.MemberRepo;
import com.anh.balances.utils.exception.AppBusinessException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SignUpService {

	private final AccountRepo accountRepo;
	private final MemberRepo memberRepo;
	private final MemberActivityRepo activityRepo;
	private final AccessHistoryService accessHistoryService;
	private final PasswordEncoder passwordEncoder;
	
    	
	@Transactional
	public String signUp(SignUpForm form) {
	
	 if(accountRepo.existsById(form.getUsername())) {
		throw new AppBusinessException("Your email is already registered.Please try another email.");  
	 }
		
	  var account = new Account();
	  account.setUsername(form.getUsername());
	  account.setPassword(passwordEncoder.encode(form.getPassword()));
	  account.setActive(true);
	  account.setRole(Role.Member);
	  
	  account = accountRepo.save(account); //this returned account object is in managed stage after saving.so, we can use in member object
	  
	  var member = new Member();  
	  member.setAccount(account);
	  member.setEmail(form.getUsername());
	  member.setName(form.getName());
	  memberRepo.save(member);
	  
	  var activity = new MemberActivity();
	  activity.setMember(member);
	  activity.setBalance(BigDecimal.ZERO);
	  activity.setRegisteredAt(LocalDateTime.now());
	  activity.setStatus(MemberStatus.Active);
       	
	  activityRepo.save(activity);
	  accessHistoryService.signUp(form.getUsername());
	  
		return "Your account has been created successfully.Please sign in again.";
	}

}
