package a15cecal_uppgift5;

public class Banana extends Fruit {
	private int energyLevel;

	/**
	 * Constructor for Banana. Calls the method randomEnergy from the superclass
	 * and sets mEnergy to the return value from this method
	 */
	public Banana() {
		energyLevel = super.randomEnergy(25, 35);
	}

	public int getEnergy() {
		return energyLevel;
	}

	public String getName() {
		return "Banana";
	}
}
