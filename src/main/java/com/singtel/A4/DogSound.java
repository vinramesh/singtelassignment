package com.singtel.A4;

import com.singtel.IF.SoundBehaviourIF;

public class DogSound implements SoundBehaviourIF{

	public String sound(){
		System.out.println("Woof, woof");
		return "Woof, woof";
	}
	
	

}
