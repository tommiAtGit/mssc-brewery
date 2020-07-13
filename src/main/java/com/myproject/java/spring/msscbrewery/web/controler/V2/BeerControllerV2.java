package com.myproject.java.spring.msscbrewery.web.controler.V2;

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.java.spring.msscbrewery.services.V2.BeerServiceV2;
import com.myproject.java.spring.msscbrewery.web.model.V2.BeerDTOV2;

@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {

	private final BeerServiceV2 beerService;
	
	
	public BeerControllerV2(BeerServiceV2 beerService) {
		this.beerService = beerService;
	}


	@GetMapping({"/{beerId}"})
	public ResponseEntity<BeerDTOV2> getBeer(@PathVariable("beerId") UUID beerId){
		
		System.out.println(beerId.toString());
		return new ResponseEntity<>(beerService.getBeerById(beerId),HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<BeerDTOV2> handlePost(@RequestBody BeerDTOV2 beerDTO) {
		
		BeerDTOV2 savedBeer = beerService.saveBeer(beerDTO);
		HttpHeaders headers = new HttpHeaders();
		
		//ToDo add host name to URL
		headers.add("Location", "/api/v2/beer " + savedBeer.getId().toString() );
		
		return new ResponseEntity<BeerDTOV2>(headers, HttpStatus.CREATED);
		
	}
	
	@PutMapping({"/{beerId}"})
	public ResponseEntity<BeerDTOV2> handleUpdate (@PathVariable("beerId") UUID beerId,@RequestBody BeerDTOV2 beerDTO){
	
		beerService.updateBeer(beerId,beerDTO);
		
		return new ResponseEntity<BeerDTOV2>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping({"/{beerId}"})
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteBeer(@PathVariable("beerId") UUID beerId) {
		beerService.deleteBeer(beerId);
	}

}
