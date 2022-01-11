package Week10;

/**
 * OOP Practical - Exercise 4
 * Creates several cars
 * @author neilr
 *
 */

public class CarFactory {

	public static void main(String[] args) {

		// create the first car
		Car car1 = new Car();
		car1.setMake("Ford");
		car1.setModel("Fiesta");
		car1.setColour("Blue");
		car1.setNumberOfDoors(4);
		car1.setEngineSize(1.2);
		car1.setMaxSpeed(110);

		// create the second car
		Car car2 = new Car();
		car2.setMake("Peugeot");
		car2.setModel("308");
		car2.setColour("Silver");
		car2.setNumberOfDoors(4);
		car2.setEngineSize(1.8);
		car2.setMaxSpeed(130);

		// show all cars
		System.out.println(car1.toString());
		System.out.println(car2.toString());

		// take car 1 for a spin
		car1.startCar();

		// now try to start in this state
		car1.startCar();

		// now stop
		car1.stopCar();

	}

}
