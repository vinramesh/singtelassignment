package com.singtel.test.A4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.singtel.A3.Rooster;
import com.singtel.A4.CatSound;
import com.singtel.A4.DogSound;
import com.singtel.A4.DuckSound;
import com.singtel.A4.Parrot;
import com.singtel.A4.PhoneSound;
import com.singtel.A4.RoosterSound;

public class ParrotTest {

private Parrot parrot;
	
	@Before
	public void setup() throws Exception{
		parrot=new Parrot();
	}
	
	@Test
	public void test(){
		parrot.setSoundBehaviourIF(new DogSound());		
		Assert.assertEquals("Woof, woof",parrot.performSound());
		
		parrot.setSoundBehaviourIF(new DuckSound());		
		Assert.assertEquals("Quack, quack",parrot.performSound());		

		parrot.setSoundBehaviourIF(new CatSound());		
		Assert.assertEquals("Meow",parrot.performSound());	

		
		parrot.setSoundBehaviourIF(new RoosterSound());		
		Assert.assertEquals("Cock-a-doodle-doo",parrot.performSound());
		
		parrot.setSoundBehaviourIF(new PhoneSound());
		Assert.assertEquals("Tring tring",parrot.performSound());
		
	}
	
}
