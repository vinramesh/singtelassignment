package com.singtel.A3;

import com.singtel.A2.Chicken;
import com.singtel.IF.FlyBehaviourIF;
import com.singtel.IF.SoundBehaviourIF;

public class Rooster extends Chicken implements SoundBehaviourIF, FlyBehaviourIF{

	public String fly() {
		// TODO Auto-generated method stub
		//System.out.println("I cant Fly");
		return super.fly();
	}

	public String sound() {
		// TODO Auto-generated method stub
		System.out.println("Cock-a-doodle-doo");
		return "Cock-a-doodle-doo";
	}

}
