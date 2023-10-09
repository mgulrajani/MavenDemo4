package com.training.springframeworkdemos;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	private long id;
	private String manufacturer;
	private String model;
	private double price;
	@Autowired
	private Engine engine;
	public Car(long id, String manufacturer, String model, double price, Engine engine) {
		super();
		this.id = id;
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", price=" + price
				+ ", engine=" + engine + "]";
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}
