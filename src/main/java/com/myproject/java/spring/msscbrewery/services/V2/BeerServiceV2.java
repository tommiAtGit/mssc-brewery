package com.myproject.java.spring.msscbrewery.services.V2;

import java.util.UUID;

import com.myproject.java.spring.msscbrewery.web.model.V2.BeerDTOV2;

public interface BeerServiceV2 {
	BeerDTOV2 getBeerById(UUID beerId);

	BeerDTOV2 saveBeer(BeerDTOV2 beerDTO);

	void updateBeer(UUID beerId, BeerDTOV2 beerDTO);

	void deleteBeer(UUID beerId);
}
