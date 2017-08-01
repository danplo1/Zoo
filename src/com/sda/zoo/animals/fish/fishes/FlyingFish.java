package com.sda.zoo.animals.fish.fishes;

import com.sda.zoo.animals.fish.AbstractFish;
import com.sda.zoo.com.sda.zoo.exception.BadAnimalException;
import com.sda.zoo.flyable.IFlyable;

public class FlyingFish extends AbstractFish implements IFlyable{

	public FlyingFish(int age, int limbs, String skinColor, double weight, String scales, String waterType) throws BadAnimalException {
		super(age, limbs, skinColor, weight, scales, waterType);
	}

	@Override
	public void fly() {
		System.out.println("I am flying fish!");
	}

	@Override
	public void makeSound() {
		System.out.println("Gul gul");
	}

	@Override
	public void eat() {
		System.out.println("I eat algea");
	}

}
