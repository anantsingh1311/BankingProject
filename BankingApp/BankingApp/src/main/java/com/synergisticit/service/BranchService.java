package com.synergisticit.service;

import java.util.List;

import com.synergisticit.domain.Branch;

public interface BranchService {
	
	Branch save(Branch branch);
	void deletebyBranchId(Long id);
	Branch findByBranchId(Long id);
	List<Branch> findAllBranches(); 
	Branch updateBranchById(Long id);
	
	

}
