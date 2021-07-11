package com.singtel.B1;

import com.singtel.IF.FishBehaviourIF;

public class Clownfish extends Fish{
	
	private FishBehaviourIF fishBehaviourIF;

	public void setFishBehaviour(FishBehaviourIF fishBehaviour) {
		this.fishBehaviourIF = fishBehaviour;
	}	
	@Override
	public String sing() {
		System.out.println("Clownfish don’t sing");
		return "Clownfish don’t sing";
	}

	@Override
	public String swim() {
		System.out.println("Clownfish can swim");
		return "Clownfish can swim";
	}

	@Override
	public String walk() {
		System.out.println("Clownfish don't walk");
		return "Clownfish don't walk";
	}
	
	public String getFishColor(){
		return fishBehaviourIF.color();
	}
	
	public String getFishBehaviour(){
		return fishBehaviourIF.behaviour();
	}

}
