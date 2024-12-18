package com.sfg.sfg_di.service;

public class GreetingServiceImpl implements GreetingService {

	@Override
	public String sayHello(String greetings) {
		return "Hello  primary - "+greetings+" !!! ";
	}

}
