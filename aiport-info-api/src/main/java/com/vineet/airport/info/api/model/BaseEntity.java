package com.vineet.airport.info.api.model;

import java.io.Serializable;

public class BaseEntity implements Serializable{

	private static final long serialVersionUID = -5110093431646967678L;
	
	private Boolean status;
	private int statusCode;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public String toString() {
		return "BaseEntity [status=" + status + ", statusCode=" + statusCode + "]";
	}

}
