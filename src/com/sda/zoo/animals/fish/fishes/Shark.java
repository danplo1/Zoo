package com.sda.zoo.animals.fish.fishes;

import com.sda.zoo.animals.fish.AbstractFish;
import com.sda.zoo.com.sda.zoo.exception.BadAnimalException;

public class Shark extends AbstractFish {

	public Shark(int age, int limbs, String skinColor, double weight, String scales, String waterType) throws BadAnimalException {
		super(age, limbs, skinColor, weight, scales, waterType);
	}

	@Override
	public void makeSound() {
		System.out.println("I am shark");
	}

	@Override
	public void eat() {
		System.out.println("I am eating fishes");
	}

	
}


// interface - dodawanie funkcjonalno�ci do klasy bez dalszego rozwijania drzewa, nadajemy specjalne umiejetnosci tylko wybranym klasom.
// roznica miedzy interfacem a klasa abstrakcyjna - interface jest z boku i moze byc zaimplementowana do roznych klas, nawet z poza drzewa dziedziczenia.
// Klasa moze dziedziczyc wiele interfacow. Interface implementuje jakas umiejetnosc.