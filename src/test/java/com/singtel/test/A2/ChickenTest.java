package com.singtel.test.A2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.singtel.A2.Chicken;

public class ChickenTest {
	
	private Chicken chicken;
	
	@Before
	public void setup() throws Exception{
		chicken=new Chicken();
	}
	
	@Test
	public void test(){
				
		chicken.sound();
		Assert.assertEquals("Cluck, cluck",chicken.sound());
		
		chicken.fly();
		Assert.assertEquals("I cant Fly",chicken.fly());
		
		
		
	}
}
