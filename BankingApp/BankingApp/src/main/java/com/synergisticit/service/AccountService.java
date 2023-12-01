package com.synergisticit.service;

import java.util.List;

import com.synergisticit.domain.Account;

public interface AccountService {

	Account saveAccount(Account account);
	void DeleteAccountById(Long id);
//	void UpdateAccountById(Long id);
	Account FindByAccountID(Long id);
	List<Account> FindAllAccounts();
}
