package com.vineet.airport.info.api.model;

public class AirportInfo extends BaseEntity {

	private static final long serialVersionUID = -4359039750118706178L;
	
	private String term;
	private Airport airport;
	private Country country;
	private State state;
	private Continent continent;

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "AirportInfo [term=" + term + ", airport=" + airport + ", country=" + country + ", state=" + state
				+ ", continent=" + continent + "]";
	}

}
