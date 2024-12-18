package com.sfg.sfg_di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sfg.sfg_di.service.GreetingService;

@Controller
public class MyController {

	@Autowired
	private GreetingService service;
	
	public String sayHello(String greetings) {
		return service.sayHello(greetings);
	}
}
