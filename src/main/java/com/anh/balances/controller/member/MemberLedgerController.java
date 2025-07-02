package com.anh.balances.controller.member;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anh.balances.controller.member.dto.LedgerForm;
import com.anh.balances.controller.member.dto.LedgerSearch;
import com.anh.balances.model.entity.consts.BalanceType;
import com.anh.balances.service.LedgerManagementService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("member/ledger")
@RequiredArgsConstructor
public class MemberLedgerController {

	private final LedgerManagementService service;
	
	@GetMapping
	String index(ModelMap model,LedgerSearch form,
		      	@RequestParam(required = false,defaultValue = "0") int page ,
		      	@RequestParam(required = false,defaultValue = "10") int size) {
	
	  var username = SecurityContextHolder.getContext()
			        .getAuthentication().getName();
	  	
	  model.put("result", service.search(username,form,page,size)); 
       
      return "member/ledgers/list";
	}
	
	@ModelAttribute("balanceTypes")
	BalanceType[] types() {
		 return BalanceType.values();
	}
	
	@PostMapping
	String save(
	        ModelMap model,		
		    @Validated @ModelAttribute(name="form") LedgerForm ledgerForm,
			BindingResult result) {
		
		if(result.hasErrors()) {
			 return "member/ledgers/list";   //test with redirect
		}
		
		service.save(ledgerForm);
		
		 return "redirect:/member/ledger";
	}
	
	@ModelAttribute(name="form")
	LedgerForm ledgerForm(@RequestParam(required = false) Integer id) {
		
		 if(null != id) {
			  //Search from Database response as form
			return service.findForEdit(id); 
		 }
		
		 return new LedgerForm();
	}
	
}
