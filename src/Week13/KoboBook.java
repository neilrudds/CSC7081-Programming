package Week13;

/***
 * Abstraction Exercise
 * @author neilr
 */

public class KoboBook extends EBook {
	public KoboBook() {
		// TODO Auto-generated constructor stub
	}

	public KoboBook(String title) {
		super(title);
	}

	@Override
	public void readBook() {
		System.out.println("No issues. Enjoy the read...");
	}
}