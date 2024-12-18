package com.sfg.sfg_di.service;

public class i18NSpanishGreetingService implements GreetingService{

	@Override
	public String sayHello(String greetings) {
		return greetings+ "from i18 Spanish Service -ES";
	}

}
