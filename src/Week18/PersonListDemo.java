package Week18;

import java.util.ArrayList;
import java.util.List;

public class PersonListDemo {
    public static void main(String[] args) {

        List<Person> census = new ArrayList<Person>();
        census.add(new Person("Matthew", "Collins"));
        census.add(new Person("Neil", "Rutherford"));
        census.add(new Person("Peter", "Marley"));
        census.add(new Person("Matthew", "Collins"));

        System.out.println("Full List: " + census.toString());
        System.out.printf("Full list size: %d\n", census.size());

        Person toRemove = new Person("Matthew", "Collins");
        // Need to overide equals in the Person class otherwise object memory reference is used for comparison
        //census.remove(toRemove); // Removes one

        // Removes all
        List<Person> removals = new ArrayList<Person>();
        removals.add(toRemove);
        census.removeAll(removals);

        System.out.println("Modified List: " + census.toString());
        System.out.printf("Full list size: %d\n", census.size());

    }
}