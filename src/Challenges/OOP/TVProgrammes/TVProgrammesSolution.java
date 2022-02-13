package Challenges.OOP.TVProgrammes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TVProgrammesSolution {

    // Define the file directory path
    public static final String RESOURCES_PATH = "Resources/";
    
    public static void main(String[] args) {
        
        File file = new File(RESOURCES_PATH + "TVProgrammes.csv");
        
        // Get the progrmmes from the file and assign to an ArrayList
        ArrayList<TVProgramme> programmes = getProgrammesFromCsv(file);

        // Filter and display the BBC broadcast programmes
        displayProgrammeDetails(searchProgrammesByBroadcaster(programmes, "BBC"));

        // Get current date then save the BBC broadcast programmes to a file
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        saveProgrammesToCsv(searchProgrammesByBroadcaster(programmes, "BBC"), "TVProgrammes_"+ date +".csv");
    }

    /**
     * Print all input programmes to screen
     * @param programmes
     */
    public static void displayProgrammeDetails(ArrayList<TVProgramme> programmes) {
        
        if (programmes == null || programmes.size() == 0) {
            System.out.println("No programmes to display!");
        } else {
            for (TVProgramme prog : programmes) {
                prog.displayDetails();
            }
        }
    }

    /**
     * Filter the provided programmes arraylist by broadcaster
     * @param programmes arraylist
     * @param broadcaster to filter by
     * @return
     */
    public static ArrayList<TVProgramme> searchProgrammesByBroadcaster(ArrayList<TVProgramme> programmes, String broadcaster) {
        
        ArrayList<TVProgramme> results = new ArrayList<TVProgramme>();
        
        for (TVProgramme prog : programmes) {
            if (prog.getBroadcaster().matches(broadcaster)) {
                results.add(prog);
            }
        }
        return results;
    }

    /**
     * Save the provided programmes arraylist to a new or existing file
     * @param programmes arraylist
     * @param fn CSV filename
     */
    public static void saveProgrammesToCsv(ArrayList<TVProgramme> programmes, String fn) {

        try {

            File file = new File(RESOURCES_PATH + fn);
            boolean append = true;

            if (programmes == null || programmes.size() == 0) {
                System.out.println("No programmes to save...");
                return;
            }

            if (!file.exists() || file.isDirectory()) {
                System.out.println("File does not exist, creating...");
                file.createNewFile();
                append = false; // Will require file headers
            }

            FileWriter fw = new FileWriter(file, append);
            BufferedWriter bw = new BufferedWriter(fw);

            // Write the column headers if its a new file
            if (!append) { bw.write("Programme name, Broadcaster, Rating, Average Audience\n"); }

            for (TVProgramme prog : programmes) {
                StringBuilder sb = new StringBuilder();
                sb.append(prog.getProgramme());
                sb.append(",");
                sb.append(prog.getBroadcaster());
                sb.append(",");
                sb.append(Integer.toString(prog.getRating()));
                sb.append(",");
                sb.append(Double.toString(prog.getAvgAudience()));
                sb.append("\n");
                bw.write(sb.toString());
            }
            
            bw.close();
            fw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Opps, somethings gone wrong!");
        }

    }

    /**
     * Retrieve the TVProgrammes from a CSV file
     * @param file filename containing TVProgrammes
     * @return arraylist
     */
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
