package com.sfg.sfg_di.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sfg.sfg_di.service.GreetingServiceImpl;

class SetterInjectedControllerTest {

	SetterInjectedController controller ;
	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void test() {
		controller.sayHello("From Setter Injecting");
	}

}
