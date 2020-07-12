package com.myproject.java.spring.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.myproject.java.spring.msscbrewery.web.model.BeerDTO;
import com.myproject.java.spring.msscbrewery.web.model.CustomerDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDTO getBeerById(UUID beerId) {
		return BeerDTO.builder().id(UUID.randomUUID())
				.beerName("Sol")
				.beerStyle("Lager")
				.build();
	}

	public BeerDTO saveBeer(BeerDTO beerDTO) {
		return BeerDTO.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDTO beerDTO) {
		log.debug("Update beer stub");
		
		
	}

	@Override
	public void deleteBeer(UUID beerId) {
		log.debug("Delete beer stub");
		
	}

}
