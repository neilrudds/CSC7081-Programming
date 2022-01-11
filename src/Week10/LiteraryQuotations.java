package Week10;

/**
 * OOP Practical - Exercise 1
 * Class has several Literary Quotes methods
 * @author neilr
 */
public class LiteraryQuotations {
	
	/**
	 * Outputs to screen a Shakespeare Quote
	 */
	public void shakespeareQuote(){
		System.out.println("Good night, good night! Parting is such sweet sorrow, that I shall say good night till it be morrow. Shakespeare");
	}
	
	/**
	 * Outputs to screen a Churchill Quote
	 */
	public void churchillQuote(){
		System.out.println("Continuous effort - not strength or intelligence - is the key to unlocking our potential. Churchill");
	}
	
	/**
	 * Outputs to screen a Wilde Quote
	 */
	public void wildeQuote(){
		System.out.println("Experience is simply the name we give our mistakes. Wilde");
	}
	
	/**
	 * Outputs to screen a George W Quote
	 */
	public void georgeWBush(){
		System.out.println("One of the great things about books is sometimes there are some fantastic pictures. George W Bush");
	}
	
	/**
	 * Outputs to screen a Einstein Quote
	 */
	public void einstein(){
		System.out.println("If the facts don't fit the theory, change the facts. Albert Einstein");
	}

	/**
	 * Ad hoc test.
	 * @param args
	 */
	public static void main(String[] args) {

		LiteraryQuotations quotes = new LiteraryQuotations();
		quotes.churchillQuote();
		quotes.shakespeareQuote();
		quotes.wildeQuote();
		quotes.georgeWBush();
		// new quote
		quotes.einstein();

	}

}
