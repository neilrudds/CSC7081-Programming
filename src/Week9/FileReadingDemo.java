/**
 * 
 */
package Week9;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author neilr
 * Simple demo showing how to read and write to a file.
 */
public class FileReadingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String resourcesPath = "Resources/";
		
		// Create a file object
		File file = new File(resourcesPath + "FileReadingDemo.txt"); // Absolute path or Relative path
		
		// String to add to file
		String teamToAdd = "Wales";
		
		// Output the file contents to the screen
		readFromFile(file);
		
		// Write a string to the file
		writeToFile(file, teamToAdd);
		
		// Output the file contents to the screen
		readFromFile(file);
		
	}
	
	public static void readFromFile(File file) {
		
		String line;
		try {
			
			// Create a file reader object relating to the file
			FileReader fr = new FileReader(file);
			
			// Note, using BufferWriter is more efficient with multiple writes to file
			BufferedReader br = new BufferedReader(fr);
			
			// Read the contents
			line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			// Close all resources
			br.close();
			fr.close();
			System.out.println("File End...");
			
		} catch (FileNotFoundException e) {
			System.out.println("The file could not be found");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeToFile(File file, String string) {
		try {
			
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file, true); // true, indicates the text should be added to the end of the file, otherwise the contents will be over written!

			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(string);
			bw.close();
			System.out.println("Write Complete");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
