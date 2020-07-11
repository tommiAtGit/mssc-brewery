package com.myproject.java.spring.msscbrewery.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDTO {
	
	private UUID id;
	private String firstName;
	private String lastName;
	private String Address;
	private String eMail;

}
