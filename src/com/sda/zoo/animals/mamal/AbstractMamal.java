package com.sda.zoo.animals.mamal;

import com.sda.zoo.animals.AbstractAnimal;
import com.sda.zoo.com.sda.zoo.exception.BadAnimalException;

public class AbstractMamal extends AbstractAnimal  {

		protected String basicFood = "milk";
		
		
	public AbstractMamal(int age, int limbs, String skinColor, double weight) throws BadAnimalException{
		super(age, limbs, skinColor, weight);
	}

	@Override
	public void makeSound() {
	}

	@Override
	public void eat() {
	}

}
