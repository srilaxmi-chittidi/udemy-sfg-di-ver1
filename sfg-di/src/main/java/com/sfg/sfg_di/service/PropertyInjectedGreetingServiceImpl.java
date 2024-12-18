package com.sfg.sfg_di.service;

public class PropertyInjectedGreetingServiceImpl implements GreetingService {

	@Override
	public String sayHello(String greetings) {
		return "Hello  proeprty - "+greetings+" !!!";
	}

}
