package com.singtel.test.A2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.singtel.A2.Chicken;
import com.singtel.A2.Duck;

public class DuckTest {

	private Duck duck ;
	//private Chicken chicken;
	
	@Before
	public void setup() throws Exception{
		duck=new Duck();
		//chicken=new Chicken();
	}
	
	@Test
	public void test(){
		duck.sound();
		Assert.assertEquals("Quack, quack",duck.sound());
		
		duck.swim();
		Assert.assertEquals("Duck can Swim",duck.swim());
		
		/*chicken.sound();
		Assert.assertEquals("Cluck, cluck",chicken.sound());
		
		chicken.fly();
		Assert.assertEquals("I cant Fly",chicken.fly());*/
		
		
		
	}
}
