/**
 * 
 */
package com.singtel.assignment;

/**
 * @author dumidu
 *
 */
public class Dog implements Animal{

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isWalk()
	 */
	public boolean isWalk() {
		return true;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isFly()
	 */
	public boolean isFly() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isSing()
	 */
	public boolean isSing() {
		System.out.println("Woof, woof");
		return true;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isSwimm()
	 */
	public boolean isSwimm() {
		return false;
	}
	

}
