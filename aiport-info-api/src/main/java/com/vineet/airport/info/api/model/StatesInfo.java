package com.vineet.airport.info.api.model;

import java.util.List;

public class StatesInfo extends BaseEntity {
	
	private static final long serialVersionUID = -175932523209386293L;
	
	private String district_type;
	private List<State> states;
	
	public String getDistrict_type() {
		return district_type;
	}
	public void setDistrict_type(String district_type) {
		this.district_type = district_type;
	}
	public List<State> getStates() {
		return states;
	}
	public void setStates(List<State> states) {
		this.states = states;
	}
	@Override
	public String toString() {
		return "StatesInfo [district_type=" + district_type + ", states=" + states + "]";
	}
	
}
