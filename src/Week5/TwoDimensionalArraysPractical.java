/**
 * 
 */
package Week5;

/**
 * @author neilr
 *
 */
public class TwoDimensionalArraysPractical {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Part 2 - 2D Arrays
		// Practical 1
		
		populateAndPrint2DArray();

	}
	
	/**
	 * Creates a 2d array and various processing activities.
	 */
	public static void populateAndPrint2DArray() {

		int[][] myArray = new int[4][4];
		int seed = 2;
		int numberOfElements = 0;
		int total = 0;

		// populate the array
		for (int row = 0; row < myArray.length; row++) {
			for (int col = 0; col < myArray[row].length; col++) {
				myArray[row][col] = seed;
				seed += 2;
				// keep the number of elements
				numberOfElements++;
			}
		}
		
		for (int row = 0; row < myArray.length; row++) {
			for (int col = 0; col < myArray[row].length; col++) {
				System.out.printf("[%d]", myArray[row][col]);
				total+=myArray[row][col];
			}
			System.out.println();
		}
		System.out.println("Total is : "+total);
		System.out.printf("Average is : %.1f",(double)total/numberOfElements);
	}
}
