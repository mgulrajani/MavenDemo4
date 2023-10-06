package com.training.springframeworkdemos;

import org.springframework.beans.factory.annotation.Autowired;

public class App {
	//Greeting greeting = new Greeting() --we ourselves creates 
	@Autowired
	private Greeting greeting;
	
	//how spring will pick up the implementation class of Greeting
	//we have to configuration  --xml or annotation
	//spring bean of greeting which container has to provide
	public void performGreeting(String name) {
		greeting.greet(name);
		
	}

}
