/**
 * 
 */
package com.singtel.assignment;

/**
 * @author dumidu
 *
 */
public class Fish implements Animal{

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isWalk()
	 */
	public boolean isWalk() {
		System.out.println("I don't walk");
		return false;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isFly()
	 */
	public boolean isFly() {
		System.out.println("I don't fly");
		return false;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isSing()
	 */
	public boolean isSing() {
		System.out.println("I don't sing");
		return false;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isSwimm()
	 */
	public boolean isSwimm() {
		System.out.println("I am swimming");
		return true;
	}

}
