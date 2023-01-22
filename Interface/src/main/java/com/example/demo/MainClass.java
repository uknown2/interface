package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
		
		Triangle t = (Triangle) context.getBean("demo");
		
		System.out.println(t.getName().getA()+ " " +t.getYourname().getA());
		System.out.print(t.getName().getB()+ " " +t.getYourname().getB());

	}

}
