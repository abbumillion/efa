package com.app.efa.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressModel {
	// city name
	private String city;

	// state name
	private String state;

	// country name
	private String country;

}
