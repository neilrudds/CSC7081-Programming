package Challenges.OOP.Pizza;

import java.util.ArrayList;

/**
 * SubClass of MenuItem, Specifically for Pizzas
 * @author neilr
 */

public class Pizza extends MenuItem {

    private int size;
    private ArrayList<Topping> toppings;

    /**
     * Pizza constructor with parameters
     * @param size of the pizza
     */
    public Pizza(int size) {
        super("Pizza");
        setSize(size);
        calculateBasePrice();
        toppings = new ArrayList<Topping>();
    }

    /**
     * Returns the Pizza toppings
     * @return
     */
    public ArrayList<Topping> getToppings() {
        return toppings;
    }
    
    /**
     * Returns the pizza size
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the pizza size with validation
     * @param size between 8 - 16
     */
    public void setSize(int size) {
        if (size < 8) {
            this.size = 8;
        } else if (size > 16) {
            this.size = 16;
        } else {
            this.size = size;
        }
    }

    /**
     * Sets the pizza toppings (not used)
     * @param toppings
     */
    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
    }

    /**
     * Add toppings to the pizza and update the price
     * @param topping
     */
    public void addTopping(Topping topping) {
        if (toppings.contains(topping)) {
            System.err.printf("You can only have one topping of the same type (%s)\n", topping);
        } else {
            this.toppings.add(topping);
            addToPrice(0.50);
        }
    }

    /** 
     * Calculates the base pizza price from its size
     */
    private void calculateBasePrice() {
        addToPrice(size * 1.00);
    }

    /**
     * Add to the total price
     * @param value
     */
    private void addToPrice(double value) {
        setPrice(getPrice() + value);
    }

    /**
     * Prints the pizza details, including toppings if present
     */
    private void pizzaDetails() {
        if (toppings.size() == 0) {
            System.out.printf("Pizza (Plain)   (%d)    £%.2f\n", this.getSize(), this.getPrice());
        } else {
            System.out.printf("Pizza    (%d)    £%.2f\n", this.getSize(), this.getPrice());
            System.out.println("With Toppings:");
            for (Topping top : toppings) {
                System.out.printf(" *\t%s\n", top.toString());
            }
        }
    }

    /**
     * Prints the pizza details
     */
    @Override
    public void displayDetails() {
        pizzaDetails();
    }

    /**
     * Checks the toppings to see if the pizza is a vegeterian
     * @return
     */
    public boolean isVegetarian() {
        for (Topping top : toppings) {
            switch(top) {
                case PEPPERONI:
                  return false;
                case BEEF:
                  return false;
                case CHICKEN:
                  return false;
                case HAM:
                  return false;
                default:
                    break;
            }
        }
        return true;
    } 
    
}
