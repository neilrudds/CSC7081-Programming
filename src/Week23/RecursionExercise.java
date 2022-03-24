package Week23;

import java.util.Scanner;

public class RecursionExercise {

    private static Scanner scanner = new Scanner(System.in);
    private static int number = 0;

    public static void main(String[] args) {
        System.out.println("Welcome");
        checkRange();
        System.out.println("You entered .." + number);
        countUp(number);
    }

    public static void countUp(int num) {
        // check base case
        if (num == 101) {
            // base case
            System.out.println();
        } else {
            System.out.println(num);
            countUp(num + 1);
        }
    }

    public static void checkRange() {
        System.out.println("Please enter a number between 1 and 10");
        number = scanner.nextInt();
        // check base case - i.e. number is between 1 - 10
        if (number > 0 && number < 11) {
            // base case
            System.out.println("Number OK");
        } else {
            checkRange();
        }
    }

}
