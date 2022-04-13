package Challenges.OOP.CardSharp;

/**
 * @author neilr
 */
public class PlayingCard {

    // Static variables to limit the faceValues
    private static final int MIN_VALUE = 2;
    private static final int MAX_VALUE = 14;

    private Suit suit;
    private int faceValue;

    /**
     * Constructor for PlayingCard
     * @param suit
     * @param faceValue
     * @throws IllegalArgumentException if value out of range (2-14)
     */
    public PlayingCard(Suit suit, int faceValue) {
        this.setSuit(suit);
        this.setFaceValue(faceValue);
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        if (faceValue >= MIN_VALUE && faceValue <= MAX_VALUE) {
            this.faceValue = faceValue;
        } else {
            throw new IllegalArgumentException("Card value must be between " + MIN_VALUE + " and " + MAX_VALUE + " inclusive.");
        }
    }

    /**
     * Helper function to get print friendly version of the face value
     * @param faceValue
     * @return
     */
    private String valueWord(int faceValue) {
        String word = "ERROR";
        switch(faceValue) {
            case 2: word = "Two"; break;
            case 3: word = "Three"; break;
            case 4: word = "Four"; break;
            case 5: word = "Five"; break;
            case 6: word = "Six"; break;
            case 7: word = "Seven"; break;
            case 8: word = "Eight"; break;
            case 9: word = "Nine"; break;
            case 10: word = "Ten"; break;
            case 11: word = "Jack"; break;
            case 12: word = "Queen"; break;
            case 13: word = "King"; break;
            case 14: word = "Ace"; break;
        }
        return word;
    }

    /**
     * Helper function to get print friendly version of enum suit value
     * @param suit
     * @return
     */
    private String suitWord(Suit suit) {
        String word = "ERROR";
        switch(suit) {
            case CLUBS: word = "Clubs"; break;
            case HEARTS: word = "Hearts"; break;
            case SPADES: word = "Spades"; break;
            case DIAMONDS: word = "Diamonds"; break;
        }
        return word;
    }

    /**
     * Simple toString method to print friendly name eg "Two of Clubs"
     * @return String representation of Card
     */
    @Override
    public String toString() {
        return String.format("%s of %s", valueWord(this.faceValue), suitWord(this.suit));
    }
}
