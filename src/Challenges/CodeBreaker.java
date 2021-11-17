/**
 * 
 */
package Challenges;

import java.util.Arrays;

/**
 * @author neilrutherford
 * A program that will code a string to its ASCII values
 * and back again to it's string
 */
public class CodeBreaker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String input = "Neil Rutherford";
		int[] encodedStrArr = encodeString(input);
		
		System.out.println("Encoded string: " + Arrays.toString(encodedStrArr));
		
		System.out.println();
		System.out.println();
		
		System.out.println("Decoded string: " + decodeString(encodedStrArr));

	}
	
	/**
	 * Encode the input ASCII string and returns a decimal array
	 * @param str
	 * @return
	 */
	public static int[] encodeString(String str) {
		
		int[] encodedStrArr = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			encodedStrArr[i] = (int)str.charAt(i);
		}
		return encodedStrArr;
	}
	
	/**
	 * Decode the input int array and returns decoded ASII string
	 * Note: you could also return a char array here
	 * @param charArr
	 * @return
	 */
	public static String decodeString(int[] charArr) {
		
		String decodedString = "";
		
		for(int i = 0; i < charArr.length; i++) {
			decodedString += (char)charArr[i];
		}
		return decodedString;
	}

}
