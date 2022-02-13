package Week13;

/***
 * Abstraction Exercise
 * @author neilr
 */

public class EBookReader {

	/**
	 * Default Constructor
	 */
	public EBookReader() {

	}

	public static void main(String[] args) {
		KindleBook kindleBook = new KindleBook();
		kindleBook.setDownloadedFromAmazon(true);
		kindleBook.readBook();
		KoboBook koboBook = new KoboBook();
		koboBook.readBook();
	}
}