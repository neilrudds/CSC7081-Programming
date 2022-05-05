package Challenges.OOP.ProgrammingToInterface;
/**
 * Class represents a Circle 
 * @author jhegarty
 */
public class MyCircle implements IMyShape {

	private double radius;
	private String shapeName;
	
	
	/**
	 * Default constructor
	 */
	public MyCircle(){
	}
	
	/**
	 * Constuctor with parameter
	 * @param radius
	 */
	public MyCircle(double radius){
		this.radius = radius;
		this.shapeName = "Circle";
	}
	
	/**
	 * Calculates the area of the circle 
	 * @return the area
	 */
	public double calculateArea() {
		double area = 3.141 * radius * radius;
		return area;
	}

	/**
	 * Calculates the perimeter of the circle 
	 * @return the perimeter
	 */
	public double calculatePerimeter() {
		double perimeter = 2 * 3.141 * radius;
		return perimeter;
	}
	
	/**
	 * Gets the name of the shape
	 * @return the name of the shape
	 */
	public String getShapeName() {
		return shapeName;
	}
	
}
