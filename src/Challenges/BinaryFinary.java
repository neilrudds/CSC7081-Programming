package Challenges;

public class BinaryFinary {

	public static void main(String[] args) {
		
		boolean[] eightBitArray = { true, false, false, true, false, true, false, true }; // 128 + 16 + 4 + 1 = 149
		
		displayArrayAsBinary(eightBitArray);
		System.out.printf("Decimal: %d%n", convertBinaryArrayToDecimal(eightBitArray));

	}
	
	public static void displayArrayAsBinary(boolean[] arrayToDisplay) {
		for (int i = 0; i < arrayToDisplay.length; i++) {
			if (arrayToDisplay[i]) {
				System.out.print("1" + " ");
			} else {
				System.out.print("0" + " ");
			}
		}
		System.out.println();
	}
	
	// incorrect....
	public static int convertBinaryArrayToDecimal(boolean[] arrayToConvert) {
		
		int decimal = 0;
		
		// MSB -> LSB, change to (int i = arrayToConvert.length - 1; i >= 0; i--) for LSB -> MSB
		for (int i = 0; i < arrayToConvert.length; i++) {
			if(arrayToConvert[i]) {
				decimal += (int)Math.pow(2, (arrayToConvert.length - 1) - i);
			}
		}
		return decimal;
	}

}
