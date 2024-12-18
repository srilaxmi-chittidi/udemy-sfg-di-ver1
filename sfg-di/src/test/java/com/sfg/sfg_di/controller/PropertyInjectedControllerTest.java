package com.sfg.sfg_di.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sfg.sfg_di.service.GreetingServiceImpl;

class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new PropertyInjectedController();
		controller.service = new GreetingServiceImpl();
	}

	@Test
	void testSayHello() {
		System.out.println(controller.sayHello("From Property"));
	}

}
