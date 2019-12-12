/**
 * 
 */
package com.singtel.assignment;

/**
 * @author dumidu
 *
 */
public class Duck extends Bird{

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
		return super.isFly();
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Bird#isSing()
	 */
	@Override
	public boolean isSing() {
		System.out.println("Quack, quack");
		return true;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Bird#isSwimm()
	 */
	@Override
	public boolean isSwimm() {
		System.out.println("I am swimming");
		return true;
	}

}
