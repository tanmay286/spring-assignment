package com.capgemini.spring.messagerenderer;
import org.springframework.stereotype.*;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class MessageRenderer
{
	//5 Point
	@Autowired
	private MessageProvider messageProvider;

/*
	@Autowired
        @Qualifier("HM")
	public void setMessageProvider(MessageProvider messageProvider)
	{
		this.messageProvider=messageProvider;      //1,3 point
	}

	 public void render()
	{
		System.out.println(messageProvider.getMessage()); //2,4 point
	}
	
	@Autowired
	public MessageRenderer(MessageProvider messageProvider)
	{
		this.messageProvider=messageProvider;
	}
*/
	public void render()
	{
		System.out.println(messageProvider.getMessage()); 
	}
}