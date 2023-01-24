package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		
		Employee emp =(Employee) context.getBean("emp");
		
		System.out.println(emp);
		
		
	}

}
