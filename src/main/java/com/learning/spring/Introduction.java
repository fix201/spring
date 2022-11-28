package com.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Introduction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DependencyInjection di = context.getBean("dependencyInjection", DependencyInjection.class);

	}

}
