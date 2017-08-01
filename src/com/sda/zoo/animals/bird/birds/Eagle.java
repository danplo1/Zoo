package com.sda.zoo.animals.bird.birds;

import com.sda.zoo.animals.bird.AbstractFlyingBird;
import com.sda.zoo.com.sda.zoo.exception.BadAnimalException;

public class Eagle extends AbstractFlyingBird {

	public Eagle(int age, int limbs, String skinColor, double weight, String feathering, String beak, String wings) throws BadAnimalException {
		super(age, limbs, skinColor, weight, feathering, beak, wings);
	}

	public void hunting() {
		System.out.println("Eagle: I am hunting!");
	}

	@Override
	public String toString() {
		return "Eagle [" + super.toString() + "]" + " Animal [age=" + age + ", limbs=" + limbs + ", skinColor="
				+ skinColor + ", weight=" + weight + "]";
	}

	@Override
	public void makeSound() {
		System.out.println("Eagle: kryyy kryyy!");
	}

	@Override
	public void eat() {
	}

	@Override
	public void fly() {
		System.out.println("I am flying eagle");
	}


}
