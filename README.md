# sample-ariport-api
#Usage:

An REST API is developed using Spring Boot to 
1) Find airport details based on iata code 
2) Find countries and their ISO by field_name
3) Find states by country code

#Endpoints

URL							Method		Request Param 		Result
{host}/api/v1/single		POST		iata=LON			Finds a single airport matching an airport IATA code
{host}/api/v1/countries		POST		field_name=name		Retrieves all countries and their ISO
{host}/api/v1/states		POST		country=IN			Retrieves all districts (states/provinces) of any country


This can be tested using PORTMAN or similar tool, however i have integrated a swagger URL(http://localhost:8080/swagger-ui.html) for ease which can be accessed post starting the application.
