package com.training.springframeworkdemos;

public class GreetingImpl implements Greeting {

	@Override
	public void greet(String name) {
		System.out.println("Hello "+name);
		
	}
	

}
