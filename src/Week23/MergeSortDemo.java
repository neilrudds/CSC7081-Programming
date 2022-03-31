package Week23;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MergeSortDemo {
    public static void main(String[] args) {
        Integer[] nums = new Integer[] { 3, 67, -23, 45, 2, 54, 9, 45, 100, 22, 3 };
        List<Integer> toSort = new LinkedList(Arrays.asList(nums));
        System.out.println("Pre sorting: " + toSort);
        List<Integer> sorted = mergeSort(toSort);
        System.out.println("Post sorting: " + sorted);
    }

    private static List<Integer> mergeSort(List<Integer> toSort) {
        // System.out.println("Sorting "+ toSort);
        // base case
        if (toSort.size() <= 1) {
            // already sorted, return no change
            return toSort;
        }
        // recursive step
        // split the list into 2 lists
        List<Integer> list1 = toSort.subList(0, toSort.size() / 2);
        List<Integer> list2 = toSort.subList(toSort.size() / 2, toSort.size());
        // sort those 2 lists
        list1 = mergeSort(list1);
        list2 = mergeSort(list2);
        // combine/merge the 2 sorted lists
        List<Integer> merged = merge(list1, list2);
        return merged;
    }

    /**
     * receive 2 pre-sorted list and combine into one bigger sorted list
     * 
     * @param list1
     * @param list2
     * @return
     */
    private static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        // System.out.println("Combining "+list1 + "and "+ list2);
        List<Integer> combined = new LinkedList<Integer>();
        Queue<Integer> q1 = new LinkedList<Integer>(list1);
        Queue<Integer> q2 = new LinkedList<Integer>(list2);
        while (q1.size() > 0 && q2.size() > 0) {
            // while there are still values in either list
            // compare the 1st value in each list
            // and add the smallest one to the new list
            if (q1.peek() < q2.peek()) {
                // head of q1 is smallest, add that to list
                combined.add(q1.poll());
            } else {
                combined.add(q2.poll());
            }
        }
        // add any remaining values from the one non-empty queues
        // guaranteed bigger than anything else already in combined list
        combined.addAll(q1);
        combined.addAll(q2);
        // System.out.println("Merge result "+ combined);
        return combined;
    }
}