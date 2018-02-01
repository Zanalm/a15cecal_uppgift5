package a15cecal_uppgift5;

public class Apple extends Fruit {
	private int mEnergy;

	/**
	 * Constructor for Apple. Calls the method randomEnergy from the superclass,
	 * sets mEnergy to the return value from this method
	 */
	public Apple() {
		mEnergy = super.randomEnergy(30, 20);
	}

	public int getEnergy() {
		return mEnergy;
	}

	public String getName() {
		return "Apple";
	}
}