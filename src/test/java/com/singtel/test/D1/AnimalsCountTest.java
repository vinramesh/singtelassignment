package com.singtel.test.D1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.singtel.D1.Animal;
import com.singtel.D1.Bird;
import com.singtel.D1.Butterfly;
import com.singtel.D1.Cat;
import com.singtel.D1.Chicken;
import com.singtel.D1.Clownfish;
import com.singtel.D1.Dog;
import com.singtel.D1.Dolhpin;
import com.singtel.D1.Duck;
import com.singtel.D1.Fish;
import com.singtel.D1.Frog;
import com.singtel.D1.Parrot;
import com.singtel.D1.Rooster;
import com.singtel.D1.Shark;

public class AnimalsCountTest {
	Animal[] animals;
	int flyCount = 0;
	int swimCount = 0;
	int walkCount = 0;
	int singCount = 0;

	@Before
	public void setUp() throws Exception {
		animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolhpin(),
				new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
		};	

	}

	@Test
	public void testFlyAnimalCount()
	{
		for(int i = 0 ; i< animals.length; i++){
			if(animals[i].fly()){
				flyCount = flyCount + 1;
			}

		}
		Assert.assertEquals(5, flyCount);
	}


	@Test
	public void testSingAnimalCount()
	{
		for(int i = 0 ; i< animals.length; i++){
			if(animals[i].sing()){
				singCount = singCount + 1;
			}
		}
		Assert.assertEquals(2, singCount);
	}


	@Test
	public void testWalkAnimalCount()
	{
		for(int i = 0 ; i< animals.length; i++){

			if(animals[i].walk()){
				walkCount = walkCount + 1;
			}

		}
		Assert.assertEquals(8, walkCount);
	}

	@Test
	public void testSwimAnimalCount()
	{
		for(int i = 0 ; i< animals.length; i++){

			if(animals[i].swim()){
				swimCount = swimCount + 1;
			}
		}
		Assert.assertEquals(7, swimCount);
	}
}
