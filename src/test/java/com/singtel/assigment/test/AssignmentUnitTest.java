/**
 * 
 */
package com.singtel.assigment.test;

import org.junit.Test;

import com.singtel.assignment.Bird;

/**
 * @author dumidu
 *
 */
public class AssignmentUnitTest {
	
	@Test
	public void testQ1_a()
	{
		Bird objBird = new Bird();
		objBird.walk();
		objBird.fly();
		objBird.sing();
	}

}
