package Week10;

import java.util.Random;

/** 
 * OOP Practical - Exercise 3
 * Java simple calculator class
 * @author neilr
 */
public class FunCalculator {
	private int memory = 0;

	/**
	 * @return the memory
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}

	/**
	 * Add two numbers
	 * 
	 * @param num1
	 * @param num2
	 */
	public int addNumbers(int num1, int num2) {
		return num1 + num2;
	}

	/**
	 * Subtracts two numbers
	 * 
	 * @param num1
	 * @param num2
	 */
	public int subtractNumbers(int num1, int num2) {
		return num1 - num2;
	}

	/**
	 * Multiplies two numbers
	 * 
	 * @param num1
	 * @param num2
	 */
	public int multiplyNumbers(int num1, int num2) {
		return num1 * num2;
	}

	/**
	 * Divides two numbers
	 * 
	 * @param num1
	 * @param num2
	 */
	public double divideNumbers(int num1, int num2) {
		return (double) num1 - (double) num2;
	}

	/**
	 * Finds the square root of a given number
	 * 
	 * @param num1
	 */
	public double squareRoot(int num1) {
		return Math.sqrt(num1);
	}

	/**
	 * Outputs a random number
	 */
	public int randonNumber() {
		Random random = new Random();
		return random.nextInt();
	}

	public void addToMemory(int num) {
		this.setMemory(num);
	}

	/**
	 * Recalls the number in memory
	 */
	public int recallFromMemory() {
		return this.getMemory();
	}

	/**
	 * resets memory to zero
	 */
	public void clearMemory() {
		this.setMemory(0);
		System.out.println("Memory cleared");
	}
}
