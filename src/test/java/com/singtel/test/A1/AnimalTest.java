package com.singtel.test.A1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.singtel.A1.Animal;

public class AnimalTest {

	private Animal animal ;
		
	

	@Before
	public void setup() throws Exception{
		animal=new Animal();
	}
	
	@Test
	public void walkTest(){
		animal.walk();
		Assert.assertEquals("I can walk...",animal.walk());
	}
}
