/**
 * 
 */
package com.singtel.assigment.test;

import org.junit.Test;

import com.singtel.assignment.Bird;
import com.singtel.assignment.Butterfly;
import com.singtel.assignment.Cat;
import com.singtel.assignment.Chicken;
import com.singtel.assignment.Clownfish;
import com.singtel.assignment.Dog;
import com.singtel.assignment.Dolphine;
import com.singtel.assignment.Duck;
import com.singtel.assignment.Fish;
import com.singtel.assignment.Parrot;
import com.singtel.assignment.Rooster;
import com.singtel.assignment.RoosterOtherWay;
import com.singtel.assignment.Shark;

/**
 * @author dumidu
 *
 */
public class AssignmentUnitTest {

	@Test
	public void testQ1_a() {
		Bird objBird = new Bird();
		objBird.isWalk();
		objBird.isFly();
		objBird.isSing();
	}

	@Test
	public void testQ2_a() {
		Duck objDuck = new Duck();
		objDuck.isWalk();
		objDuck.isFly();
		objDuck.isSing();
		objDuck.isSwimm();
	}

	@Test
	public void testQ2_c() {
		Chicken objChicken = new Chicken();
		objChicken.isWalk();
		objChicken.isFly();
		objChicken.isSing();
		objChicken.isSwimm();
	}

	@Test
	public void testQ3_a() {
		Rooster objRooster = new Rooster();
		objRooster.isWalk();
		objRooster.isFly();
		objRooster.isSing();
		objRooster.isSwimm();
	}

	@Test
	public void testQ3_c() {
		RoosterOtherWay objRooster = new RoosterOtherWay();
		objRooster.isWalk();
		objRooster.isFly();
		objRooster.isSing();
		objRooster.isSwimm();
	}

	@Test
	public void testQ4_a() {
		Parrot objParrot = new Parrot();
		objParrot.setLivedWith(new Dog());
		objParrot.isSing();
		objParrot.isFly();
		objParrot.isWalk();
	}

	@Test
	public void testQ4_b() {
		Parrot objParrot = new Parrot();
		objParrot.setLivedWith(new Cat());
		objParrot.isSing();
		objParrot.isFly();
		objParrot.isWalk();
	}

	@Test
	public void testQ4_c() {
		Parrot objParrot = new Parrot();
		objParrot.setLivedWith(new Rooster());
		objParrot.isSing();
		objParrot.isFly();
		objParrot.isWalk();
	}

	@Test
	public void testBQ2_a() {
		Shark objShark = new Shark();
		objShark.color();
		objShark.eat();
		objShark.size();
	}
	
	@Test
	public void testBQ2_b() {
		Clownfish objClownfish = new Clownfish();
		objClownfish.color();
		objClownfish.size();
		objClownfish.makeJokes();
	}
	
	@Test
	public void testDQ1() {
		Butterfly objButterfly = new Butterfly();
		objButterfly.isFly();
		objButterfly.isSing();
		objButterfly.isWalk();
	}
	
	@Test
	public void testDQ2() {
		Butterfly objButterfly = new Butterfly();
		objButterfly.setCaterpillar(true);
		objButterfly.isFly();
		objButterfly.isWalk();
	}
	

}
