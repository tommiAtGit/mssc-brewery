package com.myproject.java.spring.msscbrewery.web.controler;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.java.spring.msscbrewery.services.CustomerService;
import com.myproject.java.spring.msscbrewery.web.model.CustomerDto;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

	private final CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		
		this.customerService = customerService;
	}
	
	@GetMapping({"/{cutomerId}"})
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable("cutomerId") UUID cutomerId){
		
		System.out.println(cutomerId.toString());
		return new ResponseEntity<>(customerService.getCustomerById(cutomerId),HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<CustomerDto> handlePost(@Valid @RequestBody CustomerDto customerDTO) {
		CustomerDto savedCustomer = customerService.saveCustomer(customerDTO);
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("Location", "/api/v1/customer/" + savedCustomer.getId().toString() );
		return new ResponseEntity<CustomerDto>(headers, HttpStatus.CREATED);
	}
	
	@PutMapping({"/{customerId}"})
	public ResponseEntity<CustomerDto> handleUpdate (@PathVariable("customerId") UUID customerId,@Valid @RequestBody CustomerDto customerDTO){
		
		customerService.updateCustomer(customerId,customerDTO);
		
		return new ResponseEntity<CustomerDto>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping({"/{customerId}"})
	public void deleteCustomer(@PathVariable("customerId") UUID customerId) {
		customerService.deleteCustomer(customerId);
	}
	
	
	
	
	
	
	
	
	

}
