package com.singtel.B1;

import com.singtel.IF.FishBehaviourIF;

public class ClownfishBehaviour implements FishBehaviourIF {

	public String color() {
		System.out.println("Clownfish are small and colorful");
		return "Clownfish are small and colorful";
	}


	public String behaviour() {
		System.out.println("Clownfish make jokes");
		return "Clownfish make jokes";
	}
}
