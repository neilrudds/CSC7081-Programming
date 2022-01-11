/**
 * 
 */
package Week10;

/**
 * Bank Account Class
 * @author neilr
 *
 */
public class BankAccount {
	
	// Instance Variables
	private String name;
	private double balance;
	private String accNum;
	
	
	// Constructors
	
	// Methods
	public String getName() {
		return this.name;
	}
	
	/**
	 * Set name to value
	 * @param name - Must be 1 or more chars
	 */
	public void setName(String name) {
		if (name.length()>0) {
			this.name = name;
		} else {
			this.name = "ERROR";
		}
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * @return the accNum
	 */
	public String getAccNum() {
		return accNum;
	}

	/**
	 * @param accNum the accNum to set
	 */
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public void deposit(double amount) {
		this.balance += amount;
		
	}
	
	/**
	 * Subtract the amount from the balance and return the withdrawn amount
	 * Check if enough balance is available before doing withdrawl.
	 * @param amount
	 * @return
	 */
	public double withdraw(double amount) {
		if(this.balance >= amount) {
			this.balance -= amount;
			return this.balance;
		} else {
			System.err.println("Insufficient Funds!");
			return 0;
		}
	}
	
	public void transfer(BankAccount recipient, double amount) {
		double value = recipient.withdraw(amount);
		this.deposit(value);
	}

}
