package Challenges.OOP.CountriesOfTheWorld;

public class Country {

    //Country,Region,Population,Area (sq. mi.)

    private String name;
    private String region;
    private int population;
    private int area;
    private double density;

    /**
     * Default Constructor
     */
    public Country() {

    }

    /**
     * Create a country with all arguments
     * @param name
     * @param region
     * @param population
     * @param area
     * @param density
     */
    public Country(String name, String region, int population, int area) {
        super();
        setName(name);
        setRegion(region);
        setPopulation(population);
        setArea(area);
        setDensity();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("The country must not be empty!");
        }
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {

        switch(region) {

        }
        this.region = region;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public double getDensity() {
        return density;
    }
    public void setDensity() {
        if (population > 0 && area > 0) {
            this.density = (double)population / (double)area;
        } else {
            throw new IllegalArgumentException(String.format("Unable to calculate the density. Population: %d, Area: %d", population, area));
        }
    }

    /**
     * Displays name and region
     */
    public void displayRegionAndName() {
        System.out.println(this.region + " " + this.name);
    }

    /**
     * Display all data to screen
     */
    public void displayAllCountryDetails() {
        System.out.println("\nName                       \t:" + this.name);
        System.out.println("Region                     \t:" + this.region);
        System.out.println("population                 \t:" + this.population);
        System.out.println("area                       \t:" + this.area);
        System.out.printf("density                    \t:%.2f", this.density);
        System.out.println();
    }

    /**
     * Display of name and population
     */
    public void displayPopulationAndName() {
        System.out.println(this.population + "    \t " + this.getName());
    }
}
