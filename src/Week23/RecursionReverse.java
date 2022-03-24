package Week23;

import java.util.ArrayList;

public class RecursionReverse {

    /**
     * Recursive method that enables reversal of given arraylist
     * Strips the first element of the arraylist (and stores it locally in the method)
     * Then calls itself and does the same again until then arraylist is empty
     * It then unwinds the call stack - returning to each previous method on the call stack adding the locally stored value 
     * to the arraylist. 
     * 
     * eg first call [12, 89, 99] strips the 12 
     * second call [89,99] strips the 89
     * third call [99] strips the 99
     * fouth call is the base case 
     * 
     * next the call stack unwinds 
     * the 99 is added to the array [99]
     * then the 89 is added [99, 89] 20
     * then the 12 is added [99, 89, 12] 
     * @param arrayList
     * @return
     */
    public static ArrayList<Integer> reverse(ArrayList<Integer> arrayList) {
        if(arrayList.size() > 1) { 
            Integer value = arrayList.remove(0); // remove and store locally the first element
            reverse(arrayList); // recursive call with smaller arraylist
            arrayList.add(value); // when the call stack returns here add local store of the first element to the array
            // as the call stack unwinds it continually adds the elements to the array 
        }
        return arrayList; 
    }
}