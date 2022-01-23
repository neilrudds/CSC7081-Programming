package Week15;

// Generic ArrayList<T> collection
import java.util.ArrayList;
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

    }

    
    
}
