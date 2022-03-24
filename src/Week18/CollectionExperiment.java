package Week18;

import java.util.ArrayList;

public class CollectionExperiment {
    public static void main(String[] args) {
        ArrayList<String> arList = new ArrayList<String>();
        arList.add("Neil");
        arList.add("Sharon");
        arList.add("Simon");

        System.out.println(arList.toString());

        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(5);
        numList.add(7);
        numList.add(9);

        ArrayList<String> arList2 = new ArrayList<String>(arList);
        System.out.println(arList2.toString());
    }
}
