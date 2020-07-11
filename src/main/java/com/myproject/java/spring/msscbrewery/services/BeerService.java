package com.myproject.java.spring.msscbrewery.services;

import java.util.UUID;

import com.myproject.java.spring.msscbrewery.web.model.BeerDTO;

public interface BeerService {

	BeerDTO getBeerById(UUID beerId);

}
