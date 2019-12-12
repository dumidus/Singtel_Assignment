/**
 * 
 */
package com.singtel.assignment;

/**
 * @author dumidu
 *
 */
public class Shark implements Fish{

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isWalk()
	 */
	public boolean isWalk() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isFly()
	 */
	public boolean isFly() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isSing()
	 */
	public boolean isSing() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Animal#isSwimm()
	 */
	public boolean isSwimm() {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Fish#color()
	 */
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Gray");
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Fish#size()
	 */
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("Large");
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Fish#eat()
	 */
	public boolean eat() {
		System.out.println("Eat other fish");
		return true;
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Fish#makeJokes()
	 */
	public boolean makeJokes() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
