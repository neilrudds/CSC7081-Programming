package Week23;

public class RecursiveCountdown {

    public static void main(String[] args) {
        countDown(5);
    }

    private static void countDown(int num) {
        
        // base case
        if (num <= 0) {
            System.out.println("End");
        } else {
            System.out.println(num);
            countDown(--num); // post decrement would cause an infinite loop :)
        }
    }    
}