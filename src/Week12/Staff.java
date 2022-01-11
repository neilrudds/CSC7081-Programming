/**
 * 
 */
package Week12;

/**
 * Makes use of the Doctor, Programmer & StaffMember objects
 * @author neilr
 *
 */
public class Staff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//StaffMember s1 = new StaffMember("Joe", "Bloggs"); // SuperClass - Now *abstract* and cannot be instantiated
		//System.out.println(s1);
		
		Doctor d1 = new Doctor("Bob", "Jones", 17); // SubClass
		System.out.println(d1.toString());
		d1.setFirstName("Bobby");
		System.out.println(d1.toString());
		
		Programmer p1 = new Programmer("Linus", "Torvalds");
		System.out.println(p1.toString());
		p1.setLanguage("C");
		System.out.println(p1.toString());
		
		Programmer p2 = new Programmer("Neil", "Rutherford", "Java");
		System.out.println(p2.toString());
		
		Surgeon su1 = new Surgeon("Michael", "Frank", 21, "Heart"); //SubClass of a SubClass
		System.out.println(su1.toString());
	}

}
