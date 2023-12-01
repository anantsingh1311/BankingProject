package com.synergisticit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.synergisticit.domain.Role;
import com.synergisticit.service.RoleService;

import jakarta.validation.Valid;

@Controller
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@RequestMapping("/roleForm")
	public String RoleForm(Role role, Model model) {
		model.addAttribute("roles",roleService.findAllRoles());
		return "RoleForm";
	}
	
	@RequestMapping("/saveRole")
	public String SaveRole(@Valid Role role,Model model) {
		 roleService.saveRole(role);
		 model.addAttribute("roles", roleService.findAllRoles());
		 return "RoleForm";
	}
	
	@RequestMapping("/updateRole")
	public String updateRole(@Valid Role role,@RequestParam Long roleId,Model model) {
		model.addAttribute("roles", roleService.findAllRoles());
		Role roleFromDb=roleService.findRoleById(roleId);
		System.out.println(roleFromDb.getRoleId()+ " ,"+roleFromDb.getRoleName());
		model.addAttribute("r",roleFromDb);
		return "RoleForm";
	}
	


}
