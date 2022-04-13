package Challenges.OOP.CardSharp;

import java.util.Comparator;

/**
 * @author neilr
 */

public class CompareCardBySuitSimple implements Comparator<PlayingCard>{

	/**
	 * much simpler version of the comparator for the suit enum than my first attempt
	 * taking advantage of the fact that enums have their own natural ordering based on 
	 * the order in which the values are declared
	 */
	@Override
	public int compare(PlayingCard o1, PlayingCard o2) {
		return o1.getSuit().compareTo(o2.getSuit());
	}

}