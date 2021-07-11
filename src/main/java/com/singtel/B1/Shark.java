package com.singtel.B1;

import com.singtel.IF.FishBehaviourIF;

public class Shark extends Fish {

	private FishBehaviourIF  fishBehaviourIF; 
	
	public void setFishBehaviour(FishBehaviourIF fishBehaviour) {
		this.fishBehaviourIF = fishBehaviour;
	}
	
	@Override
	public String sing() {
		// TODO Auto-generated method stub
		System.out.println("Sharks don’t sing");
		return "Sharks don’t sing";
	}

	@Override
	public String swim() {
		// TODO Auto-generated method stub
		System.out.println("Sharks can swim");
		return "Sharks can swim";
	}

	@Override
	public String walk() {
		// TODO Auto-generated method stub
		System.out.println("Sharks don't walk");
		return "Sharks don't walk";
	}

	public String color() {
		// TODO Auto-generated method stub
		return fishBehaviourIF.color();
	}

	public String behaviour() {
		// TODO Auto-generated method stub
		return fishBehaviourIF.behaviour();
	}

}
