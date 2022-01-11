package Week11;

public class FootballManager {

	public static void main(String[] args) {
		
		Footballer fb1 = new Footballer("Joe", "Bloggs", 39, 1);
		Footballer fb2 = new Footballer("Gareth", "Bale", 39, 2);
		Footballer fb3 = new Footballer("Lionel", "Messi", 14, 3);
		Footballer fb4 = new Footballer("Eric", "Cantona", 76, 4);
		
		Footballer[] Footballers = new Footballer[] {fb1, fb2, fb3, fb4};
		
		getHighestEmployeeNo(Footballers);
		
		// Accessing a static variable
		System.out.println(Footballer.count);
		// Or access via an instance of the footballer
		System.out.println(fb3.count);

	}
	
	public static void getHighestEmployeeNo(Footballer[] Footballers) {
		
		Footballer maxEmployeeNo = Footballers[0];
		for (int i = 0; i < Footballers.length; i++) {
			
		}
	}

}
