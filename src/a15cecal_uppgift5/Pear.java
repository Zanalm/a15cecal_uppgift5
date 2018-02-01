package a15cecal_uppgift5;

public class Pear extends Fruit {
	private int mEnergy;

	/**
	 * Constructor for Pear. Calls the method randomEnergy from the superclass, then
	 * sets mEnergy to the return value from this method
	 */
	public Pear() {
		mEnergy = super.randomEnergy(40, 20);
	}

	public int getEnergy() {
		return mEnergy;
	}

	public String getName() {
		return "Pear";
	}
}
