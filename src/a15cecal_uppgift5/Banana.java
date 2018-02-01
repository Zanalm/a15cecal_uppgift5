package a15cecal_uppgift5;

public class Banana extends Fruit {
	private int mEnergy;

	/**
	 * Constructor for Banana. Calls the method randomEnergy from the superclass
	 * and sets mEnergy to the return value from this method
	 */
	public Banana() {
		mEnergy = super.randomEnergy(35, 25);
	}

	public int getEnergy() {
		return mEnergy;
	}

	public String getName() {
		return "Banana";
	}
}
