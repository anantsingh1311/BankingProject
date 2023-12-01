package com.synergisticit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.synergisticit.domain.Account;
import com.synergisticit.domain.AccountType;
import com.synergisticit.service.AccountService;
import com.synergisticit.service.CustomerService;

import jakarta.validation.Valid;

@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/accountForm")
	public String AccountForm(Account account, Model model) {
		model.addAttribute("Accounts",accountService.FindAllAccounts());
		return "AccountForm";
	}
	
	@RequestMapping(value="/saveAccount")
	public String SaveAccount(@ModelAttribute @Valid Account acc,BindingResult br,Model model){
	System.out.println(acc.getAccountCustomer());
	
	if(!br.hasErrors()) {
		accountService.saveAccount(acc);
		model.addAttribute("accountType", AccountType.values());
		model.addAttribute("Accounts",accountService.FindAllAccounts());
		 System.out.println("Account Saved: " + acc.getAccountHolder());
		 
	}
	return "AccountForm";
	}

}
