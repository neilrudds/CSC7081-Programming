package Week18;

import java.util.Map;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {

        // create a TreeMap (Implements the SortedMap interface)
        Map<Integer, String> mySortedMap = new TreeMap<Integer, String>();

        // add the keys and values
        mySortedMap.put(4, "four");
        mySortedMap.put(1, "one");
        mySortedMap.put(3, "three");
        mySortedMap.put(2, "two");

        // get the keyset and output the values
        for (Integer key : mySortedMap.keySet()) {
            System.out.printf("%10d%10s \n", key, mySortedMap.get(key));
        }

    }

}
