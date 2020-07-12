package com.myproject.java.spring.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.myproject.java.spring.msscbrewery.web.model.CustomerDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDTO getCustomerById(UUID id) {
		return CustomerDTO.builder().id(UUID.randomUUID())
				.firstName("Pommi")
				.lastName("Portaikko")
				.Address("IsoMela 12")
				.eMail("pommi@portaikko.com")
				.build();
	}

	@Override
	public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
		return CustomerDTO.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public CustomerDTO updateCustomer(UUID customerId, CustomerDTO customerDTO) {
		log.debug("Update customer");
		return CustomerDTO.builder()
				.id(customerId)
				.build();
	}

	@Override
	public void deleteCustomer(UUID customerId) {
		log.debug("Delete customer stub");
		
	}

}
