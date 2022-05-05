package Challenges.OOP.ProgrammingToInterface;

import java.util.Random;

/**
 * Class with the main method 
 * @author aidan mcgowan
 */
public class MyController {
	
	
	private static final int NUMBER_OF_SHAPES = 10;

	/**
	 * Ad hoc test of the interface and classes
	 * @param args
	 */
	public static void main(String[] args) {
		
		//array to hold shapes of all three types
		IMyShape myShape[] = new IMyShape[NUMBER_OF_SHAPES];
		
		//create random number generator
		Random generator = new Random();
		
		int temp = 0;
		
		//randomly create the shapes and store in array 
		for (int loop = 0; loop < NUMBER_OF_SHAPES; loop++){
			
			switch (generator.nextInt(3)) {
				case 0 : myShape[loop] = new MyCircle(generator.nextDouble()*generator.nextInt(10));
						 break; 
				case 1 : myShape[loop] = new MySquare(generator.nextDouble()*generator.nextInt(10));
						 break;
				case 2 : myShape[loop] = new MyRectangle(generator.nextDouble()*
						generator.nextInt(10),generator.nextDouble()*generator.nextInt(10));
				
			}
		}
		
		//display the names, areas and perimeters of shapes in array - note use of programming to an interface
		System.out.println();
		for (IMyShape shape : myShape){
			System.out.print(shape.getShapeName());
			System.out.printf(" Area: %.2f",shape.calculateArea());
			System.out.printf(" Perimeter: %.2f",shape.calculatePerimeter());
			System.out.println();
			
		}
				
	}

}
