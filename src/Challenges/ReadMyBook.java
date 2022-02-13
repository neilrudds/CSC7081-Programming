package Challenges;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadMyBook {

	public static void main(String[] args) {
		
		String resourcesPath = "Resources/";
					
		File file = new File(resourcesPath + "Catch 22.txt");
		File redactedFile = new File(resourcesPath + "Catch22Redacted.txt");
		
		int numberOfLines = 0;
		int numberOfWords = 0;
		int numberOfChars = 0;
		int numberOfYossa = 0;
		int numberOfa = 0;
		String line;
		
		try {

			// Create a file reader object relating to the file
			FileReader fr = new FileReader(file.getName());

			// Note, using BufferWriter is more efficient with multiple writes to file
			BufferedReader br = new BufferedReader(fr);

			// Read the contents
			line = br.readLine();
			while (line != null) {
				System.out.println(line);
				numberOfChars += line.length();
				numberOfLines++;
				
				// number of words in the line - need to tokenise
				String[] words = line.split(" ");
				numberOfWords += words.length;

				// finding instances of "Yossarian"
				if (line.contains("Yossarian")) {
					numberOfYossa++;
					
					// String redact with ---------
					String redactedLine = line.replace("Yossarian", "---------");
					writeToFile(redactedFile, redactedLine + "\n");
					
				} else {
					writeToFile(redactedFile, line + "\n");
				}
				
				// How many Aa characters
				for(int i = 0; i < line.length(); i++) {
					switch (line.charAt(i)) {
					case 'a':
					case 'A': 
						numberOfa++;
						break;
					default :
						// nothing to do here ?
					}
				}
				
				line = br.readLine();			
			}

			// Close all resources
			br.close();
			fr.close();
			
			System.out.printf("Number of lines: %d\n", numberOfLines);
			System.out.printf("Number of words: %d\n", numberOfWords);
			System.out.printf("Number of characters: %d\n", numberOfChars);
			System.out.printf("Number of Yossarian: %d\n", numberOfYossa);
			System.out.printf("Number of a characters: %d\n", numberOfa);

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

			FileWriter fw = new FileWriter(file, true);

			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(string);
			bw.close();
			System.out.println("Write Complete");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
	
	