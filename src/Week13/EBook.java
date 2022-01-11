package Week13;

/***
 * Abstraction Exercise
 * @author neilr
 */

public abstract class EBook {
	
	private String title;

	public EBook(){
	}

	public EBook(String title){
		this.setTitle(title);
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public abstract void readBook();
}
