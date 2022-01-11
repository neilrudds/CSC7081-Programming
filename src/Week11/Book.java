package Week11;

/**
 * Cunstructor - Exercise 1
 * 
 * @author neilr
 *
 */
public class Book {
	private String title;

	/**
	 * Default constructor
	 */
	public Book() {

	}

	/**
	 * Constructor with args
	 * 
	 * @param title
	 */
	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}