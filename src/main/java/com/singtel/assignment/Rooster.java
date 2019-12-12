/**
 * 
 */
package com.singtel.assignment;

/**
 * @author dumidu
 *
 */
public class Rooster extends Chicken{

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Chicken#isWalk()
	 */
	@Override
	public boolean isWalk() {
		return super.isWalk();
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Chicken#isFly()
	 */
	@Override
	public boolean isFly() {
		return super.isFly();
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Chicken#isSing()
	 */
	@Override
	public boolean isSing() {
		System.out.println("Cock-a-doodle-doo");
		return true;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Chicken#isSwimm()
	 */
	@Override
	public boolean isSwimm() {
		return super.isSwimm();
	}

}
