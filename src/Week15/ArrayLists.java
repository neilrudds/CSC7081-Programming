package Week15;

// Generic ArrayList<T> collection
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 * ArrayLists
 * 
 * @author neilr
 */

public class ArrayLists {

    public static void main(String[] args) {

        // Declaration (In this case, an ArrayList of Strings)
        // Note. ArrayLists don't support primitive types
        ArrayList<String> items = new ArrayList<String>();

        // Adding an item... add()
        items.add("Apples");
        // Add another string
        items.add("Oranges");
        // add another string at the first position
        items.add(0, "Pears");

        // get the size of the ArrayList
        System.out.println("Size of ArrayList " + items.size());

        System.out.println(items.toString());

        // Looping through, 3 ways...

        // view all items
        // Standard FOR loop - good if you need the index value
        for (int loop=0; loop<items.size(); loop++){
            System.out.println(items.get(loop));
        }

        // enhanced for
        // FOREACH – good to go through but not remove items
        for (String item:items){
            System.out.println(item);
        }

        // iterator
        // Iterator – good if you don’t have the index but still need to remove an item
        Iterator<String> it = items.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Search for... contains()
        if (items.contains("Pears")){
            System.out.println("Got some pears");
        }

        System.out.println(items.contains("Pears") ? "got some pears" : "no pears");

        // Gets & Sets
        // get element at specified position
        System.out.println("Element at 2nd position: " + items.get(1));

        // set element at specific position
        items.set(1, "Peach");
        System.out.println(items.toString());

        // Sorting an ArrayList
        // unsorted
        System.out.println("Unsorted: " + items.toString());

        // use the ArrayList.toArray to create an array of the items
        Object[] anArray = items.toArray();
        // use the Arrays class to sort
        Arrays.sort(anArray);

        // update the ArrayList
        for (int loop = 0; loop < items.size(); loop++){
            items.set(loop, anArray[loop].toString());
        }

        // sorted
        System.out.println("Sorted: " + items.toString());

        // Or
        Collections.sort(items);
        System.out.println(items.toString());

        // Remove items... remove()
        // remove the first occurance of "Oranges"
        items.remove("Oranges");
        System.out.println("After removal: " + items.toString());

        // remove the first element
        items.remove(0);
        System.out.println("After removal: " + items.toString());

        // get the size of the ArrayList
        System.out.println("Size of arraylist: " + items.size());

        // Dynamic sizing and clearing
        // reusable - dynamic expansion
        items.add("Bananas");

        System.out.println("New item added " + items.toString());

        // get the size of the ArrayList
        System.out.println("Size of arraylist: " + items.size());

        // clear all
        items.clear();

        System.out.println("All gone " + items.toString());

        // get the size of the ArrayList
        System.out.println("Size of arraylist " + items.size());

        // Demo... Merging two ArrayLists
        ArrayList<String> listA = new ArrayList<String>();
        listA.add("One");
        listA.add("Two");
        listA.add("Three");

        ArrayList<String> listB = new ArrayList<String>();
        listB.add("Four");
        listB.add("Five");

        System.out.println("list A: " + listA.toString());
        System.out.println("list B: " + listB.toString());
        
        // capture the size of the lists
        int a, b;
        a = listA.size();
        b = listB.size();

        // ensure capacity of listA
        listA.ensureCapacity(a+b);

        for (int loop = 0; loop < listB.size(); loop++){
            listA.add(listB.get(loop));
        }
        System.out.println("List A (merged): " + listA);
        
        // Try merge and remove any duplicates !
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        list2.add("Four");
        list2.add("Two");
        list2.add("Five");

        // merge without duplicates
        for (int loop = 0; loop < list2.size(); loop++) {
            if (!list2.contains(list1.get(loop))) {
                list1.add(list2.get(loop));
            }
        }
        System.out.println(list1);

        // Passing an ArrayList as a parameter
        ArrayList<String> creditableSingersList = new ArrayList<String>();
        creditableSingersList.add("Jimmy Page");
        creditableSingersList.add("Bono");
        creditableSingersList.add("Johnny Rotten");

        ArrayList<String> croonersList = new ArrayList<String>();
        croonersList.add("Daniel O'Donnell");
        croonersList.add("James Blunt");

        System.out.println("Good Singers");
        viewAllSingers(creditableSingersList);

        System.out.println("Awful Singers");
        viewAllSingers(croonersList);

        // Complex objects in an ArrayList
        // creating mountain or two
        Mountain m1 = new Mountain();
        m1.setName("Everest");
        m1.setHeight(8998);

        Mountain m2 = new Mountain();
        m2.setName("K2");
        m2.setHeight(7899);

        // creating an ArrayList to hold the mountains
        ArrayList<Mountain> mountains = new ArrayList<Mountain>();

        // add each mountain to the Mountain ArrayList
        mountains.add(m1);
        mountains.add(m2);

        // accessing all the details of each mountain by looping
        // through each one in the ArrayList
        for (Mountain mountain:mountains){
            System.out.println(mountain.getName() + " " + mountain.getHeight());
        }
    }

    /**
     * Accepts a list of strings and putputs each to screen as Uppercase
     * @param singers
     */
    public static void viewAllSingers(ArrayList<String> singers) {
        for (String singer:singers){
            System.out.println(singer.toUpperCase());
        }
    }
}