package com.sda.zoo.animals.bird.birds;

import com.sda.zoo.animals.bird.AbstractFlyingBird;
import com.sda.zoo.com.sda.zoo.exception.BadAnimalException;

public class Woodpecker extends AbstractFlyingBird {

	public Woodpecker(int age, int limbs, String skinColor, double weight, String feathering, String beak,
			String wings) throws BadAnimalException {
		super(age, limbs, skinColor, weight, feathering, beak, wings);
	}

	public void poke() {
		System.out.println("Woodpecker: I am poking!");
	}

	@Override
	public void makeSound() {
		System.out.println("Woodpecker: puk puk");
	}

	@Override
	public void eat() {

	}

	@Override
	public void fly() {
		System.out.println("I am flying Woodpecker");
	}

}
