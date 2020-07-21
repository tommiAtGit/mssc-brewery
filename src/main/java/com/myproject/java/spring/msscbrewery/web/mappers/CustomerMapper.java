package com.myproject.java.spring.msscbrewery.web.mappers;

import org.mapstruct.Mapper;

import com.myproject.java.spring.msscbrewery.domain.Customer;
import com.myproject.java.spring.msscbrewery.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {

	Customer customerDtoToCustomer(CustomerDto dto);
	CustomerDto customerToCustomerDto(Customer customer);
}
