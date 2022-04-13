package Challenges.OOP.CardSharp;

import java.util.Comparator;

/**
 * @author neilr
 */

public class CompareCardByFaceValue implements Comparator<PlayingCard>{

    @Override
    public int compare(PlayingCard o1, PlayingCard o2) {
        return o1.getFaceValue() - o2.getFaceValue();
    }
}
