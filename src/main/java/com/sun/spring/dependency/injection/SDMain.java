package com.sun.spring.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SDMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dependencyinjection/setter-di-config.xml");
		Controller controller = context.getBean("controller", Controller.class);
		System.out.println("Controller "+controller);
		System.out.println("Controller Associated Service Class "+controller.getService());
	}
}
