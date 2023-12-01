package com.synergisticit.service;

import java.util.List;

import com.synergisticit.domain.Role;

public interface RoleService {
	
	Role saveRole(Role role);
	Role findRoleById(Long roleId);
	void DeleteRoleId(Long roleId);
	List<Role> findAllRoles();
//	Role updateRoleId(String name,Long roleId);

}
