package Week14;

/***
 * Polymorphism - OOP, Exercise
 * @author neilr
 */

public class ShapeFactory {

    public static void main(String[] args) {
        
        Shape shape = new Shape();
		
		Shape r = new Rectangle(2,4);
		Shape c = new Circle(3.1);
		
		calculateArea(r);
		calculateArea(c);
		
		Shape[] shapes = new Shape[3];
		shapes[0] = shape;
		shapes[1] = r;
		shapes[2] = c;
		
		calculateArea(shapes);

    }
    
    /**
	 * Calculates the area of a given shape type
	 * @param s
	 */
	public static void calculateArea(Shape s){
		s.area();
	}
	
	/**
	 * Calculates the area of given shape types in an array of shapes
	 * @param shapes
	 */
	public static void calculateArea(Shape[] shapes){
		for (Shape s : shapes){
			if (s!=null){
				s.area();
			}
		}
	}
    
}
