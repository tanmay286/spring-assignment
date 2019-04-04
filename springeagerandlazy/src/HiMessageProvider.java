package com.capgemini.spring.provider;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

//Only one will use in Construtor with annotation
//@Component("HM")
public class HiMessageProvider implements MessageProvider
{
	
	public String getMessage()
	{
		return "Hi Message Provder";
	}
} 