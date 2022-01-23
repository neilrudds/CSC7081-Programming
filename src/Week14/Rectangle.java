package Week14;

/***
 * Polymorphism - OOP, Exercise
 * @author neilr
 */

public class Rectangle extends Shape {

    private int height;
    private int breadth;

    /**
    * Constructor
    */
    public Rectangle(){

    }

     /**
     * Constructor with args
     * @param height
     * @param breadth
     */
    public Rectangle(int height, int breadth){
        this.height = height;
        this.breadth = breadth;
    }

     /**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the breadth
	 */
	public int getBreadth() {
		return breadth;
	}

	/**
	 * @param breadth the breadth to set
	 */
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public void area(){
		System.out.println("Rectangle : "+ this.height * this.breadth);
	}
    
}
