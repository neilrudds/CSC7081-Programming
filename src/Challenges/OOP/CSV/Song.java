package Challenges.OOP.CSV;

/**
 * Song object
 * @author neilr
 */

public class Song {

    private String title;
    private String artist;
    private int highestPosition;

    /**
     * Default Constructor
     */
    public Song() {

    }

    /**
     * Constructor with parameters
     * @param title
     * @param artist
     * @param highestPosition must range between 0 - 40
     */
    public Song(String title, String artist, int highestPosition) {
        super();
        this.title = title;
        this.artist = artist;
        setHighestposition(highestPosition);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getHighestposition() {
        return highestPosition;
    }

    public void setHighestposition(int highestPosition) {
        if (highestPosition > 0 || highestPosition < 40) {
            this.highestPosition = highestPosition;
        } else {
            System.err.println("Position is invalid, setting default chart position!");
        }
    }

    public void displaySong() {
        System.out.println("---- Song ----");
        System.out.printf("Title    : %s\n", title);
        System.out.printf("Artist   : %s\n", artist);
        System.out.printf("Position : %d\n", highestPosition);
    }

    @Override
    public String toString() {
        return "Song [title=" + title + ", artist=" + artist + ", highestPosition=" + highestPosition + "]";
    }
}