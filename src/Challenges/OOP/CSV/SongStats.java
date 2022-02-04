package Challenges.OOP.CSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SongStats {

    public static void main(String[] args) {
        
        String resourcePath = "Resources/";
        File file = new File(resourcePath + "SongList.csv");

        displaySongs(readSongsFromFile(file));
    }

    public static ArrayList<Song> readSongsFromFile(File file) {

        ArrayList<Song> songs = new ArrayList<Song>();

        try {
            FileReader fr = new FileReader(file);
            BufferedReader fb = new BufferedReader(fr);
            String csvRow;

            // Read the header and discard
            fb.readLine();

            while((csvRow = fb.readLine()) != null && csvRow.length() != 0) {
                String[] songData = csvRow.split(",");
                songs.add(new Song(songData[0], songData[1], Integer.parseInt(songData[2])));
            }
            fb.close();
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Opps an error has occured!");
        }
        return songs;
    }

    public static void displaySongs(ArrayList<Song> songs) {
        if (songs == null || songs.size() == 0) {
            System.out.println("No songs to display...");
        } else {
            for (Song song : songs) {
                System.out.println(song);
            } 
        }
    }
}