package com.synergisticit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.synergisticit.domain.Branch;
import com.synergisticit.service.BranchService;

import jakarta.validation.Valid;

@Controller
public class BranchController {

	@Autowired
	BranchService branchService;
	
	
	@RequestMapping("/branchForm")
	public String branchForm(Branch branch,Model model) {
		model.addAttribute("branches", branchService.findAllBranches());
		return "BranchForm";
	}
	
	
	@RequestMapping("/saveBranch")
	public String SavebranchForm(@Valid Branch branch) {
		System.out.println("Branch Controller "+branch.getBranchName());
		branchService.save(branch);
		return "BranchForm";
	}
	
	
}
