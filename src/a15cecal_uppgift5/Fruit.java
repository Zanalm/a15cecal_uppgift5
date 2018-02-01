package a15cecal_uppgift5;

public abstract class Fruit {

	// An abstract method that returns the energy of the fruit
	public abstract int getEnergy();

	// An abstract method that returns the name of the fruit
	public abstract String getName();

	/**
	 * Generates a random number between the two parameters and returns it
	 * Max being the highest possible number and Min the lowest possible number. It
	 * then returns a random number between Max and Min
	 */
	protected int randomEnergy(int Max, int Min) {
		return (int) ((Math.random() * (Max - Min)) + Min);
	}

}
