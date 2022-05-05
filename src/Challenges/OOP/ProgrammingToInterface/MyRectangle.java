package Challenges.OOP.ProgrammingToInterface;

public class MyRectangle implements IMyShape {
	
	/**
	 * The length of one side
	 */
	private double length;
	
	/**
	 * The length of one side
	 */
	private double breadth;
	
	/**
	 * The shape name
	 */
	private String shapeName;
	
	/**
	 * Default constructor
	 */
	public MyRectangle(){
	}
	
	/**
	 * Constuctor with parameter
	 * @param length of one side
	 */
	public MyRectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
		this.shapeName = "Rectangle";
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = (length * 2) + (breadth * 2);
		return perimeter;
	}

	@Override
	public double calculateArea() {
		double area = length * breadth;
		return area;
	}

	@Override
	public String getShapeName() {
		return shapeName;
	}

}
