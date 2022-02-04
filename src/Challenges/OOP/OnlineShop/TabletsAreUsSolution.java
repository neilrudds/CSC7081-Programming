package Challenges.OOP.OnlineShop;

import java.util.ArrayList;

public class TabletsAreUsSolution {
    public static void main(String[] args) {
        
        // simulating a few tablets
        Tablet t1 = new Tablet("Apple", "iPad", 338.94, false, 10.2, "10.2 inch Retina display A10 Fusion chip Up to 10 hours of battery life");
        Tablet t2 = new Tablet("Apple", "iPad Air", 449.00, false, 10.5,"10.5 inch 10.5-inch Retina display with ProMotion, True Tone and wide colour, Up to 20 hours of battery life ");
        Tablet t3 = new Tablet("Google", "Fire", 79.99, true, 8, "8 inch display 10 hours of battery life");
        Tablet t4 = new Tablet("Samsung", "Galaxy Tab", 180.00, true, 10.1, "10.1 inch  Entertainment for All: Designed with the whole family in mind, the Galaxy Tab A has what it takes to keep everyone happy. 5 hours battery.  ");
        Tablet t5 = new Tablet("Vankyo", "MatrixPad", 69.99, true, 7, "7-inch display Full-Featured Android Tablet with Eye Care for Kids Up to 4 hours of battery life");
        
        // adding to an arraylist
        ArrayList<Tablet> tablets = new ArrayList<Tablet>();
        tablets.add(t1);
        tablets.add(t2);
        tablets.add(t3);
        tablets.add(t4);
        tablets.add(t5);

        // show all in stock
        showAllDeatails(tablets);
        // exercising a few searches
        // 1. all screen sizes > 10 inches in size
        showAllDeatails(searchBySize(tablets, 10.0));
        // 2. all Apple products (over priced!)
        showAllDeatails(searchByManufacturer(tablets, "Apple"));
        // 3. all Android tablets
        showAllDeatails(searchByOpSystem(tablets, true));
        // 4. note search .. e.g. by key word search (note this is case sensitive)
        showAllDeatails(searchByNotesKeyWord(tablets, "Kids"));
        showAllDeatails(searchByNotesKeyWord(tablets, "NASA"));
    }

    /**
     * Outputs all details of supplied tablet list (in an arraylist) to screen
     * 
     * @param tablets
     */
    public static void showAllDeatails(ArrayList<Tablet> tablets) {
        if (tablets.size() == 0 || tablets == null) {
                System.out.println("No tablets to show ....");
           } else {
               for (Tablet tablet : tablets) {
                    tablet.allDetails();
               }
        }
    }
        
    /**
     * Seartches for tablets greater than the lower limit
     * 
     * @param tablets
     * @return
     */
    public static ArrayList<Tablet> searchBySize(ArrayList<Tablet> tablets, double lowerLimitSize) {
        System.out.println("Searching for tablets by size >= " + lowerLimitSize );
        ArrayList<Tablet> searchList = new ArrayList<Tablet>();
        for (Tablet tablet : tablets) {
            if (tablet.getSize() >= lowerLimitSize) {
            // add to the list
            searchList.add(tablet);
            }
        }
        return searchList;
    }

    /**
     * Search by manufacturer
     * @param tablets
     * @param manufacturer
     * @return
     */
    public static ArrayList<Tablet> searchByManufacturer(ArrayList<Tablet> tablets, String manufacturer) {
        System.out.println("Searching for tablets by manufacturer " + manufacturer);
        ArrayList<Tablet> searchList = new ArrayList<Tablet>();
        for (Tablet tablet : tablets) {
            if (tablet.getManufacturer().equalsIgnoreCase(manufacturer)) {
            // add to the list
            searchList.add(tablet);
            }
        }
        return searchList;
    }
    
    /**
     * Search by OP system
     * @param tablets
     * @param manufacturer
     * @return
     */
    public static ArrayList<Tablet> searchByOpSystem(ArrayList<Tablet> tablets, boolean android) {
        System.out.println("Searching for tablets by op system Android " + android);
        ArrayList<Tablet> searchList = new ArrayList<Tablet>();
        for (Tablet tablet : tablets) {
            if (tablet.isAndroid() ==  android) { // checking here is the stored android (true or false) matches the request (alos a boolean)
            // add to the list
            searchList.add(tablet);
            }
        }
        return searchList;
    }

    /**
     * Searches the notes if they contain a supplied keyword
     * @param tablets
     * @param keyword
     * @return
     */
    public static ArrayList<Tablet> searchByNotesKeyWord(ArrayList<Tablet> tablets, String keyword) {
        System.out.println("Searching for tablets notes by keyword " + keyword);
        ArrayList<Tablet> searchList = new ArrayList<Tablet>();
        for (Tablet tablet : tablets) {
            if (tablet.getNotes().contains(keyword)) { // could make this case insensitive   
                // add to the list
                searchList.add(tablet);
            }
        }
        return searchList;
    }
}