package com.capgemini.spring.test;

import com.capgemini.spring.organization.*;
import org.springframework.context.*;
import org.springframework.context.support.*;

public class TestAnnotation{

	public static void main(String args[]){
	
		ApplicationContext context = new ClassPathXmlApplicationContext("index.xml");
		OrganizationAnnotation organization =context.getBean(OrganizationAnnotation.class);
		System.out.println("Welcome to organization");
		System.out.println(organization.toString());
	}

}