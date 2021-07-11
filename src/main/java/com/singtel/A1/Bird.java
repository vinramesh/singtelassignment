package com.singtel.A1;

public class Bird extends Animal{
	
	@Override
	public String walk(){
		System.out.println("I am walking");
		return "I am walking";
	}
	
	public String sing(){
		System.out.println("I am singing");
		return "I am singing";
	}

}
