package a15cecal_uppgift5;

public class Person implements Runnable {

	private int energyLevel;
	private Bag Bag;
	private String name;

	/**
	 * Constructor for the class Person. Gets the name of the person as a parameter
	 * and then generates random energy value. It then prints out the name and
	 * energy of the person Bag is the fruit bag that the person should use. name is
	 * simply the name of the person
	 */
	public Person(Bag Bag, String name) {
		this.name = name;
		this.Bag = Bag;
		randoenergyLevel();
		System.out.println(this.name + " created with " + this.energyLevel + " energy");
	}

	/**
	 * The run-method for Person. This runs while the energy of the human is higher
	 * than zero, and while the boolean enoughFruit is true. enoughFruit will be set
	 * to the return value of the method enoughFruit in Bag. Makes sure that it's
	 * enough fruit left in the Bag. If it's not, then it's to no use to try to take
	 * a fruit from the bag, obviously since it's empty
	 */
	@Override
	public void run() {
		while ((energyLevel > 0) && Bag.enoughFruit()) {
			loseEnergy();
			if ((energyLevel < 20) && (energyLevel > 0)) {
				System.out.println(this.name + " has " + this.energyLevel + " energy and is hungry...");
				Fruit fruit = takeFruitFromBag();
				if (fruit != null)
					eatFruit(fruit); // If the Person got a fruit, it then eats it
			}
		}
		if (energyLevel <= 0)
			System.out.println(this.name + " be dead as shit... Rest in Pieces"); // If the Person's life is less or =
																					// to zero, print this message
		else
			System.out.println("Bag is empty... " + this.name + " is leaving the party"); // If there's no fruit left,
																							// print this
	}

	// This randomly picks a number between 30 and 90. The persons energy is then set to said
	// number
	private void randoenergyLevel() {
		int min = 30;
		int max = 90;
		energyLevel = min + (int) (Math.random() * (max - min));
	}

	/**
	 * This causes -10 to be drawn from energy when this method is executed. Makes
	 * it sleep for 1 second before continuing
	 */
	private void loseEnergy() {
		energyLevel -= 10;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Draws a fruit from the Bag. If the fruit in turn doesn't equal run, it then
	 * prints out the retrieved fruit from the bag. if not, it just returns the
	 * fruit
	 */
	private Fruit takeFruitFromBag() {
		Fruit fruit = Bag.takeFromBag();
		if (fruit != null)
			System.out.println(this.name + " picked " + fruit.getName() + " and indulge in it");
		return fruit;
	}

	/**
	 * The grabbed fruit from the bag is eaten. When the fruit is eaten, the created
	 * thread sleeps for 1 second. After this it prints out who ate the fruit, which
	 * fruit was eaten, the energy value for the fruit, and then prints the energy level of the Person
	 */
	private void eatFruit(Fruit fruitToEat) {
		energyLevel += fruitToEat.getEnergy();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.name + " ate " + fruitToEat.getName() + " with " + fruitToEat.getEnergy()
				+ " energy and now has " + this.energyLevel + " energy. Good for them");
	}
}
