package com.vineet.airport.info.api.model;

public class Airport {

	private String name;
	private String city;
	private String iata;
	private String full_location;
	private String type;
	private String latitude;
	private String longitude;
	private String elevation;
	private String website;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getFull_location() {
		return full_location;
	}

	public void setFull_location(String full_location) {
		this.full_location = full_location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getElevation() {
		return elevation;
	}

	public void setElevation(String elevation) {
		this.elevation = elevation;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "AirportDetail [name=" + name + ", city=" + city + ", iata=" + iata + ", full_location=" + full_location
				+ ", type=" + type + ", latitude=" + latitude + ", longitude=" + longitude + ", elevation=" + elevation
				+ ", website=" + website + "]";
	}

}
