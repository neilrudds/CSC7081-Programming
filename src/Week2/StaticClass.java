package Week2;
//No import required as the java.lang package has been imported automatically

/**
 * @author neilr
 *
 */
public class StaticClass {

	/**
	 * Program demonstrates the use of static classes
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Use of static method calls
		// The class did not need to be Instantiated
		double value = 1000.0;
		double result = Math.sqrt(value);
		System.out.printf("Static method example Math.sqrt(%.2f) : %.2f\n", value, result);

		// Use of static fields
		double radius = 6;
		double area = (radius * radius) * Math.PI;
		System.out.printf("Area of the circle with radius %.2f is %.2f", radius, area);

	}

}