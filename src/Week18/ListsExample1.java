package Week18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListsExample1 {
    
    public static void main (String[] args) {

        // create a list (of type ArrayList)
        List<String> arrList = new ArrayList<String>();
        arrList.add("Belfast");
        arrList.add("Dublin");

        // create a list (of type LinkedList)
        List<String> lnkList = new LinkedList<String>();
        lnkList.add("London");
        lnkList.add("Cardiff");
        
        showAll(arrList);
        showAll(lnkList);
    }

    /**
     * Displays all elements in an ArrayList of type String
     * @param arrayList
     */
    public static void showAll(ArrayList<String> arrayList) {
        // foreach
        for (String s : arrayList) {
            System.out.println(s);
        }
    }

    /**
     * Displays all elements in a List of type string
     * @param list
     */
    public static void showAll(List<String> list) {
        // foreach
        for (String s : list) {
            System.out.println(s);
        }
    }

    /**
     * Displays all elements in the collection of type string
     * @param collection
     */
    public static void showAll(Collection<String> collection) {
        // foreach
        for (String s : collection) {
            System.out.println(s);
        }
    }

}