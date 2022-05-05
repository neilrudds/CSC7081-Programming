package Challenges.OOP.ProgrammingToInterface;

/**
 * Interface represents an abstract shape 
 * @author aidan mcgowan
 */
public interface IMyShape {
	
	/**
	 * Calculates the perimeter of the shape 
	 * @return the perimeter
	 */
	double calculatePerimeter();
	
	
	/**
	 * Calculates the area of the shape 
	 * @return the area
	 */
	double calculateArea();
	
	/**
	 * Gets the name of the shape
	 * @return the name of the shape 
	 */
	String getShapeName();
	
}
