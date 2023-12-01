package com.synergisticit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergisticit.domain.Customer;
import com.synergisticit.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer SaveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void delteCustomer(Long customerId) {
		customerRepository.deleteById(customerId);
		
	}

	@Override
	public List<Customer> findAllCustomers() {
		List<Customer> customers= customerRepository.findAll(); 
		//System.out.println("Customer Service Impl: "+customers);
		return customers;
	}

	@Override
	public Customer FindByCustomerId(Long customerId) {
		Optional<Customer>  customer = customerRepository.findById(customerId);
		
		if(customer.isPresent()) {
			return customer.get();
		}
		
		return null;
	}

}
