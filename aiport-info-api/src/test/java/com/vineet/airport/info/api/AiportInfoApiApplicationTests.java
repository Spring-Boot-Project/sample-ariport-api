package com.vineet.airport.info.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.vineet.airport.info.api.model.AirportInfo;
import com.vineet.airport.info.api.model.CountryInfo;
import com.vineet.airport.info.api.model.StatesInfo;

@SpringBootTest
class AiportInfoApiApplicationTests {
	
	@Autowired
	private RestTemplate restTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	public void testAirportInfo() {
		String baseUrl = "http://localhost:8080/api/v1/airport/iataCode=LON";
		ResponseEntity<AirportInfo> response= restTemplate.postForEntity(baseUrl,null, AirportInfo.class);
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
	}
	
	@Test
	public void testGetCountries() {
		String baseUrl = "http://localhost:8080/api/v1/airport/countries?field_name=name";
		ResponseEntity<CountryInfo> response= restTemplate.postForEntity(baseUrl,null, CountryInfo.class);
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
	}
	
	@Test
	public void testGetStates() {
		String baseUrl = "http://localhost:8080/api/v1/states?country=IN";
		ResponseEntity<StatesInfo> response= restTemplate.postForEntity(baseUrl,null, StatesInfo.class);
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
	}
	
}
