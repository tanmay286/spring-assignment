package com.capgemini.spring.messagerenderer;
import org.springframework.stereotype.*;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.*;



public class MessageRenderer
{
	private MessageProvider messageProvider;

	//For Construtor
/*
	public MessageRenderer(MessageProvider messageProvider)
	{
		this.messageProvider=messageProvider;
	}
*/
	//For Setter

	public void setMessageProvider(MessageProvider messageProvider)
	{
		this.messageProvider=messageProvider;      
	}

	public void render()
	{
		System.out.println(messageProvider.getMessage()); 
	}
}