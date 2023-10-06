package com.training.springframeworkdemos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	@Bean
	public GreetingImpl greetingImp() {
		return new GreetingImpl();
		
	}
	
	@Bean
	public App createApp() {
		return new App();
	}
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		App bean= context.getBean(App.class);
		
		bean.performGreeting("java");
		
	}

}
