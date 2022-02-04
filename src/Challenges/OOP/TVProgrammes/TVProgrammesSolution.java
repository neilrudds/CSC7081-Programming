package Challenges.OOP.TVProgrammes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TVProgrammesSolution {

    public static final String RESOURCES_PATH = "Resources/";
    
    public static void main(String[] args) {
        
        File file = new File(RESOURCES_PATH + "TVProgrammes.csv");
        
        System.out.println(getProgrammesFromCsv(file));
        
    }

    public static ArrayList<TVProgramme> getProgrammesFromCsv(File file) {

        ArrayList<TVProgramme> allProgrammes = new ArrayList<TVProgramme>();

        try {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String csvRow;

            // Discard the header
            br.readLine();

            while ((csvRow = br.readLine()) != null && csvRow.length() != 0) {
                String[] progDetails = csvRow.split(",");
                allProgrammes.add(new TVProgramme(progDetails[0], progDetails[1], 
                    Integer.parseInt(progDetails[2]), Double.parseDouble(progDetails[3])));
            }
            fr.close();
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Opps, somethings gone wrong!");
        }
        return allProgrammes;
    }
}
