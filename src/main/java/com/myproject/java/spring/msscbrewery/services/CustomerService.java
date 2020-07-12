package com.myproject.java.spring.msscbrewery.services;

import java.util.UUID;

import com.myproject.java.spring.msscbrewery.web.model.CustomerDTO;

public interface CustomerService {

	CustomerDTO getCustomerById(UUID id);

	CustomerDTO saveCustomer(CustomerDTO customerDTO);

	CustomerDTO updateCustomer(UUID customerId, CustomerDTO customerDTO);

	void deleteCustomer(UUID customerId);
}
