package Week18;

import java.util.ArrayList;

public class CollectionExperiment {
    public static void main(String[] args) {
        
        // Polymorphism
        //Collection<String> arList = new ArrayList<String>();
        ArrayList<String> arList = new ArrayList<String>();
        arList.add("Neil");
        arList.add("Sharon");
        arList.add("Simon");
        arList.add(1, "Peter");
        arList.add("Sharon");

        System.out.println("First list: " + arList.toString());
        System.out.println("At position 2: " + arList.get(2));
        System.out.println("Where is Sharon: " + arList.indexOf("Sharon"));
        System.out.println("Where is Sharon: " + arList.lastIndexOf("Sharon"));

        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(5);
        numList.add(7);
        numList.add(9);

        ArrayList<String> arList2 = new ArrayList<String>(arList);
        System.out.println(arList2.toString());
    }
}