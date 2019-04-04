package com.capgemini.spring.test;

import com.capgemini.spring.messagerenderer.*;
import com.capgemini.spring.provider.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
import com.capgemini.spring.appconfig.*;
import org.springframework.context.annotation.*;
import com.capgemini.spring.renderer.*;

public class TestAnnotation
{
	public static void main(String arg[])
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageRendererConfig.class);
		
		System.out.println("Object Is Created");
	
		MessageRenderer renderer = context.getBean(MessageRenderer.class);

		renderer.render();
	}
}