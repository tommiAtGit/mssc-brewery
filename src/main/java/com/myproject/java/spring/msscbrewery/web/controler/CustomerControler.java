package com.myproject.java.spring.msscbrewery.web.controler;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.java.spring.msscbrewery.services.CustomerService;
import com.myproject.java.spring.msscbrewery.web.model.CustomerDTO;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerControler {

	private final CustomerService customerService;

	public CustomerControler(CustomerService customerService) {
		
		this.customerService = customerService;
	}
	
	@GetMapping({"/{cutomerId}"})
	public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("cutomerId") UUID cutomerId){
		
		System.out.println(cutomerId.toString());
		return new ResponseEntity<>(customerService.getCustomerById(cutomerId),HttpStatus.OK);
		
	}
	
	

}
