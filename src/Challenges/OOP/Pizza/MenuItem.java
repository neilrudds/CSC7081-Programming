package Challenges.OOP.Pizza;

/**
 * Generic Menu Items
 * @author neilr
 */

public class MenuItem implements IDetail {

    private String name;
    private double price;

    /**
     * Constructor with name
     * @param name
     */
    public MenuItem(String name) {
        setName(name);
    }

    /** 
     * Constructor with arguments
     */
    public MenuItem(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }

    /**
     * Returns the name of the item
     * @return
     */
    public String getName() {
        return name;
    }
 
    /**
     * Sets the name with required validation
     * @param name must be non empty String. Letters and Spaces only and must not begin with a space. (otherwise “INVALID NAME”)
     */
    public void setName(String name) {

        char space = ' ';

        if (name.length() == 0 || name == null || this.hasNumbers(name) || name.charAt(0) == space ) {
            this.name = "INVALID NAME";
            System.err.println("The name was invalid, default name set.");
        } else {
            this.name = name;
        }
    }

    /**
     * Returns the price
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price with the required validation
     * @param price non negative, zero if invalid
     */
    public void setPrice(double price) {

        if (price < 0) {
            price = 0.00;
            System.err.println("The price was invalid, default price set.");
        } else {
            this.price = price;
        }
        
    }

    /**
     * Checks a String to see if it contains numbers
     * @param str to be checked
     * @return true if numbers are present
     */
    private boolean hasNumbers(String str) {
        
        char[] nums = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        for (int c = 0; c < str.length(); c++) {
            for (int n = 0; n < nums.length; n++) {
                if (str.charAt(c) == nums[n]) { return true; }
            }
        }
        return false;
    }

    /**
     * Displays the details of the menu item
     */
    @Override
    public void displayDetails() {
        System.out.printf("%s\t\t£%.2f\n", this.getName(),  this.getPrice());
    }
}