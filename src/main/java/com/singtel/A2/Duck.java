package com.singtel.A2;

import com.singtel.A1.Bird;
import com.singtel.IF.FlyBehaviourIF;
import com.singtel.IF.SoundBehaviourIF;
import com.singtel.IF.SwimBehaviourIF;

public class Duck extends Bird implements SoundBehaviourIF, SwimBehaviourIF{

	public String sound() {
		// TODO Auto-generated method stub
		System.out.println("Quack, quack");
		return "Quack, quack";
	}

	public String swim() {
		// TODO Auto-generated method stub
		System.out.println("Duck can Swim");
		return "Duck can Swim";
	}



}
