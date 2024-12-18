package com.sfg.sfg_di.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanPostProcessorDemo implements BeanPostProcessor{

	@Override
	public 	Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof BeanLifeCycleDemo) {
			((BeanLifeCycleDemo)bean).beforeInit();
		}
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof BeanLifeCycleDemo) {
			((BeanLifeCycleDemo)bean).afterInit();
		}
		return bean;
	}
}
