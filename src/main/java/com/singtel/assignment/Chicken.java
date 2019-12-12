/**
 * 
 */
package com.singtel.assignment;

/**
 * @author dumidu
 *
 */
public class Chicken extends Bird{

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Bird#isWalk()
	 */
	@Override
	public boolean isWalk() {
		return super.isWalk();
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Bird#isFly()
	 */
	@Override
	public boolean isFly() {
		System.out.println("I can't fly");
		return false;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Bird#isSing()
	 */
	@Override
	public boolean isSing() {
		System.out.println("Cluck, cluck");
		return true;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Bird#isSwimm()
	 */
	@Override
	public boolean isSwimm() {
		// TODO Auto-generated method stub
		return super.isSwimm();
	}

}
