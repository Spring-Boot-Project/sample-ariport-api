package com.vineet.airport.info.api.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class AppConfig {
	
	@Value("${apc.auth}")
	private String apcAuth;
	
	@Value("${apc.auth.secret}")
	private String apcAuthSecret;

	@Bean
	public RestTemplate restTemplate() {
		return setHeaderForAllRequest(new RestTemplate());
	}

	private RestTemplate setHeaderForAllRequest(RestTemplate restTemplate) {
		restTemplate.getInterceptors().add(new ClientHttpRequestInterceptor() {
			@Override
			public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
					throws IOException {
				MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
				map.add("Content-Type", "application/json");
				map.add("Accept", "application/json");
				map.add("APC-Auth", apcAuth);
				map.add("APC-Auth-Secret", apcAuthSecret);

				request.getHeaders().putAll(map);
				return execution.execute(request, body);
			}
		});

		return restTemplate;

	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}

}
