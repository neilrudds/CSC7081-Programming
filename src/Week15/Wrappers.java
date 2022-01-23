package Week15;

import java.util.Arrays;

/**
 * Wrappers
 * @author neilr
 */

public class Wrappers {
    
    public static void main(String[] args) {  
        differences();
        exercise();
        compareIntegerObjects();
        boxing();  
    }

    public static void differences(){

        /**
         * Differences
         * 
         * The first statement declares an int variable named primitiveInt and initialises it with the value 25. The 
         * second statement instantiates an Integer object. The object is initialised with the value 33 and a reference to 
         * the object is assigned to the object variable wrapperInt
         */ 

        int primitiveInt = 25;
        Integer wrapperInt = 33;

        // Useful wrapper methods
        Integer intW = 40;
        
        // get the int value
        int weeInt = intW.intValue();
        System.out.println(weeInt);
        
        // convert to double
        double weeD = intW.doubleValue();
        System.out.println(weeD);
        
        // parse from string
        Integer intFromStr = Integer.parseInt("66");
        System.out.println(intFromStr);

    }

    /**
     * Exercise - wrapper classes
     * 
     * Given the following data and data types:
     * 1. add to an array (Array of type Double), 
     * 2. output each value in the unsorted array to screen
     * 3. then sort into an ordered list and output to screen.
     */
    public static void exercise() {

        // data values
        int i1 = 33;
        String i2 = "999";
        double i3 = 23.4;
        Integer i4 = 6669;
        Double i5 = 2.345;

        // store all in an Array
        Double[] numbers = new Double[5];
        numbers[0] = (double) i1; // cast
        numbers[1] = Double.parseDouble(i2); // use of parse
        numbers[2] = i3; // direct assignment
        numbers[3] = i4.doubleValue();
        numbers[4] = i5;

        // show all values in array (unsorted)
        System.out.println("UnSorted : ");
        for (int loop = 0; loop < numbers.length; loop++) {
            System.out.println(numbers[loop]);
        }

        // sort
        Arrays.sort(numbers);
        
        // show all values in array (sorted)
        System.out.println("Sorted : ");
        for (int loop = 0; loop < numbers.length; loop++) {
            System.out.println(numbers[loop]);
        }
    }

    /**
     * Comparing Integer objects
     * 
     * Primitive types use the relational operators <, ==, >, and so on
     * To compare Wrapper class values use equals() and compare()
     */
    public static void compareIntegerObjects() {

        // 33 not the same as 339
        // Compare to returns the value : -1

        Integer x = 33;
        Integer y = 339;

        if (x.equals(y)) {
            System.out.println(x + " same as " + y);
        } else {
            System.out.println(x + " not the same as " + y);
        }

        // compare returns a zero, positive or negative
        // the value 0 if x == y;
        // a value less than 0 if x < y;
        // and a value greater than 0 if x > y
        System.out.println("Compare to returns the value : " + Integer.compare(x, y));

    }

    /**
     * Autoboxing and Auto-Unboxing
     * 
     * Provides automatic conversion from Wrapper to primitive type and visa versa.
     * 
     * Autoboxing - Primitive to Wrapper
     * Auto-Unboxing - Wrapper to Primitive
     */
    public static void boxing() {

        int m, n;
        m = 20;

        Integer objM, objN;
        objM = 10;

        // assignment conversion
        objN = m; // box m to Integer.
        n = objM; // unbox objM and assign to n;

        // expressions
        n = objM + 5; // unbox objM before int addition
        objM++; // unbox the value then increment then rebox

        // initialisation of Integer array
        Integer[] myIntegers = { 1, 2, 3, objM };
        System.out.println(Arrays.toString(myIntegers));

    }

}