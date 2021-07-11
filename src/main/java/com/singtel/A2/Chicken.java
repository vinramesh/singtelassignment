package com.singtel.A2;

import com.singtel.A1.Bird;
import com.singtel.IF.FlyBehaviourIF;
import com.singtel.IF.SoundBehaviourIF;

public class Chicken extends Bird implements SoundBehaviourIF,FlyBehaviourIF{

	public String sound() {
		// TODO Auto-generated method stub
		System.out.println("Cluck, cluck");
		return "Cluck, cluck";
		
	}

	public String fly() {
			System.out.println("I cant Fly");
			return "I cant Fly";
	}

}
