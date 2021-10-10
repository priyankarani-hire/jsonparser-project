package com.poc.poconjwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@ComponentScan("com.dell.api.jwt")
@RestController
public class PoconjwtController {
	
	//@Autowired
	//private PoconjwtAuthorization poconjwtAuthorization;
	
	private String token;

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name,
			@RequestParam(value = "psw", defaultValue = "World") String psw) {
		
		////token = poconjwtAuthorization.getAuthorization(name, psw);
		
	return String.format("Hello %s!", name);
	}

}
