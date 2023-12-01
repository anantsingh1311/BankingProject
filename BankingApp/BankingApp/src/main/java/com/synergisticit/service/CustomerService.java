package com.synergisticit.service;

import java.util.List;

import com.synergisticit.domain.Customer;

public interface CustomerService {

	public Customer SaveCustomer(Customer customer);
	public void delteCustomer(Long customerId);
	public List<Customer> findAllCustomers();
	public Customer FindByCustomerId(Long customerId);
	
}
