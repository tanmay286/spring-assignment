package com.capgemini.spring.renderer;

import org.springframework.context.annotation.*;
import com.capgemini.spring.messagerenderer.*;
import com.capgemini.spring.provider.*;


@Lazy
@Configuration
 public class MessageRendererConfig{


	@Bean
	public MessageRenderer config(){
		System.out.println("In bean");
		MessageRenderer render =  new MessageRenderer();
		render.setMessageProvider(new GMMessageProvider());
		return render;
	}

}