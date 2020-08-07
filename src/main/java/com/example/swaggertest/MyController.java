package com.example.swaggertest;

import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {


	@PostMapping(path = "/tokens", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public ResponseEntity<String> tokens(@ApiParam(name = "grant_type", value = "hatseflats") @RequestParam String grantType, @ApiParam("request_token") @RequestParam String requestToken) throws Exception {
		System.out.println("grant_type: " + grantType);
		System.out.println("request_token: " + requestToken);
		return new ResponseEntity<String>("Thank you for submitting the form", HttpStatus.OK);
	}
}
