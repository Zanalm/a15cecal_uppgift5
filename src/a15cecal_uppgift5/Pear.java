package a15cecal_uppgift5;

public class Pear extends Fruit {
	private int energyLevel;

	/**
	 * Constructor for Pear. Calls the method randomEnergy from the superclass, then
	 * sets mEnergy to the return value from this method
	 */
	public Pear() {
		energyLevel = super.randomEnergy(20, 40);
	}

	public int getEnergy() {
		return energyLevel;
	}

	public String getName() {
		return "Pear";
	}
}
