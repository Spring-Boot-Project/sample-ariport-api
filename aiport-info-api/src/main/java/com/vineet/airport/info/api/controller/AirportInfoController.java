package com.vineet.airport.info.api.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vineet.airport.info.api.model.AirportInfo;
import com.vineet.airport.info.api.model.CountryInfo;
import com.vineet.airport.info.api.model.StatesInfo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/api/v1")
public class AirportInfoController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@ApiOperation(value="Get the airport info matching the iata code.")
	@ApiResponses(value= {
			@ApiResponse(code =200, message="Request completed successfully"),
			@ApiResponse(code =401, message="Unauthorized Access"),
			@ApiResponse(code =403, message="Access is Forbidden for this URL"),
			@ApiResponse(code =404, message="Resource Requested Not found"),
			@ApiResponse(code =500, message="Fail to submit the Request to the API")
	})
	@PostMapping("/airport")
	public ResponseEntity<AirportInfo> getAirportInfo(@RequestBody String iataCode) throws URISyntaxException {
		
		String baseUrl = "https://www.air-port-codes.com/api/v1/single?iata="+iataCode;
		URI uri = new URI(baseUrl);
		
		ResponseEntity<AirportInfo> response  = restTemplate.postForEntity(uri, null, AirportInfo.class);
		
		return response;
		
	}
	
	@ApiOperation(value="Get list of all countries")
	@ApiResponses(value= {
			@ApiResponse(code =200, message="Request completed successfully"),
			@ApiResponse(code =401, message="Unauthorized Access"),
			@ApiResponse(code =403, message="Access is Forbidden for this URL"),
			@ApiResponse(code =404, message="Resource Requested Not found"),
			@ApiResponse(code =500, message="Fail to submit the Request to the API")
	})
	@PostMapping("/countries")
	public ResponseEntity<CountryInfo> getCountries(@RequestBody String fieldName) throws URISyntaxException {
		
		String baseUrl = "https://www.air-port-codes.com/api/v1/countries?field_name="+fieldName;
		URI uri = new URI(baseUrl);
		 
		ResponseEntity<CountryInfo> response  = restTemplate.postForEntity(uri, null, CountryInfo.class);
		
		return response;
		
	}
	
	@ApiOperation(value="Get all states in a country")
	@ApiResponses(value= {
			@ApiResponse(code =200, message="Request completed successfully"),
			@ApiResponse(code =401, message="Unauthorized Access"),
			@ApiResponse(code =403, message="Access is Forbidden for this URL"),
			@ApiResponse(code =404, message="Resource Requested Not found"),
			@ApiResponse(code =500, message="Fail to submit the Request to the API")
	})
	@PostMapping("/states")
	public ResponseEntity<StatesInfo> getStates(@RequestBody String country) throws URISyntaxException {
		
		String baseUrl = "https://www.air-port-codes.com/api/v1/states?country="+country;
		URI uri = new URI(baseUrl);
		 
		ResponseEntity<StatesInfo> response  = restTemplate.postForEntity(uri, null, StatesInfo.class);
		
		return response;
		
	}
	
	

}
