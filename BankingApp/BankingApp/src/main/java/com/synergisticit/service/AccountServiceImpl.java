package com.synergisticit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergisticit.domain.Account;
import com.synergisticit.repository.AccountRepository;
import com.synergisticit.repository.BranchRepository;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepository accountRepository;

	@Override
	public Account saveAccount(Account account) {
		
		return accountRepository.save(account);
	}

	@Override
	public void DeleteAccountById(Long id) {
		
		accountRepository.deleteById(id);
		
	}

	@Override
	public Account FindByAccountID(Long id) {
		
		Optional<Account> accountObject = accountRepository.findById(id);
		
		if(accountObject.isPresent()) {
			return accountObject.get();
		}
		System.out.println("Error: Cant get the value");
		return null;
	}

	@Override
	public List<Account> FindAllAccounts() {
		
		return accountRepository.findAll();
	}

}
