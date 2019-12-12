/**
 * 
 */
package com.singtel.assignment;

/**
 * @author dumidu
 *
 *         Used delegation as alternative to inheritance
 */
public class RoosterOtherWay {
	
	Chicken chicken = new Chicken();

	public boolean isSing() {
		System.out.println("Cock-a-doodle-doo");
		return true;
	}

	public boolean isFly() {
		return chicken.isFly();
	}
	
	public boolean isWalk() {
		return chicken.isWalk();
	}
	
	public boolean isSwimm() {
		return chicken.isSwimm();
	}

}
