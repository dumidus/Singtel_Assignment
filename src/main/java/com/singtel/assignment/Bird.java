/**
 * 
 */
package com.singtel.assignment;

/**
 * @author dumidu
 *
 */
public class Bird implements Animal {

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isWalk()
	 */
	public boolean isWalk() {
		System.out.println("I am walking");
		return true;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isFly()
	 */
	public boolean isFly() {
		System.out.println("I am flying");
		return true;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isSing()
	 */
	public boolean isSing() {
		System.out.println("I am singing");
		return true;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isSwimm()
	 */
	public boolean isSwimm() {
		// TODO Auto-generated method stub
		return false;
	}
}
