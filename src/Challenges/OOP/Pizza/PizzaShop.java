package Challenges.OOP.Pizza;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * PizzaShop Challenge, Main method
 * Makes use of Inheritance, Interfaces & Polymorphism
 * @author neilr
 */

public class PizzaShop {

    public static final String RESOURCES_PATH = "Resources/";
    
    public static void main(String[] args) {

        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

        // Get the order from the file, pass menuItems by reference
        getOrdersFromFile("OrderList-3-Full.csv", menuItems);

        printReceipt(menuItems);
        findVeggies(menuItems);
    }

    /**
     * Prints a receipt and a total value for the MenuItems provided.
     * @param menuItems
     */
    public static void printReceipt (ArrayList<MenuItem> menuItems) {

        if (menuItems == null || menuItems.size() == 0) {
            System.err.println("No items to print.");
            return;
        }

        double billTotal = 0.00;
        System.out.println("------------------------");
        System.out.println("      ORDER DETAILS     ");
        System.out.println("------------------------");
        for (MenuItem item : menuItems) {
            item.displayDetails();
            billTotal += item.getPrice();
        }
        System.out.println("------------------------");
        System.out.printf("TOTAL BILL £%.2f\n", billTotal);
        System.out.println("------------------------");
        
    }

    /**
     * Finds, prints and counts the vegiterian pizzas
     * @param menuItems
     */
    public static void findVeggies (ArrayList<MenuItem> menuItems) {

        if (menuItems == null || menuItems.size() == 0) {
            System.err.println("No items to print.");
            return;
        }

        int vegPizzas = 0;
        for (MenuItem menuItem : menuItems) {
            if (menuItem instanceof Pizza) {
                if (((Pizza)menuItem).isVegetarian()) {
                    menuItem.displayDetails();
                    vegPizzas++;
                }
            }
        }
        System.out.printf("There are %d vegiterian pizzas.\n", vegPizzas);

    }

    /**
     * Loads the MenuItems from the CSV files provided
     * @param fn
     * @param menuItem
     */
    public static void getOrdersFromFile(String fn, ArrayList<MenuItem> menuItem) {

        try {

            File file = new File(RESOURCES_PATH + fn);

            if (!file.exists() || file.isDirectory()) {
                System.err.println("The file cannot be found.");
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String orderLine;

            // Read the header
            br.readLine();

            while((orderLine = br.readLine()) != null && orderLine.length() != 0) {
                String cols[] = orderLine.split(",");
                // More than 2 columns, then we have a pizza with toppings
                if (cols[0].equals("Pizza")) {
                    Pizza pizza = new Pizza(Integer.parseInt(cols[1]));
                    for (int i = 2; i < cols.length; i++) {
                        pizza.addTopping(Topping.valueOf(cols[i]));
                    }
                    menuItem.add(pizza);
                } else {
                    menuItem.add(new MenuItem(cols[0], Double.parseDouble(cols[1])));
                }
            }
            fr.close();
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Something went wrong when importing the order file.");
        }

    }

}
