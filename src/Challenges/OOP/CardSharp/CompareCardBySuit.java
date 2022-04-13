package Challenges.OOP.CardSharp;

import java.util.Comparator;

/**
 * @author neilr
 */

public class CompareCardBySuit implements Comparator<PlayingCard> {

    @Override
    public int compare(PlayingCard o1, PlayingCard o2) {
        
        Suit s1 = o1.getSuit();
        Suit s2 = o2.getSuit();

        if (s1 == s2) {
            return 0; // Suit is the same object
        } else if (s1 == Suit.CLUBS && s2 != Suit.CLUBS) {
            // clubs smaller that all other suits
            return -1;
        } else if (s1 == Suit.HEARTS && (s2 == Suit.SPADES || s2 == Suit.DIAMONDS)) {
            // hearts smaller than spades and diamonds
            return -1;
        } else if (s1 == Suit.SPADES && s2 == Suit.DIAMONDS) {
			//spades smaller than diamonds
			return -1;
		} else if(s1 == Suit.DIAMONDS && s2 != Suit.DIAMONDS) {
			//diamonds bigger than all other suits
			return 1;
		} else if(s1 == Suit.SPADES && s2 != Suit.DIAMONDS) {
			//spades bigger than all except diamonds
			return 1;
		} else if(s1 == Suit.HEARTS && (s2 != Suit.SPADES || s2 != Suit.DIAMONDS)) {
			//hearts bigger than all except spades and diamonds
			return 1;
		} else {
			//print error message, no swap recommended
			System.err.println("Unexpected Suit Combo: " + s1 + " and " + s2);
			return 0;
		}
    }
    
}
