package Week23;

public class RecursionDemo {
    
    public static void main(String[] args) {
        System.out.println("Program Start");
        callme(1);
        System.out.println("Program End");
    }

    private static void callme(int num) {
        System.out.println("Calling method: " + num);
        callme(num+1);
    }

    public static void method1() {
        System.out.println("Entering Method 1");
        method2();
        System.out.println("Ending Method 1");
    }

    public static void method2() {
        System.out.println("Entering Method 2");
        method3();
        System.out.println("Ending Method 2");
    }

    public static void method3() {
        System.out.println("Entering Method 3");
        System.out.println("Ending Method 3");
    }

}
