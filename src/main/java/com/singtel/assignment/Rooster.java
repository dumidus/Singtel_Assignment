/**
 * 
 */
package com.singtel.assignment;

/**
 * @author dumidu
 *
 */
public class Rooster extends Chicken{
	
	private String singLang = "Cock-a-doodle-doo";

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
		System.out.println(singLang);
		return true;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Chicken#isSwimm()
	 */
	@Override
	public boolean isSwimm() {
		return super.isSwimm();
	}

	public void setSingLang(String singLang) {
		this.singLang = singLang;
	}

}
