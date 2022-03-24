package Week23;

public class ReverseString {
    public static void main(String[] args) {
        String something = "aidan";
        String reverseRecursively = reverseRecursively(something);
        System.out.println("Reverse Recursively: " + reverseRecursively);
    }

    /**
     * Iterative method to reverse a string
     * 
     * @param str
     * @return
     */
    public static String reverseIterativey(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }
        return strBuilder.toString();
    }

    /**
     * Recursive call to reverse a string
     * 
     * @param str
     * @return
     */
    public static String reverseRecursively(String str) {
        System.out.println("In with: " + str);
        // base case to handle one char string and empty string
        if (str.length() <= 1) {
            System.out.println("BASE CASE REACHED");
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }
}