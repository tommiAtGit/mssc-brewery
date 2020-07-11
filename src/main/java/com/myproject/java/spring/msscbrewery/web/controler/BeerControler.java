package com.myproject.java.spring.msscbrewery.web.controler;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
