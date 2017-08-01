package com.sda.zoo.animals.bird;

import com.sda.zoo.animals.AbstractAnimal;
import com.sda.zoo.com.sda.zoo.exception.BadAnimalException;
import com.sda.zoo.flyable.IFlyable;

public abstract class AbstractFlyingBird extends AbstractAnimal implements IFlyable {

	String feathering;
	String beak;
	String wings;

	public AbstractFlyingBird(int age, int limbs, String skinColor, double weight, String feathering, String beak, String wings) throws BadAnimalException {
		super(age, limbs, skinColor, weight);
		this.feathering = feathering;
		this.beak = beak;
		this.wings = wings;
		fBirdQuantity++;
	}
	
	private static int fBirdQuantity;
	
	@Override
	public String toString() {
		return "Bird [feathering=" + feathering + ", beak=" + beak + ", wings=" + wings + "]";
	}

	public void fly(){
		System.out.println("I am flying!");
	}
	
	public static int getInfo(){
		return fBirdQuantity;
	}
}
