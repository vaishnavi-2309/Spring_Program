package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.SpringConfig;
import com.model.Calculator;

public class Test {
public static void main(String[] args) {
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Calculator c=ap.getBean("cal",Calculator.class);
		c.addition();
}

}
