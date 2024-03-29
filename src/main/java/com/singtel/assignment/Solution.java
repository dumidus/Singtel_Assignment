/**
 * 
 */
package com.singtel.assignment;

import java.util.HashMap;

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

		System.out.println("-----------Q4-----------------");
		Parrot objParrotDog = new Parrot();
		objParrotDog.setLivedWith(new Dog());
		objParrotDog.isSing();
		objParrotDog.isFly();
		objParrotDog.isWalk();

		Parrot objParrotCat = new Parrot();
		objParrotCat.setLivedWith(new Cat());
		objParrotCat.isSing();
		objParrotCat.isFly();
		objParrotCat.isWalk();

		Parrot objParrotRoos = new Parrot();
		objParrotRoos.setLivedWith(new Rooster());
		objParrotRoos.isSing();
		objParrotRoos.isFly();
		objParrotRoos.isWalk();

		System.out.println("----------B-Q2-----------------");
		Shark objShark = new Shark();
		objShark.color();
		objShark.eat();
		objShark.makeJokes();

		Clownfish objClownfish = new Clownfish();
		objClownfish.color();
		objClownfish.size();
		objClownfish.makeJokes();

		System.out.println("----------B-Q3-----------------");
		Dolphine objDolphine = new Dolphine();
		objDolphine.isSwimm();

		System.out.println("----------D-Q1-----------------");
		Butterfly objButterfly = new Butterfly();
		objButterfly.isFly();
		objButterfly.isSing();

		System.out.println("----------D-Q2-----------------");
		Butterfly objCterpiller = new Butterfly();
		objCterpiller.setCaterpillar(true);
		objCterpiller.isFly();
		objCterpiller.isWalk();

		System.out.println("----------E-Q1-----------------");

		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Shark(), new Clownfish(), new Dolphine(), new Dog(), new Butterfly(),
				new Cat() };
		
		int countWalk = 0;
		int countFly = 0;
		int countSing = 0;
		int countSwimm = 0;

		for (Animal animal : animals) {
			if (animal.isWalk()) {
				countWalk++;
			}
			if (animal.isFly()) {
				countFly++;
			}
			if (animal.isSing()) {
				countSing++;
			}
			if (animal.isSwimm()) {
				countSwimm++;
			}
		}

		System.out.println("countWalk " + countWalk);
		System.out.println("countFly " + countFly);
		System.out.println("countSing " + countSing);
		System.out.println("countSwimm " + countSwimm);
		
		
		System.out.println("----------Bonus-Q1-----------------");
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Sinhala", "Kukkukkuuu");
		
		Rooster objRoosters = new Rooster();
		objRoosters.setSingLang(map.get("Sinhala"));
		objRoosters.isSing();
	}
	

}
