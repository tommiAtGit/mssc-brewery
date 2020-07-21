package com.myproject.java.spring.msscbrewery.web.mappers;

import org.mapstruct.Mapper;

import com.myproject.java.spring.msscbrewery.domain.Beer;
import com.myproject.java.spring.msscbrewery.web.model.BeerDto;

@Mapper
public interface BeerMapper {

	 BeerDto beerToBeerDto(Beer beer);

	 Beer beerDtoToBeer(BeerDto dto);
}
