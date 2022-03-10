# CSC7081---Programming
## Java Collections Framework - JCF

> Week 18 focuses on the Java Collections Framework.

# Collections - Introduction

- A collection — sometimes called a container — is simply an object that groups multiple elements into a single unit.

- Collections are used to store, retrieve, manipulate and communicate aggregate data.

- Typically, they represent data items that form a natural group, such as a poker hand (a collection of cards), a mail folder (a collection of letters), or a telephone directory (a mapping of names to phone numbers).

# What is the Collections framework

- A collections framework is a unified architecture for representing and manipulating collections. All collections frameworks contain the following:

    - Interfaces
    - Implementations
    - Algorithms

# Collections - Interfaces

- These are Abstract Data Types that represent collections.

- Interfaces allow collections to be manipulated independently of the details of their representation.

- In object-oriented languages, interfaces generally form a hierarchy.

# Collections - Implementations

- These are the concrete implementations of the collection interfaces. 

- In essence, they are reusable data structures.

- These include, ArrayList, LinkedList, HashSet, TreeSet, PriorityQueue Hashtable, HashMap, TreeMap …

# Collections - Algorithms

- These are the methods that perform useful computations, such as searching and sorting, on objects that implement collection interfaces. 

- The algorithms are said to be polymorphic: that is, the same method can be used on many different implementations of the appropriate collection interface. In essence, algorithms are reusable functionality.

# Benefits of the Java Collection Framework - What is in it for you ?

- Reduces programming effort

    - By providing useful data structures and algorithms, the Collections Framework frees you to concentrate on the important parts of your program rather than on the low-level "plumbing" required to make it work. By facilitating interoperability among unrelated APIs, the Java Collections Framework frees you from writing adapter objects or conversion code to connect APIs.

- Increases program speed and quality

    - The Collections Framework provides high-performance, high-quality implementations of useful data structures and algorithms. The various implementations of each interface are interchangeable, so programs can be easily tuned by switching collection implementations. Because you're free from the drudgery of writing your own data structures, you'll have more time to devote to improving programs' quality and performance.

- Allows interoperability among unrelated APIs

    - The collection interfaces are the vernacular by which APIs pass collections back and forth. If my network administration API furnishes a collection of node names and if your GUI toolkit expects a collection of column headings, our APIs will interoperate seamlessly, even though they were written independently.

- Reduces effort to learn and to use new APIs

    - Many APIs naturally take collections on input and furnish them as output. In the past, each such API had a small sub-API devoted to manipulating its collections. There was little consistency among these ad hoc collections sub-APIs, so you had to learn each one from scratch, and it was easy to make mistakes when using them. With the advent of standard collection interfaces, the problem went away.

- Reduces effort to design new APIs

    - This is the flip side of the previous advantage. Designers and implementers don't have to reinvent the wheel each time they create an API that relies on collections; instead, they can use standard collection interfaces.

- Fosters software reuse

    - New data structures that conform to the standard collection interfaces are by nature reusable. The same goes for new algorithms that operate on objects that implement these interfaces.

# The Collections Framework

```
                     ____________                                  ____________   
                    |            |                                |            | 
                    | Collection |                                |    Map     |
                    |____________|                                |____________|
                          |                                             |            
       ----------------------------------------                         |
       |                  |                   |                         |
 ______|_____        _____|______        _____|______              _____|_____ 
|            |      |            |      |            |            |           |   
|     Set    |      |    List    |      |    Queue   |            |  Sorted   |
|____________|      |____________|      |____________|            |    Map    |
       |                                                          |___________|
 ______|_____
|            |
|   Sorted   |
|    Set     |
|____________|
```

# Collection

- The root of the collection hierarchy. 

- A collection represents a group of objects known as its elements. 

- It is an Interface – you can’t instantiate it.

- The Collection interface is the least common denominator that all collections implement and is used to pass collections around and to manipulate them when maximum    generality is desired.

