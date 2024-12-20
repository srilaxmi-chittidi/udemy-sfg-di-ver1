package com.sfg.sfg_di.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.sfg.pets.service.PetService;
import com.sfg.pets.service.PetServiceFactory;
import com.sfg.sfg_di.repository.EnglishGreetingRepository;
import com.sfg.sfg_di.repository.EnglishGreetingRepositoryImpl;
import com.sfg.sfg_di.repository.FakeDataSource;
import com.sfg.sfg_di.service.ConstructorInjectedGreetingServiceImpl;
import com.sfg.sfg_di.service.GreetingServiceImpl;
import com.sfg.sfg_di.service.PropertyInjectedGreetingServiceImpl;
import com.sfg.sfg_di.service.i18NEnglishGreetingService;
import com.sfg.sfg_di.service.i18NSpanishGreetingService;

@ImportResource("classpath:sfg-config.xml")
@Configuration
public class GreetingServiceConfig {

	@Bean
	FakeDataSource fakeDataSource(@Value("${db.userName}") String userName,
									@Value("${db.password}")	String password,
									@Value("${db.datasourceUrl}") String datasourceUrl) {
		FakeDataSource fakeDB = new FakeDataSource();
		fakeDB.setUserName(userName);;
		fakeDB.setPassword(password);
		fakeDB.setDatasourceUrl(datasourceUrl);
		return fakeDB;
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
	@Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }
	@Profile({"EN","default"})
	@Bean
	i18NEnglishGreetingService i18NService(EnglishGreetingRepository englishGreetingRepo) {
		return new i18NEnglishGreetingService(englishGreetingRepo);
	}
	@Profile("ES")
	@Bean("i18NService")
	i18NSpanishGreetingService i18NSpanishService() {
		return new i18NSpanishGreetingService();
	}
	
	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}
	
	@Profile({"Dog","default"})
	@Bean
	PetService dogService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("Dog");
	}
	
	@Bean("Cat")
	PetService catService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("Cat");
	}
}
