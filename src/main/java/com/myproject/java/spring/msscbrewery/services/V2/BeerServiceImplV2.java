package com.myproject.java.spring.msscbrewery.services.V2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.myproject.java.spring.msscbrewery.web.model.V2.BeerDTOV2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImplV2 implements BeerServiceV2 {
	@Override
	public BeerDTOV2 getBeerById(UUID beerId) {
		return BeerDTOV2.builder().id(UUID.randomUUID())
				.beerName("Sol")
				.build();
	}

	public BeerDTOV2 saveBeer(BeerDTOV2 beerDTO) {
		return BeerDTOV2.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDTOV2 beerDTO) {
		log.debug("Update beer stub");
		
		
	}

	@Override
	public void deleteBeer(UUID beerId) {
		log.debug("Delete beer stub");
		
	}
}
