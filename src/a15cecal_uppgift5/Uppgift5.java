package a15cecal_uppgift5;

public class Uppgift5 {

	public static void main(String[] args) {
		Bag Bag = new Bag(); // Creates a new bag for the fruits, this is to send it in as a parameter. Makes
								// sure that all threads works with the same bag
		Thread t1 = new Thread(new Person(Bag, "Bertil")); // Creating 3 new Person with different names
		Thread t2 = new Thread(new Person(Bag, "Klaes-Göran"));
		Thread t3 = new Thread(new Person(Bag, "Kerstin"));
		t1.start(); // Starts the new thread by executing the method.
		t2.start();
		t3.start();

	}

}
