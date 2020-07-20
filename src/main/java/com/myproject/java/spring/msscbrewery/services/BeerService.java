package com.myproject.java.spring.msscbrewery.services;

import java.util.UUID;

import com.myproject.java.spring.msscbrewery.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);

	BeerDto saveBeer(BeerDto beerDTO);

	void updateBeer(UUID beerId, BeerDto beerDTO);

	void deleteBeer(UUID beerId);

}
