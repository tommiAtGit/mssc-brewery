package com.myproject.java.spring.msscbrewery.web.controler;


import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.java.spring.msscbrewery.services.BeerService;
import com.myproject.java.spring.msscbrewery.web.model.BeerDTO;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerControler {
	
	private final BeerService beerService;
	
	
	public BeerControler(BeerService beerService) {
		this.beerService = beerService;
	}


	@GetMapping({"/{beerId}"})
	public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID beerId){
		
		System.out.println(beerId.toString());
		return new ResponseEntity<>(beerService.getBeerById(beerId),HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<BeerDTO> handlePost(@RequestBody BeerDTO beerDTO) {
		
		BeerDTO savedBeer = beerService.saveBeer(beerDTO);
		HttpHeaders headers = new HttpHeaders();
		
		//ToDo add host name to URL
		headers.add("Location", "/api/v1/beer " + savedBeer.getId().toString() );
		
		return new ResponseEntity<BeerDTO>(headers, HttpStatus.CREATED);
		
	}
	
	@PutMapping({"/{beerId}"})
	public ResponseEntity<BeerDTO> handleUpdate (@PathVariable("beerId") UUID beerId,@RequestBody BeerDTO beerDTO){
	
		beerService.updateBeer(beerId,beerDTO);
		
		return new ResponseEntity<BeerDTO>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping({"/{beerId}"})
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteBeer(@PathVariable("beerId") UUID beerId) {
		beerService.deleteBeer(beerId);
	}
}
