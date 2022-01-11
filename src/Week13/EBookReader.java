package Week13;

/***
 * Abstraction Exercise
 * @author neilr
 */

public class EBookReader {
	public EBookReader() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		KindleBook kindleBook = new KindleBook();
		kindleBook.setDownloadedFromAmazon(true);
		kindleBook.readBook();
		KoboBook koboBook = new KoboBook();
		koboBook.readBook();
	}
}