/**
 * 
 */
package Week5;

/**
 * @author neilr
 *
 * In Java, there are two types of casting:
 *
 * Widening Casting (automatically) – 
 * 	converting a smaller type to a larger type size
 *  byte -> short -> char -> int -> long -> float -> double
 * 
 * Narrowing Casting (manually) – type
 *  converting a larger type to a smaller size
 *  double -> float -> long -> int -> char -> short -> byte
 */
 
public class TypeCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		wideningCasting();
		automaticWideningCasting();
		castingExampleI();
		castingExampleII();
		castingExampleIII();
	}
	
	/**
	 * When two compatible types are mixed in an assignment the value on the right
	 * is automatically converted to the value in the left.
	 * 
	 * Note; not all of Java’s types are implicitly allowed e.g. … boolean to int
	 * are not compatible
	 */
	public static void wideningCasting() {
		int a;
		double b, answer;
		a = 6; // int
		b = 9.9999; // double
		answer = a + b; // So in this case the value a (int) is converted automatically to a double 
		System.out.println(answer);
	}
	
	/**
	 * When one type of data is assigned to another type of variable an automatic
	 * type conversion takes place if :
	 *  - The two types are compatible
	 *  - The destination is larger than the source
	 */
	public static void automaticWideningCasting() {
		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double

		System.out.println(myInt);      // Outputs 9
		System.out.println(myDouble);   // Outputs 9.0
	}

	/*
	 * Casting incompatible types
	 *
	 * Automatic type conversion is helpful but will not fulfil all programming needs …
	 * Attempting to store the integer part of this following double division will cause a compile time error….
	 *
	 * double double1, double2;
     * double1 =21.3;
     * double2 = 3.4;
     * int answer; 
     * answer = double1/double2;
     * System.out.println(answer);
	 *
	 * Therefore an explicit cast is required. To do this you’ll need to place the desired
	 *  datatype in brackets and also bracket the whole expression you wish to narrow.
	 *
	 * double double1, double2;
     * double1 =21.3;
     * double2 = 3.4;
     * int answer; 
     * answer = (int) (double1/double2); -> 6
     * System.out.println(answer);
	 *
	 * Even though double1 and double2 are doubles the cast converts expression to to int.
	 * 
	 * answer = (int) (double1/double2);
	 *
	 * The brackets (parentheses) surrounding double1/ double2 are required. Otherwise
	 *  the cast would only apply to the double1. The cast is necessary as there is no
	 *  automatic conversion between double and int. 
	 *
	 * Note the loss of information : the actual answer is 6.264705882352941 (if the expression
	 *  was left as a double). But as this is a narrowing conversion the fractional element is
	 *  lost (due to truncation). 
	 */
	
	public static void castingExampleI() {
		int int1;
		double double1, ans;

		int1 = 7;
		double1 = 22;
		// note NO cast needed here as the right hand side will be automatically widened
		ans = double1 / int1;
		System.out.println(ans);
	}
	
	public static void castingExampleII() {
		int i;
		byte b;
		i = 265;
		b = (byte) i; // going to cast (narrow) but careful now ! A byte cannot hold that value
		System.out.println(b); // unexpected result here. It overflows.
	}

	public static void castingExampleIII() {
		// incompatible types ... unexpected result
		int i;
		char ch;
		i = 88; // ascii code for x
		ch = (char) i;
		System.out.println(ch); // maybe not what was expected !
	}

}
