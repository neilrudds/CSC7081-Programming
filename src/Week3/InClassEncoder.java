package Week3;

import java.util.Scanner;

/**
 * @author neilr
 *
 */
public class InClassEncoder {
	
	/***
	 * Simple input encoder, demonstrates the use of a loop.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		String name;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		name = scan.nextLine();
		
		for(int loop = 0; loop < name.length(); loop++){
			if(name.charAt(loop) != ' ') {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		scan.close();
	}
}
