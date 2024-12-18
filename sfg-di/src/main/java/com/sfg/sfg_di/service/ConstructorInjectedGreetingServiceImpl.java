package com.sfg.sfg_di.service;

public class ConstructorInjectedGreetingServiceImpl implements GreetingService{

	@Override
	public String sayHello(String greetings) {
		return "Hello - constructor" + greetings+" !!!";
	}

}
