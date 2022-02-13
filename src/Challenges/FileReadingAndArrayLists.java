package Challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * European Cup Challenge
 * @author neilr
 */

public class FileReadingAndArrayLists {

    public static final String RESOURCES_PATH = "Resources/"; 

    public static void main(String[] args) {

        File file = new File(RESOURCES_PATH + "ECWinners.txt");

        // Read winners file to ArrayList
        ArrayList<String> winners = new ArrayList<String>();
        winners = readFileLinesToArrayList(file);

        if (winners.size() > 0) {

            // Display the winners
            displayWinners(winners, 1956);

            // Display the winners after removing duplicates
            displayWinners(removeDuplicates(winners));
        } else {
            System.out.println("The list is empty, please check the list!");
        }
    }

    public static void displayWinners(ArrayList<String> winners) {

        for (String winner : winners) {
            System.out.printf("%s\n", winner);
        }
        // Or could do
        // System.out.println(winners.toString());
    }

    public static void displayWinners(ArrayList<String> winners, int startingYear) {

        int year = startingYear;
        for (String winner : winners) {
            System.out.printf("%s : %d\n", winner, year);
            year++;
        }
    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> winners) {

        ArrayList<String> result = new ArrayList<String>();

        for (String winner : winners) {
            if (!result.contains(winner)) {
                result.add(winner);
            }
        }
        return result;

    }

    public static ArrayList<String> readFileLinesToArrayList(File file) {

        ArrayList<String> result = new ArrayList<String>();

        try {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null && line.length() != 0) {
                result.add(line);
            }
            fr.close();
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
}
