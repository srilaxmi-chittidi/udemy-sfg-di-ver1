package com.sfg.sfg_di.service;

import com.sfg.sfg_di.repository.EnglishGreetingRepository;

public class i18NEnglishGreetingService implements GreetingService{

	private final EnglishGreetingRepository englishGreetingRepo;
	
	 public i18NEnglishGreetingService(EnglishGreetingRepository englishGreetingRepo) {
	        this.englishGreetingRepo = englishGreetingRepo;
	    } 
	@Override
	public String sayHello(String greetings) {
		return englishGreetingRepo.getGreetings();
	}

}
