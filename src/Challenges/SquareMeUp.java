package Challenges;

import java.util.Scanner;

public class SquareMeUp {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int sideLength = 0;
		char printChar;
		
		System.out.println("Enter the length of the side");
		sideLength = s.nextInt();
		
		System.out.println("Enter the character to build the box with...");
		printChar = s.next().charAt(0);
		
		System.out.println();
		
		// Drawing Top
		drawHorizontal(sideLength, printChar);
		
		// Drawing Sides
		drawVertical(sideLength, printChar);
		
		// Drawing Bottom
		drawHorizontal(sideLength, printChar);
		
		s.close();
	}
	
	public static void drawHorizontal(int len, char ch) {
		for (int i = 1; i < len; i++) {
			// char with padding (of two spaces)
			System.out.print(ch + " ");
		}
		System.out.println(ch);
	}
	
	public static void drawVertical(int len, char ch) {
		for (int i = 1; i < len-1; i++) { // each iteration represents a line of box
			
			// drawing left side - (tight to the left + two space pads)
			System.out.print(ch + " ");
			
			//  now pad out middle -
			for (int j = 1; j < len-1; j++) {
				System.out.print("  ");
			}
			// drawing right side - eg "*" because of last middle that's place the char to
			// the right (tight)
			System.out.println(ch);
		}
	}
}
