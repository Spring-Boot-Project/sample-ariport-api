package com.vineet.airport.info.api.model;

public class State {

	private String abbr;
	private String name;
	private String region;
	private String type;

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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "State [abbr=" + abbr + ", name=" + name + ", region=" + region + ", type=" + type + "]";
	}

}
