package a15cecal_uppgift5;

public class Apple extends Fruit {
	private int energyLevel;

	/**
	 * Constructor for Apple. Calls the method randomEnergy from the superclass,
	 * sets mEnergy to the return value from this method
	 */
	public Apple() {
		energyLevel = super.randomEnergy(20, 30);
	}

	public int getEnergy() {
		return energyLevel;
	}

	public String getName() {
		return "Apple";
	}
}