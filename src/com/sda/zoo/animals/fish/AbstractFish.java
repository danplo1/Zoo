package com.sda.zoo.animals.fish;

import com.sda.zoo.animals.AbstractAnimal;
import com.sda.zoo.com.sda.zoo.exception.BadAnimalException;

public abstract class AbstractFish extends AbstractAnimal {

	String scales;
	String waterType;

	public AbstractFish(int age, int limbs, String skinColor, double weight, String scales, String waterType) throws BadAnimalException {
		super(age, limbs, skinColor, weight);
		
		this.scales = scales;
		this.waterType = waterType;
		fishQuantity++;
		
	}
	
	private static int fishQuantity;

	public static int getInfo(){
		return fishQuantity;
		
	}
		
}