- Some types of collections allow duplicate elements, and others do not. Some are ordered and others are unordered. 

- The Java platform doesn't provide any direct implementations of this interface but provides implementations of more specific subinterfaces, such as Set and List. 

- By convention all general-purpose collection implementations (Lists, Sets etc.) have a constructor that takes a Collection argument. 

- This constructor, known as a conversion constructor, initialises the new collection to contain all of the elements in the specified collection, whatever the given collection's subinterface or implementation type. In other words, it allows you to convert the collection's type.

- The interface provides the following methods…

    http://docs.oracle.com/javase/8/docs/api/java/util/Collection.html

- Methods that operate on single collections size, isEmpty, contains, add, remove and iterator. 

- Methods that operate on entire collections, containsAll addAll, removeAll, retainAll and clear. 

- Methods for array operations (such as toArray)

# List

- An ordered collection (sometimes called a sequence).

- Lists can contain duplicate elements.

- The user of a List generally has precise control over where in the list each element is inserted and can access elements by their integer index (position). 

- The Java platform contains two general-purpose List implementations.

    - ArrayList, which is usually the better-performing implementation

    - LinkedList which offers better performance under certain circumstances. 

- In addition to the operations inherited from Collection, the List interface includes operations for the following:

    - Positional access — manipulates elements based on their numerical position in the list. This includes methods such as get, set, add, addAll, and remove.

    - Search — searches for a specified object in the list and returns its numerical position. Search methods include indexOf and lastIndexOf.

    - Iteration — extends Iterator semantics to take advantage of the list's sequential nature. The listIterator methods provide this behaviour.

    - Range-view — The sublist method performs arbitrary range operations on the list.

- LinkedList and ArrayList are two different implementations of the List interface. 

- LinkedList implements it with a doubly-linked list.

```
 ____        ____        ____        ____        ____        ____
| 25 | <--> | 12 | <--> | 30 | <--> | 10 | <--> | 36 | <--> | 15 |
```
 
- ArrayList Implements it with a dynamically resizing array.

```
```

- ArrayList vs. LinkedList Performance

    - Linked List allows for constant-time insertions or removals using iterators, but only sequential access of elements. In other words, you can walk the list forwards or backwards, but finding a position in the list takes time proportional to the size of the list.

    - ArrayList allows fast random read access, so you can grab any element in constant time. But adding or removing from anywhere but the end requires shifting all the latter elements over, either to make an opening or fill the gap. 

- List - exercise

- Remove duplicates exercise

- Create an arraylist and a linked list.  Populate both lists with 10 random numbers (value range 1-5)

- Complete the following method …

```
public static void removeDuplicates(Collection<Integer> originalList,  Collection<Integer> listToRemove)
```
- The originalList passed as a parameter will have any items removed from it that exist in the second list (listToRemove)

- LinkedList  - swap elements

    - Create a method to swap elements in an List, given the following method signature to reorder the output to  

```
    public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("I");
		linkedList.add("dream");
		linkedList.add("have");
		linkedList.add("a");
		
		// not quite right ? 
		System.out.println(linkedList.toString());
		
		
		swap(linkedList, 1, 2);
		System.out.println(linkedList.toString());
		swap(linkedList, 2, 3);
		System.out.println(linkedList.toString());
		
	}

	public static void swap(List<String> list, int position1, int position2){
		String tmp = list.get(position1);
		list.set(position1, list.get(position2));
		list.set(position2, tmp);
	}

```

# Collections Framework – Algorithms. Collections class 

- Most polymorphic algorithms in the Collections class apply specifically to List. 
- Having all these algorithms at your disposal makes it very easy to manipulate lists. 
- Class Collections provides static methods that search, sort and perform other operations on collections.  Methods provided by Collections  

