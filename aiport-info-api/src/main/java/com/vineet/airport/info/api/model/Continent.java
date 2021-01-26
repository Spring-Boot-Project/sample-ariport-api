package com.vineet.airport.info.api.model;

public class Continent {

	private String abbr;
	private String name;

	public String getAbbr() {
		return abbr;
	}

	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Continent [abbr=" + abbr + ", name=" + name + "]";
	}

}
