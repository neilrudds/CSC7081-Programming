# CSC7081---Programming
## Interfaces

> Week 16 focuses on Interfaces (OOP).

# Interfaces

- As we have already learned, objects define there interaction with the outside world through the methods that they expose.

- Methods form the object's interface with the outside world; the buttons on a TV remote, for example are the interface between you and the electrical wiring on the other side of the TV. You press the "power" button to turn the television on and off.

## Java Interfaces

- In its most common form, an interface is a group of related methods with empty bodies.

- Implementing an interface allows a class to become more formal about the behaviour it promises to provide. Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler. If your class claims to implement an interface, all methods defined by that interface must appear in its source code before the class will sucessfully compile.

## An interface is similar to a class in the following ways

- An interface can contain any number of methods.

- An interface is written in a file with a .java extension, with the name of the interface matching the name of the file.

- The bytecode of an interface appears in a .class file.

- Interfaces appear in packages and their corresponding bytecode file must be in a directory structure that matches the package name.

## An interface differs from a class in the following ways

- You cannot instantiate an interface.

- An interface does not contain any constructors.

- Commonly most of the methods in an interface are abstract.

- An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.

- An interface is not extended by a class; it is implemented by a class.

- An interface can extend multiple interfaces.

## Declaring Interfaces

- The interface keyword is used to declare an interface. Here is a simple example to declare an interface:
```
public interface NameOfInterface
{
    // Any number of final, static fields
    // Any number of abstract method declarations
}
```

## Interfaces have the following properties

- An interface is implicitly abstract. You do not beed to use the abstract keyword when declaring an interface.

- Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.

- Methods in an interface are implicitly public.

## Example
```
/* Filename: Animal.java */
interface Animal {
    public void eat();
    public void travel();
} 
```

## Implementing Interfaces

- When a class implements an interface, you can think of the class as signing a contract, agreeing to perform the specific behaviours of the interface, the class must declare itself as abstract.

- A class uses the implements keyword to implement an interface. The implements keyword appears in the class declaration following the extends portion of the declaration.

## When overriding methods defined in interfaces

- The signature of the interface method and the same return type or subtype should be maintained when overriding the methods.

- Checked exceptions should not be delcared on implementation methods other than the ones declared by the interface method or subclasses of those declared by the interface method.

- An implementation class itself can be abstract and if so interface methods need not be implemented.

## When implementing interfaces there are several rules

- A class can impplement more that one interface at a time.

- A class can extend only one class, but implement many interfaces.

- An interface can extend another interface, similar to the way that a class can extend another class.