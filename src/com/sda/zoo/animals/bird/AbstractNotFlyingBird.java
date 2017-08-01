package com.sda.zoo.animals.bird;

import com.sda.zoo.animals.AbstractAnimal;
import com.sda.zoo.com.sda.zoo.exception.BadAnimalException;

public abstract class AbstractNotFlyingBird extends AbstractAnimal {

	String feathering;
	String beak;
	String wings;

	public AbstractNotFlyingBird(int age, int limbs, String skinColor, double weight, String feathering, String beak,
			String wings) throws BadAnimalException {
		super(age, limbs, skinColor, weight);
		this.feathering = feathering;
		this.beak = beak;
		this.wings = wings;
	}

	@Override
	public String toString() {
		return "Bird [feathering=" + feathering + ", beak=" + beak + ", wings=" + wings + "]";
	}

}
