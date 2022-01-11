package Week10;

public class BankManager {

	public static void main(String[] args) {
		
		// Instantiate and object of type BankAccount		
		BankAccount MattAcc = new BankAccount();
		MattAcc.setName("Matthew");
		MattAcc.setAccNum("00000001");
		MattAcc.deposit(650.50);
		
		BankAccount NeilAcc	= new BankAccount();
		NeilAcc.setName("Neil");
		NeilAcc.setAccNum("Neils Account Number");
		NeilAcc.deposit(1000);
		
		double wd = MattAcc.withdraw(20);
		System.out.println(wd);
		
		System.out.printf("Matt Balance: %.2f %n", MattAcc.getBalance());
		System.out.printf("Neil Balance: %.2f %n", NeilAcc.getBalance());
		
		MattAcc.deposit(NeilAcc.withdraw(500));
		
		System.out.printf("Matt Balance: %.2f %n", MattAcc.getBalance());
		System.out.printf("Neil Balance: %.2f %n", NeilAcc.getBalance());
		
		MattAcc.transfer(NeilAcc, 200);
		
		System.out.printf("Matt Balance: %.2f %n", MattAcc.getBalance());
		System.out.printf("Neil Balance: %.2f %n", NeilAcc.getBalance());
	}

}