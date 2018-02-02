package a15cecal_uppgift5;

import java.util.ArrayList;

public class Bag {
	private ArrayList<Fruit> Bag = new ArrayList<Fruit>();

	/**
	 * The constructor creates 20 fruits and adds them to the ArrayList (bag). The size of
	 * the ArrayList is then printed
	 */
	public Bag() {
		for (int i = 0; i < 20; i++)
			addRandomFruit();
		System.out.println("The magical bag created has got " + Bag.size() + " fruits.");
	}

	// Adds to the bag with a 20% chance of a fruit being added to the bag
	private void addToBag() {
		int addFruit = (int) (Math.random() * 5); // Randomly a number between 0 and 4 (5 numbers)
		if (addFruit == 1)
			addRandomFruit(); // If the randomly generated number == 1, call function addRandomFruit. 20%
								// chance of this happening
	}

	/**
	 * A synchronized method, it returns a fruit from the Bag, then removes it from
	 * the bag. This is to symbolize the action of taking a fruit from the bag
	 * physically. If the bag is empty, the method simply returns null
	 */
	public synchronized Fruit takeFromBag() {
		Fruit fruit;
		if (enoughFruit()) {
			fruit = Bag.get(0);
			Bag.remove(0);
			addToBag();
		} else {
			fruit = null;
		}
		System.out.println("- The  bag now contains " + Bag.size() + " fruits");
		return fruit;
	}

	/**
	 * Returns a boolean depending whether the size of the ArrayList is greater than
	 * 0 or not
	 */
	public synchronized boolean enoughFruit() {
		return Bag.size() > 0;
	}

	/**
	 * Adds a random fruit to the bag. It prints the name and energy of the added
	 * fruit
	 */
	private void addRandomFruit() {
		int choice = (int) (Math.random() * 3) + 1;
		switch (choice) {
		case 1:
			Bag.add(new Banana());
			break;
		case 2:
			Bag.add(new Apple());
			break;
		case 3:
			Bag.add(new Pear());
			break;
		}
		System.out.println("- " + Bag.get(Bag.size() - 1).getName() + " with " + Bag.get(Bag.size() - 1).getEnergy()
				+ " energy was added to the fruit bag");
	}
}
