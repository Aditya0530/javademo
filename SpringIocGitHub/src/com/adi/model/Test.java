package com.adi.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
		Student st=(Student) ap.getBean("s");
		System.out.println(st);
	}
}
