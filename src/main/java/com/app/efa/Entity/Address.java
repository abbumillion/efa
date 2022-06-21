package com.app.efa.Entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	// city name
	@Column(nullable = false, unique = false, length = 30)
	private String city;

	// state name
	@Column(nullable = false, unique = false, length = 30)
	private String state;

	// country name
	@Column(nullable = false, unique = false, length = 30)
	private String country;

}
