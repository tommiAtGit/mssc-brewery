package com.myproject.java.spring.msscbrewery.web.controler;

import java.util.UUID;

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
import com.myproject.java.spring.msscbrewery.web.model.BeerDTO;
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
	
	@PostMapping
	public ResponseEntity<CustomerDTO> handlePost(@RequestBody CustomerDTO customerDTO) {
		CustomerDTO savedCustomer = customerService.saveCustomer(customerDTO);
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("Location", "/api/v1/customer " + savedCustomer.getId().toString() );
		return new ResponseEntity<CustomerDTO>(headers, HttpStatus.CREATED);
	}
	
	@PutMapping({"/{cutomerId}"})
	public ResponseEntity<CustomerDTO> handleUpdate (@PathVariable("customerId") UUID customerId,@RequestBody CustomerDTO customerDTO){
		
		customerService.updateCustomer(customerId,customerDTO);
		
		return new ResponseEntity<CustomerDTO>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping({"/{cutomerId}"})
	public void deleteCustomer(@PathVariable("customerId") UUID customerId) {
		customerService.deleteCustomer(customerId);
	}
	
	

}
