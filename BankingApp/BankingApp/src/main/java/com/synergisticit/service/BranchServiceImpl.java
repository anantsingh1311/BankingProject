package com.synergisticit.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergisticit.domain.Branch;
import com.synergisticit.repository.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService {

	@Autowired
	BranchRepository branchRepository;
	
	@Override
	public Branch save(Branch branch) {
		
		return branchRepository.save(branch);
	
	}

	@Override
	public void deletebyBranchId(Long id) {
		branchRepository.deleteById(id);

	}

	@Override
	public Branch findByBranchId(Long id) {
		Optional<Branch> branch = branchRepository.findById(id);
		if(branch.isPresent()) {
			return branch.get();
		}
		return null;
	}

	@Override
	public List<Branch> findAllBranches() {
		// TODO Auto-generated method stub
		
		List<Branch> branches = new ArrayList<>();
		branches=branchRepository.findAll();
		
		return branches;
	}

	@Override
	public Branch updateBranchById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
