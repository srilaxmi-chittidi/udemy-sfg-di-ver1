package com.sfg.sfg_di.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class SingletonBean {

	public SingletonBean() {
		System.out.println("Creating singleton bean....");
	}
	
	public String getBeanDetails() {
		return "From  singleton";
	}
}
