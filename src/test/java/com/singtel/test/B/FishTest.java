package com.singtel.test.B;

import org.junit.Assert;
import org.junit.Test;

import com.singtel.B1.Clownfish;
import com.singtel.B1.ClownfishBehaviour;
import com.singtel.B1.Dolphin;
import com.singtel.B1.Fish;
import com.singtel.B1.Shark;
import com.singtel.B1.SharkBehaviour;
import com.singtel.IF.SwimBehaviourIF;

public class FishTest {

	
	@Test
	public void test(){
				
		Fish shark = new Shark();
		Assert.assertEquals("Sharks don’t sing", shark.sing());
		Assert.assertEquals("Sharks can swim",shark.swim());
		Assert.assertEquals("Sharks don't walk",shark.walk());
		
		Shark s = new Shark();
		s.setFishBehaviour(new SharkBehaviour());
		Assert.assertEquals("Sharks are large and grey color",s.color());	
		
		Fish clownfish = new Clownfish();
		Assert.assertEquals("Clownfish don’t sing",clownfish.sing());
		Assert.assertEquals("Clownfish can swim",clownfish.swim());
		Assert.assertEquals("Clownfish don't walk",clownfish.walk());
		
		Clownfish c = new Clownfish();
		c.setFishBehaviour(new ClownfishBehaviour());
		Assert.assertEquals("Clownfish make jokes",c.getFishBehaviour());
		Assert.assertEquals("Clownfish are small and colorful",c.getFishColor());
		
		
		
		SwimBehaviourIF ddd = new Dolphin();
		Assert.assertEquals("Dolphins are good swimmers",ddd.swim());
		
	}
}
