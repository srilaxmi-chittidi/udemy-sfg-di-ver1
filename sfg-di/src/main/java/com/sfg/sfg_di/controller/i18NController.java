package com.sfg.sfg_di.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.sfg.sfg_di.service.GreetingService;

@Controller
public class i18NController {

	
	private GreetingService service;

	public i18NController(@Qualifier("i18NService") GreetingService service) {
		this.service = service;
	}
	public String sayHello(String greetings) {
		return service.sayHello(greetings);
	}
}
