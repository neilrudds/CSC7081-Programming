package Week10;

/**
 * OOP Practical - Exercise 4
 * Class to represent a car
 * @author neilr
 *
 */
public class Car {
	// instance variable declarations
	private String make;
	private String model;
	private String colour;
	private int numberOfDoors;
	private double engineSize;
	private int maxSpeed;
	private boolean started;

	/**
	 * The make of the car
	 * 
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * Sets the make of the car
	 * 
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * Gets the Model of the car
	 * 
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Sets the model of the car
	 * 
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * Gets the colour of the car
	 * 
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * Sets the colour for the car
	 * 
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * Gets the number of doors
	 * 
	 * @return the numberOfDoors
	 */
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	/**
	 * Sets the number of doors of the car
	 * 
	 * @param numberOfDoors the numberOfDoors to set
	 */
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	/**
	 * Gets the engine size
	 * 
	 * @return the engineSize
	 */
	public double getEngineSize() {
		return engineSize;
	}

	/**
	 * Sets the engine size
	 * 
	 * @param d the engineSize to set
	 */
	public void setEngineSize(double d) {
		this.engineSize = d;
	}

	/**
	 * Gets the maximum speed
	 * 
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * Sets the max speed
	 * 
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * Indicates if the engine is started
	 * 
	 * @return the started
	 */
	public boolean isStarted() {
		return started;
	}

	/**
	 * set the engineStarted field
	 * 
	 * @param started the started to set
	 */
	public void setStarted(boolean started) {
		this.started = started;
	}

	/**
	 * Starts the car
	 */
	public void startCar() {
		if (this.started) {
			// car already started
			System.out.println("Engine is already running");
		} else {
			this.started = true;
			System.out.println("Car started");
		}
	}

	/**
	 * Stops the car
	 */
	public void stopCar() {
		if (!this.started) {
			// car already stopped
			System.out.println("Engine is already stopped");
		} else {
			this.started = false;
			System.out.println("Car stopped");
		}
	}

	/** 
	 * 
	 */
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", colour=" + colour + ", numberOfDoors=" + numberOfDoors
				+ ", engineSize=" + engineSize + ", maxSpeed=" + maxSpeed + ", started=" + started + "]";
	}
}
