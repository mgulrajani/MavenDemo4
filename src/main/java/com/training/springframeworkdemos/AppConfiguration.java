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
	
	
	@Bean
	public Engine getEngine() {
		return new Engine();
	}
	
	@Bean
	public Car getCar() {
		
		return new Car();
	}
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		App bean= context.getBean(App.class);
		
		Car car =  context.getBean(Car.class);
		car.getEngine().setCapacity(10);
		car.getEngine().setCyclinders(10);
		
		System.out.println(car.getEngine());
		bean.performGreeting("java");
		
	}

}
