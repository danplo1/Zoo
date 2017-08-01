package com.sda.zoo.animals.mamal.mamals;

import com.sda.zoo.animals.IAnimals;
import com.sda.zoo.animals.mamal.AbstractMamal;
import com.sda.zoo.com.sda.zoo.exception.BadAnimalException;

public class Dog extends AbstractMamal implements IAnimals {

	public Dog(int age, int limbs, String skinColor, double weight) throws BadAnimalException {
		super(age, limbs, skinColor, weight);
	}

	public void eat() {
		System.out.println("Dog says : I eat small children and " + basicFood);
	}
}
