package com.myproject.java.spring.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.myproject.java.spring.msscbrewery.web.model.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID id) {
		return CustomerDto.builder().id(UUID.randomUUID())
				.firstName("Pommi")
				.lastName("Portaikko")
				.Address("IsoMela 12")
				.eMail("pommi@portaikko.com")
				.build();
	}

	@Override
	public CustomerDto saveCustomer(CustomerDto customerDTO) {
		return CustomerDto.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public CustomerDto updateCustomer(UUID customerId, CustomerDto customerDTO) {
		log.debug("Update customer");
		return CustomerDto.builder()
				.id(customerId)
				.build();
	}

	@Override
	public void deleteCustomer(UUID customerId) {
		log.debug("Delete customer stub");
		
	}

}
