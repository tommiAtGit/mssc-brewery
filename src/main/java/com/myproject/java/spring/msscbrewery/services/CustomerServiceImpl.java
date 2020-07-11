package com.myproject.java.spring.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.myproject.java.spring.msscbrewery.web.model.CustomerDTO;

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

}
