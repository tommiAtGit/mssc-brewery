package com.myproject.java.spring.msscbrewery.web.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
	
	@Null
	private UUID id;
	
	@NotBlank
	private String beerName;
	
	@NotBlank
	private String beerStyle;
	
	@Positive
	private Long upc;
}
