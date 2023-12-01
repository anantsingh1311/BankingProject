package com.synergisticit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.synergisticit.domain.Customer;
import com.synergisticit.service.CustomerService;

import jakarta.validation.Valid;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/customerForm")
	public String CustomerForm(Customer customer, Model model) {
		model.addAttribute("customers",customerService.findAllCustomers());
		return "Customer";
	}
	@RequestMapping("/saveCustomer")
	public String SaveCustomer(@Valid Customer customer,BindingResult br,Model model) {
		if(!br.hasErrors()) {
		customerService.SaveCustomer(customer);
		model.addAttribute("customers", customerService.findAllCustomers());
		return "redirect:customerForm";
		}
		return "Customer";
		
	}

}
