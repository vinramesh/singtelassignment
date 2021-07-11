package com.singtel.A4;

import com.singtel.IF.SoundBehaviourIF;

public class Parrot {
 
	private SoundBehaviourIF soundBehaviourIF;

	public void setSoundBehaviourIF(SoundBehaviourIF soundBehaviourIF) {
		this.soundBehaviourIF = soundBehaviourIF;
	}
	

	public String performSound() {
		return soundBehaviourIF.sound();
	}
	

}
