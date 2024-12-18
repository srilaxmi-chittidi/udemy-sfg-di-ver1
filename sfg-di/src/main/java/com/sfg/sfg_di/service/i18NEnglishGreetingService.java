package com.sfg.sfg_di.service;


public class i18NEnglishGreetingService implements GreetingService{

	@Override
	public String sayHello(String greetings) {
		return greetings+ "from i18 English Service -EN";
	}

}
