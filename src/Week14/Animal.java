package Week14;

/***
 * Polymorphism - OOP
 * 
 * The dictionary definition of polymorphism refers to a principle in biology in which an organism or species can 
 * 	have many different forms or stages. This principle can also be applied to object-oriented programming and 
 * 	languages like the Java language.
 * 
 * Subclasses of a class can define their own unique behaviours and yet share some of the same functionality 
 * 	of the parent class
 * 
 * One of the key concepts of OOP.
 * 
 * Polymorphism enables you to “program in the general” rather than “program in the specific.”
 * 
 * There are two types of polymorphism
 * 1 - Compile Time polymorphism - method overloading
 * 2 - Run Time polymorphism - uses inheritance and interfaces
 * 
 * Compile polymorphism or dynamic method dispatch -
 * 
 * In Java, runtime polymorphism or dynamic method dispatch is a process in which a call to an overridden 
 * 	method is resolved at runtime rather than at compile time.
 * 
 * In this process, an overridden method is called through the reference variable of a superclass. The determination 
 * of the method to be called is based on the object being referred to by the reference variable.
 * 
 * Runtime Polymorphism -
 * 
 * Enables programs to process objects that share the same superclass (either directly or indirectly) as if they’re all 
 * objects of the superclass.
 * 
 * This can simplify programming.
 * 
 * @author neilr
 *
 */

public class Animal {
	
	public void makeNoise() {
		System.out.println("This animal makes a noise");
	}
	
}
