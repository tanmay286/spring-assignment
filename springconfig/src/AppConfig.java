package com.capgemini.spring.appconfig;

import org.springframework.stereotype.Service;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.messagerenderer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
	 // For Constructor  with java Config
/* 	@Bean
 	public MessageRenderer renderer()
	{
 		return new MessageRenderer(new HiMessageProvider());
 	}
*/
 	// For SetterAnnotation with java Config

	 
	@Bean
	 public MessageRenderer renderer()
	{
		MessageRenderer renderer = new  MessageRenderer();
 		renderer.setMessageProvider(new GMMessageProvider());
 		return renderer;
 	}

}