```
    ------------------------------------------------------------------------------------------
    Method        | Description
    ------------------------------------------------------------------------------------------
    sort          | Sort the elements of a List.
    binarySearch  | Locates the object in a List.
    reverse       | Reverses the elements of a List.
    shuffle       | Randomly orders a List's elements.
    fill          | Sets every List element to refer to a specified object.
    copy          | Copies references from one List into another.
    min           | Returns the smallest element in a Collection.
    max           | Returns the largest element in a Collection.
    addAll        | Appends all elements in an array to a Collection.
    frequency     | Calculates how many collection elements are equal to the specified element.
    disjoint      | Determines whether two collections have no elements in common.
```
- Summary

```
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
	linkedList.add(333);
	linkedList.add(2);
	linkedList.add(89);
	linkedList.add(8282);
	linkedList.add(8282);

	System.out.println(linkedList.toString());
	// sort
	Collections.sort(linkedList);
	System.out.println(linkedList.toString());
		
	// reverse
	Collections.reverse(linkedList);
	System.out.println(linkedList.toString());
		
	// shuffle
	Collections.shuffle(linkedList);
	System.out.println(linkedList.toString());
		
	// min
	System.out.println("Min value : "+Collections.min(linkedList));
		
	// max
	System.out.println("Max value : "+Collections.max(linkedList));
		
	// frequency
	System.out.println("Frequency value (8282) in the list : "+Collections.frequency(linkedList, 8282));

```

# Collections class - sort

- The sort operation uses a slightly optimized merge sort algorithm that is fast and stable:

    - Fast: It is guaranteed to run in n log(n) time and runs substantially faster on nearly sorted lists. Empirical tests showed it to be as fast as a highly optimized quicksort. A quicksort is generally considered to be faster than a merge sort but isn't stable and doesn't guarantee n log(n) performance.

    - Stable: It doesn't reorder equal elements. This is important if you sort the same list repeatedly on different attributes. If a user of a mail program sorts the inbox by mailing date and then sorts it by sender, the user naturally expects that the now-contiguous list of messages from a given sender will (still) be sorted by mailing date. This is guaranteed only if the second sort was stable.

- Prints out its arguments in lexicographic (alphabetical) order

```
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassSort {

    public static void main(String[] args) {

        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        // Create and display a list containing the suits array elements
        List<String> list = Arrays.asList(suits); // create list
        System.out.printf("Unsorted array elements: %s\n", list);

        // sort ArrayList
        Collections.sort(list);

        // Output list
        System.out.printf("Sorted array elements: %s\n", list);

    }

}
```

# Collections class - reverse sort

    -The example introduces the Comparator interface, which is used for sorting a Collection’s elements in a different order. The call to the Collection class sort method is to order the List in descending order. The static Collections method reverseOrder returns a Comparator object that orders the collection’s elements in reverse order.

```
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassReverseSort {

    public static void main(String[] args) {

        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        // Create and display a list containing the suits array elements
        List<String> list = Arrays.asList(suits); // create list
        System.out.printf("Unsorted array elements: %s\n", list);

        // sort ArrayList
        Collections.sort(list, Collections.reverseOrder());

        // Output list
        System.out.printf("Sorted array elements: %s\n", list);

    }

}
```

# Collections class - shuffle

```
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsClassShuffle {

    public static void main(String[] args) {

        // create an arraylist of ints
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        // shuffle the list of numbers
        Collections.shuffle(list, new Random());
        System.out.println(list);
    }

}
```

# Collections class - Routine Data Manipulation

- Reverse
    - reverses the order of the elements in a List.

- Fill 
    - overwrites every element in a List with the specified value. This operation is useful for reinitialising a List.

- Copy 
    - takes two arguments, a destination List and a source List, and copies the elements of the source into the destination, overwriting its contents. 

- Swap 
    - swaps the elements at the specified positions in a List.

- AddAll 
    - adds all the specified elements to a Collection. The elements to be added may be specified individually or as an array.

# Collections class - Search

