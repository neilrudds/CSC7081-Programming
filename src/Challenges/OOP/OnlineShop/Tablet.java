package Challenges.OOP.OnlineShop;

/**
 * Class to represent a typical tablet
 * @author neilr
 */

public class Tablet {
    
    private String manufacturer;
    private String model;
    private double price;
    private boolean android;
    private double size;
    private String notes;
    
    /**
     * Default Constructor
     */
    public Tablet() {

    }

    /**
     * Constructor with parameters
     * @param manufacturer
     * @param model
     * @param price
     * @param android true or false
     * @param size
     * @param notes size the size to set in inches (needs to be >5 and less than 21 otherwise set to default
     */
    public Tablet(String manufacturer, String model, double price, boolean android, double size, String notes) {
        super();
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.android = android;
        setSize(size);
        setNotes(notes);
    }

    public String getManufacturer() {
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAndroid() {
        return android;
    }

    public void setAndroid(boolean android) {
        this.android = android;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size > 5 && size < 21) {
            this.size = size;
        } else {
            System.err.println("The input size is out of range, default value has been set");
        }
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        if (notes.length() <= 250) {
            this.notes = notes;
            
        } else {
            this.notes = notes.substring(0, 250);
            System.out.println("Notes exceeds the allows number of characters (250), notes have been truncated.");
        }
    }

    public void allDetails() {
        System.out.println("------ Tablet Details ------");
        System.out.printf("Manufacturer : %s\n", manufacturer);
        System.out.printf("Model        : %s\n", model);
        System.out.printf("Price        : %s\n", price);
        System.out.printf("Android      : %s\n", android);
        System.out.printf("Size         : %s\n", size);
        System.out.printf("Notes        : %s\n", notes);
        System.out.println();
    }
}