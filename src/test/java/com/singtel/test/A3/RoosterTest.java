package com.singtel.test.A3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.singtel.A3.Rooster;

public class RoosterTest {

private Rooster rooster;
	
	@Before
	public void setup() throws Exception{
		rooster=new Rooster();
	}
	
	@Test
	public void test(){
				
		rooster.sound();
		Assert.assertEquals("Cock-a-doodle-doo",rooster.sound());
		
		rooster.fly();
		Assert.assertEquals("I cant Fly",rooster.fly());
		
		
		
	}
}
