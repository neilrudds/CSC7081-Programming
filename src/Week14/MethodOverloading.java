package Week14;

/**
 * Method Overloading
 * @author neilr
 */

public class MethodOverloading {

    public static void main(String[] args) {

        /**
         * The calling class need only pass the appropriate arguments – the
         *  compiler sorts out which particular method to invoke.
         */
        square(4);
        square(3.3);
    }

    /**
     * Declaring..
     * Same method name (square) but with differing parameter arguments,i.e. an int and a double respectively.
     */
    public static void square(int intValue){
        System.out.println("In here with a "+intValue);
        System.out.println(intValue*intValue);
    }

    public static void square(double doubleValue){
        System.out.println("In here with a "+doubleValue);
        System.out.println(doubleValue*doubleValue);
    }

    /**
     * Another example
     */
    public void addTwoNumbers(int num1, int num2){
        int answer;
        answer = num1 + num2;
        System.out.println(answer);
    }

    public void addThreeNumbers(int num1, int num2, int num3){
        int answer;
        answer = num1 + num2 + num3;
        System.out.println(answer);
    }
    
    // Overloading allows same name with different number of parameters so could this be improved …. ?

    public void addNumbers(int num1, int num2){
        int answer;
        answer = num1 + num2;
        System.out.println(answer);
    }

    public void addNumbers(int num1, int num2, int num3){
        int answer;
        answer = num1 + num2 + num3;
        System.out.println(answer);
    }

    /**
     * Overloaded… but what’s the difference ? Good for the calling class and developing future code
     * 
     * Calling class need only ever know the name of one method to invoke regardless if it has 2 or 3 parameters.
     * 
     * Return Types of Overloaded Methods? 
     * 
     * public int multiply(int num1, int num2);
     * 
     * public double multiply(int num1, int num2);
     * 
     * Overloaded method calls cannot be distinguished by return type.
     */
}