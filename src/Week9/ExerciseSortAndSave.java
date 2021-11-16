package Week9;

import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author neilr
 * Exercise to create, open, sort and rewrite sort to a file
 */
public class ExerciseSortAndSave {

	public static void main(String[] args) {
		
		int[] numbers = getUsersNumbers();
		Arrays.sort(numbers);
		
		String resourcesPath = "Resources/";
		File file = new File(resourcesPath + "YourSortedNumbers.txt");
		writeToFile(file, Arrays.toString(numbers));
	}
	
	/***
	 * Get some numbers from the user
	 * @return array of numbers
	 */
	public static int[] getUsersNumbers() {
		int[] numbers = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please enter a number:");
			numbers[i] = sc.nextInt();
		}
		sc.close();
		return numbers;
	}
	
	/**
	 * Write a string to a file object
	 * @param file
	 * @param string
	 */
	public static void writeToFile(File file, String string) {
		try {
			
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file, false); // true, indicates the text should be added to the end of the file, otherwise the contents will be over written!

			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(string);
			bw.close();
			System.out.println("Write Complete");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
