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
		casting();
		
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

	public static void casting(){

		Dog dog = new Dog(); 
		dog.setLicenceNumber(1234);

		/**
		* Casting from a subclass to a superclass is called upcasting
		*(doing a cast from a derived class to a more general base class).
		*/

		Animal animal = dog;

		/**
		* There is no need to explicitly cast up the base case... the compiler knows that Dog is an Animal and doesn’t display any errors
		* but now you can't access the dog specific methods, because dog has its object reference defined as Animal then it is only possible
		* to directly access the Animal methods - not the dog !
		*/

		// But if you cast it down to a Dog reference (Downcasting) then...

		Dog anotherDog = (Dog) animal;
		System.out.println(anotherDog.getLicenceNumber()); // dog specific method

		// You may use the instanceof operator before downcasting to check if the object belongs to the specific type:#
		
		if (animal instanceof Dog) {
			Dog yetAnotherDog = (Dog) animal;
			System.out.println(yetAnotherDog.getLicenceNumber());
		}
			
	}
}