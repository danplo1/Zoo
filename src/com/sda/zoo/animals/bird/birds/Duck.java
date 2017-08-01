package com.sda.zoo.animals.bird.birds;

import com.sda.zoo.animals.IAnimals;
import com.sda.zoo.animals.bird.AbstractFlyingBird;
import com.sda.zoo.com.sda.zoo.exception.BadAnimalException;

public class Duck extends AbstractFlyingBird implements IAnimals{

	public Duck(int age, int limbs, String skinColor, double weight, String feathering, String beak, String wings) throws BadAnimalException {
		super(age, limbs, skinColor, weight, feathering, beak, wings);
	}
	@Override
	public void makeSound() {
		System.out.println("Duck says : Smoleñsk kur....!");
	}
	
	@Override
	public void eat() {
		
	}

}
