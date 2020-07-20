package com.myproject.java.spring.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.myproject.java.spring.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID())
				.beerName("Sol")
				.beerStyle("Lager")
				.build();
	}

	public BeerDto saveBeer(BeerDto beerDTO) {
		return BeerDto.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDto beerDTO) {
		log.debug("Update beer stub");
		
		
	}

	@Override
	public void deleteBeer(UUID beerId) {
		log.debug("Delete beer stub");
		
	}

}
