package com.synergisticit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.synergisticit.domain.Role;
import com.synergisticit.domain.User;
import com.synergisticit.service.RoleService;
import com.synergisticit.service.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@Autowired
	UserService userSevrice;
	
	@Autowired
	RoleService roleService;
	
	@RequestMapping("/userForm")
	public String UserForm(Role roles,User user,Model model) {
		model.addAttribute("users",userSevrice.findUsers());
		model.addAttribute("roles",roleService.findAllRoles());
		return "UserForm";
	}
	
	@RequestMapping("/saveUser")
	public String saveUser(@Valid User user,BindingResult br,Model model) {
		if(!br.hasErrors()) {
		 userSevrice.SaveUser(user);
	 model.addAttribute("users",userSevrice.findUsers());
		model.addAttribute("roles",roleService.findAllRoles());
		return "redirect:userForm";
		}
		return "UserForm";
		
		}
	
//	http://localhost:9090/updateUser?userId=1
	@RequestMapping("/updateUser")
	public String updateUser(User user,@RequestParam Long userId,Model model) {
		System.out.println("+++++++++++++++++++++++++++");
		model.addAttribute("users", userSevrice.findUsers());
		User userFromDb=userSevrice.findUserByID(userId);
		//System.out.println(userFromDb.getUsername()+" /"+userFromDb.getPassword());
		model.addAttribute("u",userFromDb);
		return "UserForm";
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUser(User user,Model model, @RequestParam Long userId) {
		userSevrice.delteUserByID(userId);
		model.addAttribute("users",userSevrice.findUsers());
		model.addAttribute("roles",roleService.findAllRoles());
		return "UserForm";
		
		}
	
	

}
