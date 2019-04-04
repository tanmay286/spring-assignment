package com.capgemini.spring.test;

import com.capgemini.spring.messagerenderer.*;
import com.capgemini.spring.provider.*;
import org.springframework.context.*;
import org.springframework.context.support.*;

public class Test
{
	public static void main(String arg[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		MessageRenderer renderer = context.getBean(MessageRenderer.class);

		renderer.render();
	}
}