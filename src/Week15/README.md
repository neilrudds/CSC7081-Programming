# CSC7081---Programming
## Wrappers, ArrayLists & Enums

> Week 15 focuses on Wrappers, ArrayLists & Enums.

# Wrapper Classes (Boxing & Unboxing)

## Each of Java's eight primitive data types has a class dedicated to it:

- These are known as wrapper classes, because they "wrap" the primitive data type into an object of that class. 
    
- The wrapper classes are part of the java.lang package, which is imported by default into all Java programs.

## Purpose of wrappers - The wrapper classes in Java serves two primary purposes:

- To provide mechanism to wrap primitive values in an object so that primitives can do activities reserved for the objects like being added to collections such as ArrayList, Hashset, HashMap…

- To provide an assortment of utility functions for primitives like converting primitive types to and from string objects, converting to various bases like binary, octal or hexadecimal, or comparing various objects.

## Wrapper classes in the Java API:
```
---------------------------------------
Primitive        | Wrapper Class
---------------------------------------
boolean          | Boolean
byte             | Byte
char             | Character
int              | Integer
float            | Float
double           | Double
long             | Long
short            | Short
```
```
Integer myInt = 5;
Double myDouble = 5.99;
Character myChar = 'A';
Float myFloat = 3.14f;
Short myShort = 1234;
Byte myByte = 34;
Boolean myBoolean = true;
Long myLong = 23433333L;
```

# ArrayLists

## Recall Arrays

- Standard Java arrays ate of a fixed length.

- After arrays are created, they cannot group or shrink, which means that you must know in advance how many elements an array will hold.

```
// declare the array variable
int[] myArray;
// create the array; assign to array variable
myArray = new int[11];
```

## Collections API

- The Java API provides several predefined data structures, called collections, used to store groups of related objects. These classes provide efficent methods that organise, store and retrieve your data without requiring knowledge of how the data is being stored. This reduces application development time.

- The java.util is where you will find the ArrayList

## The ArrayList

- The ArrayList class extends AbstractList in implements the List interface.

- ArrayList supports dynamic arrays that can grow as needed "Technically speaking, ArrayList is like a dynamic array or a variable-length array".

- Array lists are created with an initial capacity (defaulted to 10).

- When this size is exceeded, the collection is automatically enlarged (reallocation).

- When objects are removed, the array may be shrunk.

## Creating an ArrayList

### The ArrayList class supports three constructors.

1. The first constructor builds an empty array list. 
    - ArrayList() (size 0 but capacity 10).

2. The following constructor builds an array list that is initialised with the elements of the collection c.
    - ArrayList(Collection c)

3. Building an array list that has the specified initial capacity. The capacity is the size of the underlying array that is used to store the elements.
    - ArrayList(int capacity)

## Common ArrayList methods
```
-------------------------------------------------------------------------------------------------------------------------
Method           | Description
-------------------------------------------------------------------------------------------------------------------------
add              | Adds an element to the end of the ArrayList.
claer            | Removes all the elements from the ArrayList.
contains         | Returns true if the ArrayList contains the specified element; otherwise, returns false.
get              | Returns the element at the specificed index.
indexOf          | Returns the index of the first occurance of the specified element in the ArrayList.
remove           | Overloaded. Removes the first occurance of the specified value or the element at the specified index.
size             | Returns the number of elements stored in the ArrayList.
trimToSize       | Trims the capacity of the ArrayList to current number of elements.
```

## ArrayList sizing
```
|<-------- size = 3 ------>|<------------------ Expansion Space ------------------>|
| Apples | Oranges | Pears |      |       |        |       |       |       |       |
|<---------------------------------- Capacity ------------------------------------>|
```

- At any point the ArrayList occupies a contigious block of memory that holds the existing items and some expansion space.
The number of actual elements is the size (returned by the size() method). The total number of possible elements is the capacity.

- The program may use the add() method to add until all the capacity in the memeory block is used up. At that stage in order to continue to expand the ArrayLists's contents are copied to another larger memory location (reallocation)

## ArrayList Sizing, Controlling

- The runtime efficency is better is the reallocation is kept to a minimum.

- ensureCapacity(int minCapacity) - allocates a block of memory with the specified minimum size.
    
- trimToSize() - Trims the capacity of the current ArrayList to it's size.

# Enums

- An enum is a type whose fields consist of a fixed set of predefined constants.

- Common example include compass directions (values of NORTH, SOUTH, EAST and WEST) and days of the week.

- Because they are constants, the names of an enum type's fields are in uppercase letters.

## When to use

- You should use enum types any time you need to represent a fixed set of constants.

- That includes natural enum types such as the planets in the solar system and data sets where you know all possible values at compoile time - for example, the choices on a menu, command line flags, and so on.