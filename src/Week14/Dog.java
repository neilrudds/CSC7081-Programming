package Week14;

/***
 * Polymorphism - OOP
 * @author neilr
 */

public class Dog extends Animal {

	private int licenceNumber;

	/**
	* @param licenceNumber to be set
	*/
	public void setLicenceNumber(int licenceNumber){
		this.licenceNumber = licenceNumber;
	}

	/**
	* @return the licence number
	*/
	public int getLicenceNumber(){
		return licenceNumber;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("This dog makes a Bark!");
	}
}