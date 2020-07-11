package com.myproject.java.spring.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.myproject.java.spring.msscbrewery.web.model.BeerDTO;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDTO getBeerById(UUID beerId) {
		return BeerDTO.builder().id(UUID.randomUUID())
				.beerName("Sol")
				.beerStyle("Lager")
				.build();
	}

}
