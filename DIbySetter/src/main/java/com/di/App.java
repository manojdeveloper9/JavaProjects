package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
		output.generateOutput();
		
		
	}

}
