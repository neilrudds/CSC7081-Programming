package Week10;

/** 
 * OOP Practical - Exercise 3
 * Java simple calculator class
 * @author neilr
 */
public class Calculator {
	private int memory;

	/**
	 * Gets the memory
	 * 
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * Sets the memory
	 * 
	 * @param
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}

	/**
	 * Sets the memory to 0 (zero)
	 */
	public void clearMemory() {
		this.memory = 0;
	}

	/**
	 * Add two numbers
	 * 
	 * @param num1
	 * @param num2
	 */
	public void addNumbers(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	/**
	 * Subtracts two numbers
	 * 
	 * @param num1
	 * @param num2
	 */
	public void subtractNumbers(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	/**
	 * Multiplies two numbers
	 * 
	 * @param num1
	 * @param num2
	 */
	public void multiplyNumbers(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	/**
	 * Divides two numbers
	 * 
	 * @param num1
	 * @param num2
	 */
	public void divideNumbers(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	/**
	 * Finds the square root of a given number
	 * 
	 * @param num1
	 */
	public void squareRoot(int num1) {
		System.out.println(Math.sqrt(num1));
	}

}
