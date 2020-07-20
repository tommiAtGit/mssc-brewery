package com.myproject.java.spring.msscbrewery.services;

import java.util.UUID;

import com.myproject.java.spring.msscbrewery.web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerById(UUID id);

	CustomerDto saveCustomer(CustomerDto customerDTO);

	CustomerDto updateCustomer(UUID customerId, CustomerDto customerDTO);

	void deleteCustomer(UUID customerId);
}
