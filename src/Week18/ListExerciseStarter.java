package Week18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListExerciseStarter {

    public static void main(String[] args) {

        ArrayList<Integer> arList = new ArrayList<Integer>();
        arList.add(5);
        arList.add(52);
        arList.add(5);
        arList.add(21);
        arList.add(5);

        LinkedList<Integer> linkList = new LinkedList<Integer>();
        linkList.add(21);
        linkList.add(99);
        linkList.add(5);
        linkList.add(80);

        System.out.println("Original List: " + arList.toString());
        System.out.println("To Remove List: " + linkList.toString());
        removeMatches(arList, linkList);
        System.out.println("Original List with values removed: " + arList.toString());
        
        System.out.println("end");

    }
    
    /**
     * Removes occurances of values in the toRemove list from the inputList
     * @param inputList
     * @param toRemove
     */
    public static void removeMatches(List<Integer> inputList, List<Integer> toRemove) {
        /*for(Integer val : toRemove){
            while (inputList.contains(val)){
                inputList.remove(val);
            }
        }*/
        inputList.removeAll(toRemove);
    }

    public static void actuallyRemoveDuplicates(List<Integer> toModify) {
        List<Integer> unique = new ArrayList<Integer>();
        for(Integer val : toModify) {
            if(!unique.contains(val)) {
                unique.add(val);
            }
        }
        toModify.clear();
        toModify.addAll(unique);
        //System.out.println("Identify uniques: " + unique.toString());
    }

    public static void actuallyRemoveDuplicates2(List<Integer> toModify) {
        Set<Integer> intSet = new HashSet<Integer>(toModify);
        toModify.clear();
        toModify.addAll(intSet);
    }

}
