package com.myproject.java.spring.msscbrewery.web.model;

import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {
	private UUID id;
	private String beerName;
	private String beerStyle;
	private Long upc;
}
