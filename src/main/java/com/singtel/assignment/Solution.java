/**
 * 
 */
package com.singtel.assignment;

/**
 * @author dumidu
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println("-----------Q1-----------------");
		Bird bird = new Bird();
		bird.isWalk();
		bird.isFly();
		bird.isSing();
		
		System.out.println("-----------Q2-----------------");
		Duck objDuck = new Duck();
		objDuck.isWalk();
		objDuck.isFly();
		objDuck.isSing();
		objDuck.isSwimm();
		
		Chicken objChicken = new Chicken();
		objChicken.isWalk();
		objChicken.isFly();
		objChicken.isSing();
		objChicken.isSwimm();
		
		System.out.println("-----------Q3-----------------");
		Rooster objRooster = new Rooster();
		objRooster.isWalk();
		objRooster.isFly();
		objRooster.isSing();
		objRooster.isSwimm();
		
		RoosterOtherWay objRoosterOther = new RoosterOtherWay();
		objRoosterOther.isWalk();
		objRoosterOther.isFly();
		objRoosterOther.isSing();
		objRoosterOther.isSwimm();
	}

}
