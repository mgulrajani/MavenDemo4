package com.training.demos.MavenDemo4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorSpec {
//A A A
	//Arrange --we need Calculator object
	
	private Calculator calculator;
	
	@BeforeEach
	public void befEach() {
		//Arrange part 
		calculator=new Calculator(4,4);
		System.out.println("before each test calculator object is created..");
		
	}
	
	@AfterEach
	public void aftEach() {
		calculator=null;
		System.out.println("after test is done");
	}
	
	//1st test to add numbers and test the add method of the calculator class
	@Test
	public void testAddOfCalculator() {
		//what is the Act part ?
		//action -- what I want to test is add
		int actualResult = calculator.add(5, 5);
		
		//what is third A ? Assert 
		assertEquals(10, actualResult);
		
		
		
		
	}
	//2nd test method to test multiplication of Calculator class
	@Test
	public void testMultiply() {
		//Arrange  is done in BeforeEach
		
		//Act  
		int actualResult =  calculator.multiply(5, 5);
		
		//Assert
		
		assertEquals(25, actualResult);
		
		
	}
	
	
}
