/**
 * 
 */
package com.singtel.assignment;

/**
 * @author dumidu
 *
 */
public class Butterfly implements Animal {

	private boolean isCaterpillar = false;

	public boolean isWalk() {
		if (isCaterpillar) {
			System.out.println("I can walk");
			return false;
		} else {
			System.out.println("I can't walk");
			return true;
		}
	}

	public boolean isFly() {
		if (isCaterpillar) {
			System.out.println("I cannot fly");
			return false;
		} else {
			System.out.println("I am flying");
			return true;
		}
	}

	public boolean isSing() {
		System.out.println("I does not make a sound");
		return false;
	}

	public boolean isSwimm() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setCaterpillar(boolean isCaterpillar) {
		this.isCaterpillar = isCaterpillar;
	}

}
