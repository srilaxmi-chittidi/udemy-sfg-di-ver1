package com.sfg.sfg_di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.sfg.sfg_di.service.ConstructorInjectedGreetingServiceImpl;
import com.sfg.sfg_di.service.GreetingServiceImpl;
import com.sfg.sfg_di.service.PropertyInjectedGreetingServiceImpl;
import com.sfg.sfg_di.service.SetterInjectedServiceImpl;
import com.sfg.sfg_di.service.i18NEnglishGreetingService;
import com.sfg.sfg_di.service.i18NSpanishGreetingService;

@Configuration
public class GreetingServiceConfig {

	@Bean
	SetterInjectedServiceImpl setterInjectedServiceImpl() {
		return new SetterInjectedServiceImpl();
	}
	
	@Bean
	PropertyInjectedGreetingServiceImpl propertyInjectedGreetingServiceImpl() {
		return new PropertyInjectedGreetingServiceImpl();
	}
	
	@Bean
	ConstructorInjectedGreetingServiceImpl constructorInjectedGreetingServiceImpl() {
		return new ConstructorInjectedGreetingServiceImpl();
	}
	
	@Primary
	@Bean
	GreetingServiceImpl greetingServiceImpl() {
		return new GreetingServiceImpl();
	}
	@Profile({"EN","default"})
	@Bean
	i18NEnglishGreetingService i18NService() {
		return new i18NEnglishGreetingService();
	}
	@Profile("ES")
	@Bean("i18NService")
	i18NSpanishGreetingService i18NSpanishService() {
		return new i18NSpanishGreetingService();
	}
}
