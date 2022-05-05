package Challenges.OOP.TopTrumps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchHeroByStat {
	
	public static List<TopTrumpCard> searchHeroByMinStatAndSort(List<TopTrumpCard> cards, int minValue, int statChoice, Comparator<TopTrumpCard> c) {
		
		List<TopTrumpCard> filteredCards = new ArrayList<TopTrumpCard>();
		
		for(TopTrumpCard ttc : cards) {
			if (ttc.getStatScore(statChoice) >= minValue) {
				filteredCards.add(ttc);
			}
		}
		
		Collections.sort(filteredCards, c);
		return filteredCards;
	}

}