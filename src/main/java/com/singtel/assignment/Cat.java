/**
 * 
 */
package com.singtel.assignment;

/**
 * @author dumidu
 *
 */
public class Cat implements Animal{

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
		System.out.println("Meow");
		return true;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isSwimm()
	 */
	public boolean isSwimm() {
		return false;
	}
	

}
