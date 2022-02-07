package Challenges.OOP.TVProgrammes;

/**
 * TVProgramme class
 * @author neilr
 */
public class TVProgramme {

    private String programme;
    private String broadcaster;
    private int rating;
    private double avgAudience;

    /**
     * Default Constructor
     */
    public TVProgramme() {
    }

    public TVProgramme(String programme, String broadcaster, int rating, double avgAudience) {
        this.programme = programme;
        this.broadcaster = broadcaster;
        this.rating = rating;
        this.avgAudience = avgAudience;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getBroadcaster() {
        return broadcaster;
    }

    public void setBroadcaster(String broadcaster) {
        this.broadcaster = broadcaster;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getAvgAudience() {
        return avgAudience;
    }

    public void setAvgAudience(double avgAudience) {
        this.avgAudience = avgAudience;
    }

    public void displayDetails() {
        System.out.println("----- Programme Details -----");
        System.out.printf("Programme Name: %s\n", programme);
        System.out.printf("Broadcaster: %s\n", broadcaster);
        System.out.printf("Average Audience: %.1f\n", avgAudience);
        System.out.printf("Rating: %d\n", rating);
        System.out.println();
    }

    @Override
    public String toString() {
        return "TVProgramme [programme=" + programme + ", broadcaster=" + broadcaster + ", avgAudience=" + 
                                avgAudience + ", rating=" + rating + "]";
    }
}