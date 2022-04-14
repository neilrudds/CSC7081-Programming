package Challenges.OOP.CountriesOfTheWorld;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Reads in the data
 * 
 * @author neilr
 */

public class StarterApp {

    public static final String RESOURCES_PATH = "Resources/";
    public static final String FILE_NAME = "countries.csv";

    public static void main(String[] args) {

        // Stores the country data
        List<Country> countries = new ArrayList<Country>();

        // Loads the country data from file
        getCountriesFromFile(RESOURCES_PATH + FILE_NAME, countries);

        // Print all loaded country data
        showAllCountryData(countries);
        System.out.println();
        
        // 1. Show each country by region
     	System.out.println("Regional data - Asia");
     	List<Country> regionalCountries = getCountriesByRegion("Asia", countries);
		showCountryAndRegionData(regionalCountries);

        
        // 2. sort and show each county by population (ascending)
     	System.out.println("Countries by population ascending");
        Collections.sort(countries, new CompareByPopulation());
        showCountryByPopulation(countries);
        
    }

    public static void showAllCountryData(Collection<Country> countries) {
        for(Country c : countries) {
            c.displayAllCountryDetails();
        }
    }
    
	public static void showCountryAndRegionData(Collection<Country> countries) {
		for (Country country : countries) {
			country.displayRegionAndName();
		}
	}
    
    public static void showCountryByPopulation(Collection<Country> countries) {
    	for(Country c : countries) {
            c.displayPopulationAndName();
        }
    }
    
    public static List<Country> getCountriesByRegion(String region, Collection<Country> countries) {
    	
    	List<Country> countriesByRegion = new ArrayList<Country>();
    	
    	for(Country c : countries) {
    		if(c.getRegion().equalsIgnoreCase(region)) {
    			countriesByRegion.add(c);
    		}
    	}
    	return countriesByRegion;
    }

    public static void getCountriesFromFile(String filename, List<Country> countries) {

        File file = new File(filename);
        FileReader fr;
        BufferedReader br;

        try {

            fr = new FileReader(file);
            br = new BufferedReader(fr);

            // read the file headers
            br.readLine();

            // Read each row, until EOF
            String row;
            String region;
            while ((row = br.readLine()) != null && row.length() > 0) {
                
                // Parse row into parts
                String[] cells = row.split(",");

                // Format the region
                region = cells[1].trim();
                region = region.substring(0, 1).toUpperCase() + region.substring(1).toLowerCase();

                switch(region.toUpperCase()) {
                    case "EASTERN EUROPE":
                        region = "Europe";
                        break;
                    case "WESTERN EUROPE":
                        region = "Europe";
                        break;
                    case "SUB-SAHARAN ARRICA":
                        region = "Africa";
                        break;
                    case "NORTHERN AFRICA":
                        region = "Africa";
                        break;
                    default:
                        // Keep region as it is.
                        break;
                }

                // Add to collection of countries
                countries.add(new Country(
                    cells[0].trim(),
                    region,
                    Integer.parseInt(cells[2].trim()),
                    Integer.parseInt(cells[3].trim())));
            }
            br.close();
            fr.close();

            System.out.println("Country data loaded...");

        } catch (FileNotFoundException e) {
        	e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An error has occured when importing the file data");
        }
    }

}
