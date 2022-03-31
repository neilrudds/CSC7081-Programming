package Week18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ListDemos {
    
    public static void main (String[] args) {

        // create a list (of type ArrayList)
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Dublin");
        arrList.add("Barcelona");
        arrList.add("Paris");

        // create a list (of type LinkedList)
        LinkedList<String> lnkList = new LinkedList<String>();
        lnkList.add("London");
        lnkList.add("Belfast");
        lnkList.add("New York");
        
        // Which method is being called, the overloaded based on input type or the collection
        showAll(arrList);
        showAll(lnkList);
    }

    /**
     * Displays all elements in an ArrayList of type String
     * @param inputList
     */
    public static void showAll(ArrayList<String> inputList) {
        System.out.print("ArrayList: ");
        for (String s : inputList) {
            System.out.println(s);
        }
    }

    /**
     * Displays all elements in a List of type string
     * @param inputList
     */
    public static void showAll(LinkedList<String> inputList) {
        System.out.print("LinkedList: ");
        for (String s : inputList) {
            System.out.println(s);
        }
    }

    /**
     * Displays all elements in the collection of type string
     * Remove the ArrayList and LinkedList methods and this method will be called
     * Could use Collection<?> very generic, but is it type safe?
     * @param inputList
     */
    public static void showAll(Collection<String> inputList) {
        System.out.print("Collection: ");
        for (String s : inputList) {
            System.out.println(s);
        }
    }

}