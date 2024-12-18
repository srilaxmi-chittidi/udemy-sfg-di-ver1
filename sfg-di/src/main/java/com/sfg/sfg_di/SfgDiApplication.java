package com.sfg.sfg_di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sfg.sfg_di.controller.ConstructorInjectedController;
import com.sfg.sfg_di.controller.MyController;
import com.sfg.sfg_di.controller.PropertyInjectedController;
import com.sfg.sfg_di.controller.SetterInjectedController;
import com.sfg.sfg_di.controller.i18NController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		i18NController iController = (i18NController) ctx.getBean(i18NController.class);
		System.out.println(iController.sayHello(" iController "));
		
		MyController myController = (MyController) ctx.getBean(MyController.class);
		System.out.println(myController.sayHello("from my controller"));
		
		PropertyInjectedController propController  = (PropertyInjectedController) ctx.getBean(PropertyInjectedController.class);
		System.out.println(propController.sayHello("from property controller "));
	
		SetterInjectedController setterController = (SetterInjectedController) ctx.getBean(SetterInjectedController.class);
		System.out.println("My Setter Controller : "+setterController.sayHello("from setter controller"));
		
		ConstructorInjectedController constructorController = (ConstructorInjectedController) ctx.getBean(ConstructorInjectedController.class);
		System.out.println("My Constructor Controller : "+constructorController.sayHello("from constructor controller"));
		
		
	}

}
