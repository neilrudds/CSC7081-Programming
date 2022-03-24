package Week23;

public class Factorial {

    /**
     * Recursive method that solves factorial values
     * @param n
     * @return
     */
    public int factorial(int n) {
        int result;
        if(n==1) {
            // base case
            return 1;
        }
        // recursive call
        result = factorial(n-1)*n;
        return result;
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println("Factorial 5! : " + fact.factorial(5));
    }
}