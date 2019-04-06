package com.capgemini.spring.test;

import com.capgemini.spring.organization.*;
import com.capgemini.spring.config.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig{

	public static void main(String args[]){

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		OrganizationConfig org = context.getBean(OrganizationConfig.class);
		System.out.println("Welcome to organization");
		System.out.println(org);
	}

}