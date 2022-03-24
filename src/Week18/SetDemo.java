package Week18;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		// create and display a List<String>
        String[] colors = { "red", "white", "blue", "green", "gray", "orange",
             "tan", "white", "cyan", "peach", "gray", "orange" };
        
        List<String> list = Arrays.asList(colors);
        
        System.out.printf("List: %s\n", list);

        // eliminate duplicates then print the unique values
        printNonDuplicates(list);
	}
	
	private static void printNonDuplicates(Collection<String> values) {
        // create a hashset
        Set<String> set = new HashSet<String>(values);
        System.out.print("\nNonduplicates are: ");

        for (String value : set)
            System.out.printf("%s ", value);

        System.out.println();
    }


}
