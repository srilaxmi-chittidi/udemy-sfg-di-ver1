package com.sfg.sfg_di.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycleDemo implements InitializingBean,BeanNameAware,BeanFactoryAware,DisposableBean, ApplicationContextAware {

	// InitializingBean
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After Proeprties Set");
	}
	//BeanNameAware
	@Override
	public void setBeanName(String name) {
		System.out.println("Set Bean Name");
	}
	//BeanFactoryAware
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Bean Factory ");
	}
	//DisposableBean
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method");
	}
	//ApplicationContextAware
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Application context method");
	}
	
	public void beforeInit(){
	    System.out.println("## - Before Init - Called by Bean Post Processor");
	}

	public void afterInit(){
	    System.out.println("## - After init called by Bean Post Processor");
	}
}
