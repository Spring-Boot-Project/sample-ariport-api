package com.vineet.airport.info.api.model;

import java.util.List;

public class CountryInfo extends BaseEntity {
	
	private static final long serialVersionUID = -5218670179332533688L;
	
	private List<Country> countries;

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

}
