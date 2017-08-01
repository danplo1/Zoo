package com.sda.zoo.app;

import com.sda.zoo.animals.AbstractAnimal;
import com.sda.zoo.animals.IAnimals;
import com.sda.zoo.animals.bird.AbstractFlyingBird;
import com.sda.zoo.animals.bird.birds.Duck;
import com.sda.zoo.animals.bird.birds.Eagle;
import com.sda.zoo.animals.bird.birds.Woodpecker;
import com.sda.zoo.animals.fish.AbstractFish;
import com.sda.zoo.animals.fish.fishes.FlyingFish;
import com.sda.zoo.animals.mamal.mamals.Dog;
import com.sda.zoo.com.sda.zoo.exception.BadAnimalException;
import com.sda.zoo.drones.DronX350Real;
import com.sda.zoo.flyable.IFlyable;

public class App {

	public static void main(String[] args) throws BadAnimalException {
		try {
			// wywolac statycznie to po nazwie klasy

			AbstractAnimal eagle = new Eagle(1, 2, "none", 3, "...", "...", "...");
			Woodpecker woodpecker = new Woodpecker(5, 2, "Yellow", 3, "Red", "Pointy", "Small");
			FlyingFish fFish = new FlyingFish(1, 5, "blue", 3, "silver", "fresh water");

		} catch (BadAnimalException e){
			e.printStackTrace();
		}
		
		//***********************************************************************//
		
		IFlyable[] flyable = new IFlyable[4];  // tablica !!
		flyable[0] = new Eagle(4, 2, "White", 10, "Grey", "Sharp", "Long");
		flyable[1] = new Woodpecker(1, 4, "silver", 3, "red", "sharp", "small");
		flyable[2] = new FlyingFish(1, 5, "GOLD", 2, "silver", "FreshWater");
		flyable[3] = new DronX350Real();
		
		
//		for (int i=0; i<4; i++){
//			flyable[i].fly();
//		}
		
		
//		woodpecker.poke();
//		woodpecker.makeSound();
//		eagle.makeSound();
//		fFish.fly();
		
		IAnimals[] animals = new IAnimals[2];
		animals[0] = new Dog(2, 4, "Yellow", 10);
		animals[1] = new Duck(1, 2, "grey", 2, "black", "wide", "medium");
		
//		for (int i = 0; i < animals.length; i++) {
//			animals[i].eat();
//			animals[i].makeSound();
//		}
		
//		System.out.println(AbstractAnimal.getAnimalsQuantity());
		System.out.println("Ilosc ryb: " + AbstractFish.getInfo());
		System.out.println("Ilosc ptakow: " + AbstractFlyingBird.getInfo());
	}

}
