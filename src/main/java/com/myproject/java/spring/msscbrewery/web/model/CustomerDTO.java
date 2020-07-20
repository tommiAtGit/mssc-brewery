package com.myproject.java.spring.msscbrewery.web.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
	
	private UUID id;
	@NotBlank
	@Size(min = 3, max = 20)
	private String firstName;
	@NotBlank
	@Size(min = 3, max = 50)
	private String lastName;
	private String Address;
	private String eMail;

}