- The binarySearch algorithm searches for a specified element in a sorted List.

- This algorithm has two forms.

    - The first takes a List and an element to search for (the "search key"). This form assumes that the List is sorted in ascending order according to the natural ordering of its elements.	

    - The second form takes a Comparator in addition to the List and the search key, and assumes that the List is sorted into ascending order according to the specified Comparator. The sort algorithm can be used to sort the List prior to calling binarySearch.

# Collections class - Search

```
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassSearch1 {

    public static void main(String[] args) {

        int searchIndex = 0;

        String[] conutries = { "Italy", "France", "USA", "New Zeland" };

        // Create and display a list containing the countries array elements
        List<String> list = Arrays.asList(countries); // create list
        
        // sort ArrayList
        Collections.sort(list);
        System.out.println(list);

        // search for a country on list
        searchIndex = Collections.binarySearch(list, "USA");
        System.out.println(searchIndex); // 3


        // search for a country not on the list
        searchIndex = Collections.binarySearch(list, "England");
        System.out.printf(searchIndex); // -1

    }

}
```

# Collections class – Min and Max

```
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsClassMinMax {

    public static void main(String[] args) {

        // Create a list of random numbers
        List<Integer> numbers = new ArrayList<Integer>();
        
        for (int loop = 1; loop < 10; loop++) {
            numbers.add(new Random().nextInt(100));
        }
        System.out.println(numbers);

        // get the max and min values
        System.out.println("Max value : " + Collections.max(numbers));
        System.out.println("Min value : " + Collections.min(numbers));

    }

}
```

# Collections class – Composition

- The frequency and disjoint algorithms test some aspect of the composition of one or more Collections:

    - frequency : counts the number of times the specified element occurs in the specified collection

    - disjoint : determines whether two Collections are disjoint; that is, whether they contain no elements in common

```
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassFrequency {

    public static void main(String[] args) {

        // Create a list of numbers
        Integer[] nums = { 3, 4, 5, 6, 3, 4, 8, 9 };
        List<Integer> numbers = new Array.asList(nums);
        
        System.out.println(numbers);
        System.out.printf("The number 4 appears %d times in the list", Collections.frequency(numbers, 4));

    }

}
```

# Set

- A Set is an unordered Collection of unique elements (i.e., no duplicate elements).

- This interface models the mathematical set abstraction and is used to represent sets, such as the cards comprising a poker hand, the courses making up a student's schedule, or the processes running on a machine. 

- The collections framework contains several Set implementations, including HashSet and TreeSet. 
    
    - HashSet stores its elements in a hash table (better performance, constant time additions, removal, contains )
    
    - TreeSet stores its elements in a tree. (useful for potential sorting)

```
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {

        // create amd display a List<String>
        String colors = { "red", "white", "blue", "green", "gray", "orange",
             "tan", "white", "cyan", "peach", "gray", "orange" };
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s\n", list);

        // eliminate duplicates then print the unique values
        printNonDuplicates(list);

    }

    private static void printNonDuplicates(Collection<String> values) {
        // create a hashset
        Set<String> set = new HashSet<String>(values);
        System.out.print("\nNonduplicates are: ");

        for (String value : set)
            System.out.printf("%s ", value);

        System.out.println();
    }

}

```

Program uses a HashSet to remove duplicate strings from a List. Recall that both List and Collection are generic types, so firstly a List is created that contains String objects, and is then passed as a Collection of Strings to method printNonDuplicates.

Method printNonDuplicates takes a Collection argument. Then a HashSet<String>  is constructed from the Collection<String> argument. By definition, Sets do not contain duplicates, so when the HashSet is constructed, it removes any duplicates in the Collection.

A hash table stores information by using a mechanism called hashing. In hashing, the informational content of a key is used to determine a unique value, called its hash code.

The hash code is then used as the index at which the data associated with the key is stored. The transformation of the key into its hash code is performed automatically.

