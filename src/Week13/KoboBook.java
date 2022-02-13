package Week13;

/***
 * Abstraction Exercise
 * @author neilr
 */

public class KoboBook extends EBook {

	/**
	 * Default Constructor
	 */
	public KoboBook() {

	}

	public KoboBook(String title) {
		super(title);
	}

	@Override
	public void readBook() {
		System.out.println("No issues. Enjoy the read...");
	}
}