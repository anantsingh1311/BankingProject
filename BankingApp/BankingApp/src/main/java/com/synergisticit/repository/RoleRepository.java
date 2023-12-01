package com.synergisticit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.synergisticit.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

//	@Query(value="update role set roleName=:name,roleId:=roleId")
//	Role updatRoles(@Param("name") String name,@Param("roleId") Long roleId);
	
}
