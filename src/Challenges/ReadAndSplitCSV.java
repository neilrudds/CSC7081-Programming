package Challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndSplitCSV {

    public static void main(String[] args) {

        String resourcesPath = "Resources/";
        // team, score, team, score
        File file = new File(resourcesPath + "scores.csv");
        
        try {

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null && line.length()!=0) {
                String[] game = line.split(",");
                System.out.printf("%-9s %-2s : %-9s %-2s  -  Winner: %s\n", game[0], game[1], game[2], game[3],
                (Integer.parseInt(game[1]) > Integer.parseInt(game[3]) ? game[0] : game[2]));
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.print("Opps, seomthing has gone wrong");
        }
    }
}