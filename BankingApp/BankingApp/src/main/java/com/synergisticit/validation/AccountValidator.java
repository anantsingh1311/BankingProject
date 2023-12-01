package com.synergisticit.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.synergisticit.domain.Account;

import jakarta.validation.Validator;

@Component
public class AccountValidator implements org.springframework.validation.Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Account.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Account account = (Account) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "accountCustomer", "account.accountCustomer.empty","**Id is a required field");
		
		
		
	}

}
