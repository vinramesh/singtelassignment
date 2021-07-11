package com.singtel.test.C;

import org.junit.Test;

import com.singtel.C1.Butterfly;
import com.singtel.C1.Caterpillar;

public class ButterflyTest {
	
	Caterpillar caterpillar = new Caterpillar();
	
	@Test
	public void testFishService(){
		caterpillar.setFlyBehaviour(new Butterfly());
		caterpillar.setSoundBehaviour(new Butterfly());

		caterpillar.performAction();
		
		caterpillar.fly();		
		caterpillar.walk();



	}
}
