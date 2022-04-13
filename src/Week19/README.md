# CSC7081---Programming
## Sorting Objects - Comparators

> Week 19 focuses on the Sorting Objects - Comparators.

# Comparing Integer Objects

- Primitive types use the relational operators <, ==, >, and so on
- To compare Wrapper class values use equals() and compareTo()

```
Integer intW1 = new Integer(3);
Integer intW2 = new Integer(100);

// using equals (returns Boolean true if the values of the object argument are equal)
if (intW1.equals(intW2)) {
    System.out.println("Same");
} else {
    System.out.println("Not the same");
}

// using compareTo (returns an int value that is positive, negative, or
// zero. Negative means that the object has a value less than the argument,
// positive means it's greater and zero means they are the same)

System.out.println("return from compareTo is: " + intW1.compareTo(intW2));
```

# Comparing and sort complex objects

- We can impose a “natural ordering” on our classes by having them implement the Comparable interface and providing our own implementation for the compareTo() method (and potentially equals() also) based on a particular attribute. 

- This is not very flexible however. Suppose we want to be able to apply different orderings in different circumstances.

```
public class Employee {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

- We need to use the Comparator interface when we want to order complex objects on different attributes, for example, let’s suppose that an employer would like to order employees by name or by age. 

# Compare by Name (String)

- Now, create a class that will implement the Comparator interface and will be used to sort employees by name attribute.

```
import java.util.Comparator;

public class CompareEmployeeName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
```

# Compare by Age (int)

- Now, create a class that will implement the Comparator interface and will be used to sort employees by int attribute. (primitive type)

```
import java.util.Comparator;

public class CompareEmployeeAge implements Comparator<Employee> {

    /**
    * compares employee objects by age
    * @return a negative integer, zero, or a positive integer as the first
    *         argument is less than, equal to, or greater than the second.
    */
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}
```

# Comparators in action

```
// create employees
Employee e1 = new Employee();
e1.setName("Niamh");
e1.setAge(30);

Employee e2 = new Employee();
e2.setName("Claire");
e2.setAge(40);

Employee e3 = new Employee();
e3.setName("Una");
e3.setAge(20);

// create ArrayList and add employees
ArrayList<Employee> list = new ArrayList<>();
list.add(e1);
list.add(e2);
list.add(e3);
viewAll(list);
```

# Sort by name

```
// sort by name
Collections.sort(list, new CompareEmployeeName());
System.out.println("Sorted by name");
viewAll(list);

public static void viewAll(List<Employee> list) {
    for (Employee e : list) {
        System.out.print(e.getName() + " ");
        System.out.println(e.getAge());
    }
}
```

# Sort by age

```
// sort by age
Collections.sort(list, new CompareEmployeeAge());
System.out.println("Sorted by age");
viewAll(list);

public static void viewAll(List<Employee> list) {
    for (Employee e : list) {
        System.out.print(e.getName() + " ");
        System.out.println(e.getAge());
    }
}
```

# Exercise

- Create a Comparator that will enable a reverse sort of the employee name…

```
import java.util.Comparator;

public class CompareByNameReverse implements Comparator<Employee> {

    @Override
     public int compare(Employee e1, Employee e2) {

            return e2.getName().compareTo(e1.getName());
     }

}
```