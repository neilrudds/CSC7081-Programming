package Challenges.OOP.TopTrumps;

import java.util.Comparator;

public class CompareHerosByStats implements Comparator<TopTrumpCard> {

	@Override
	public int compare(TopTrumpCard c1, TopTrumpCard c2) {

		int c1Total = c1.getSpeed() + c1.getStrength() + c1.getAgility() + c1.getIntellegence();
		int c2Total = c2.getSpeed() + c2.getStrength() + c2.getAgility() + c2.getIntellegence();
		return c2Total - c1Total;
	}
}
