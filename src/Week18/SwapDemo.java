package Week18;

import java.util.LinkedList;
import java.util.List;

public class SwapDemo {
    public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("I");
		linkedList.add("dream");
		linkedList.add("have");
		linkedList.add("a");
		
		// not quite right ? 
		System.out.println(linkedList.toString());
		
		
		swap(linkedList, 1, 2);
		System.out.println(linkedList.toString());
		swap(linkedList, 2, 3);
		System.out.println(linkedList.toString());
		
	}

	public static void swap(List<String> list, int position1, int position2){
        if (list == null) {
            System.out.println("The list is empty");
            return;
        };
        if (position1 < 0 || position2 > list.size() - 1) {
            System.out.printf("The positions are out of bounds (%s)\n", list.size());
            return;
        }
		String tmp = list.get(position1);
		list.set(position1, list.get(position2));
		list.set(position2, tmp);
	}

}
