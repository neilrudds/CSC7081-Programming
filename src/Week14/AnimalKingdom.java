package Week14;

/***
 * The Java virtual machine (JVM) calls the appropriate method for the object that is referred to in each variable.
 * 
 * It does not call the method that is defined by the variable's type.
 * 
 * This behaviour is referred to as virtual method invocation and demonstrates an aspect of an important polymorphism
 *  feature in the Java language
 * 
 * @author neilr
 *
 */

public class AnimalKingdom extends Animal {
	
	public static void main(String[] args) {

		polymorphicProcessing();
		argumentProcessing();
		
	}
	
	public static void polymorphicProcessing() {
		// Creates 3 Animal variables.
		Animal animal1, animal2, animal3;
			
		// Each variable is assigned to one of the Animal classes.
		animal1 = new Animal(); // Superclass
		animal2 = new Dog(); // Dog Class
		animal3 = new Lion(); // Lion Class
			
		// Each variable is then printed.
		animal1.makeNoise();
		animal2.makeNoise();
		animal3.makeNoise();
				
		// Animal Kingdom - Polymorphic processing
		// Create a polymorphic array - and add animal types
				
		Animal[] animals = new Animal[3];
		animals[0] = new Dog();
		animals[1] = new Lion();
		animals[2] = new Animal();
				
		// cycle through the array
		for(Animal a : animals) {
			// the correct method is called
			a.makeNoise();
		}
	}
	
	public static void argumentProcessing() {
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		Lion lion = new Lion();
		Animal anotherLion = new Lion();
		
		doDolittle(animal);
		doDolittle(dog);
		doDolittle(lion);
		doDolittle(anotherLion);
	}
	
	public static void doDolittle(Animal animal) {
		animal.makeNoise();
	}
}
