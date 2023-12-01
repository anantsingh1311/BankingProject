package com.synergisticit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergisticit.domain.Role;
import com.synergisticit.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public Role findRoleById(Long roleId) {
		
		Optional<Role> role = roleRepository.findById(roleId);
		System.out.println(role.get().getRoleName());
		if(role.isPresent()) {
			return role.get();
		}
	
		return null;
	}

	@Override
	public void DeleteRoleId(Long roleId) {
		roleRepository.deleteById(roleId);
	}

	@Override
	public List<Role> findAllRoles() {
		return roleRepository.findAll();
	}

//	@Override
//	public Role updateRoleId(String name, Long roleId) {
//		return roleRepository.updatRoles(name, roleId);
//	}

}
