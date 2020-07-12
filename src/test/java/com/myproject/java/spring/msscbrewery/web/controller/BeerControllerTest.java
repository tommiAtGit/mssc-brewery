package com.myproject.java.spring.msscbrewery.web.controller;

import java.util.UUID;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myproject.java.spring.msscbrewery.services.BeerService;
import com.myproject.java.spring.msscbrewery.web.controler.BeerControler;
import com.myproject.java.spring.msscbrewery.web.model.BeerDTO;

@RunWith(SpringRunner.class)
@WebMvcTest(BeerControler.class)
class BeerControllerTest {

	@MockBean
	BeerService beerService;
	@Autowired
	MockMvc mockMvc;
	@Autowired
	ObjectMapper objectMapper;

	BeerDTO validBeer;
	
	@Before 
	public void setup() {
		validBeer = BeerDTO.builder().id(UUID.randomUUID())
				.beerName("Budwiser")
				.beerStyle("Lager")
				.upc(12345678911L)
				.build();
	}
	
	@Test
	public void getBeer() throws Exception{
		
	
	}
	

	@Test
	public void handlePost() {
		
	}
	
	@Test
	public void handleUpdate() {
		
	}

}
