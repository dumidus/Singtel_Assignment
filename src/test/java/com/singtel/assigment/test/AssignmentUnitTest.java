/**
 * 
 */
package com.singtel.assigment.test;

import org.junit.Test;

import com.singtel.assignment.Bird;
import com.singtel.assignment.Chicken;
import com.singtel.assignment.Duck;

/**
 * @author dumidu
 *
 */
public class AssignmentUnitTest {
	
	//@Test
	public void testQ1_a()
	{
		Bird objBird = new Bird();
		objBird.isWalk();
		objBird.isFly();
		objBird.isSing();
	}
	
	@Test
	public void testQ2_a()
	{
		Duck objDuck = new Duck();
		objDuck.isWalk();
		objDuck.isFly();
		objDuck.isSing();
		objDuck.isSwimm();
	}
	
	@Test
	public void testQ2_c()
	{
		Chicken objChicken = new Chicken();
		objChicken.isWalk();
		objChicken.isFly();
		objChicken.isSing();
		objChicken.isSwimm();
	}

}
