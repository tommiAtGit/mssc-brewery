package com.myproject.java.spring.msscbrewery.web.model.V2;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTOV2 {
	private UUID id;
	private String beerName;
	public BeerStyleEnum beerStyle;
	private Long upc;
}
