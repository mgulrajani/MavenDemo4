package com.training.springframeworkdemos;

public class Engine {
	
	private int capacity;
	private int cyclinders;
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getCyclinders() {
		return cyclinders;
	}
	public void setCyclinders(int cyclinders) {
		this.cyclinders = cyclinders;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", cyclinders=" + cyclinders + "]";
	}
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(int capacity, int cyclinders) {
		super();
		this.capacity = capacity;
		this.cyclinders = cyclinders;
	}
	

}
