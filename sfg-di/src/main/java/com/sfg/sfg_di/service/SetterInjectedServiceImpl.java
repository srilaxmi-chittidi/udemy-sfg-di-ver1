package com.sfg.sfg_di.service;

public class SetterInjectedServiceImpl implements GreetingService {

	
	@Override
	public String sayHello(String greetings) {
		
		return "Hello setter - "+greetings+" !!!";
	}

}
