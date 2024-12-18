package com.sfg.sfg_di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.sfg.sfg_di.service.GreetingService;

@Controller
public class ConstructorInjectedController {

	
	private final GreetingService service;
	
	@Autowired
	ConstructorInjectedController(@Qualifier("constructorInjectedGreetingServiceImpl") GreetingService service){
		this.service = service;
	}
	
	public String sayHello(String greetings) {
		return service.sayHello(greetings);
	}
}
