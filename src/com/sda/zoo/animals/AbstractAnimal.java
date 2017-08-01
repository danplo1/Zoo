package com.sda.zoo.animals;

import com.sda.zoo.com.sda.zoo.exception.BadAnimalException;

public abstract class AbstractAnimal {

	public AbstractAnimal(int age, int limbs, String skinColor, double weight) throws BadAnimalException  {
		this.age = age;
		this.limbs = limbs;
		this.skinColor = skinColor;
		this.weight = weight;
		if (age<0 || limbs<0 ||weight<0) {
			throw new BadAnimalException();
		}

		animalsQuantity++;


	}

	protected int age;
	protected int limbs;
	protected String skinColor;
	protected double weight;
	private static int animalsQuantity;
	
	
	public abstract void makeSound();

	public abstract void eat();

	@Override // adnotacja - metoda nadpisuje 
	public String toString() {
		return "Animal [age=" + age + ", limbs=" + limbs + ", skinColor=" + skinColor + ", weight=" + weight + "]";
	}
	
//	@Deprecated //adnotacja - metoda dziala ale zostanie wkrotce usunieta
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLimbs() {
		return limbs;
	}

	public void setLimbs(int limbs) {
		this.limbs = limbs;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public static int getAnimalsQuantity(){
		return animalsQuantity;
	}
}
