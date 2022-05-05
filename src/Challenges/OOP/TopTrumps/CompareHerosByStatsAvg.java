package Challenges.OOP.TopTrumps;

import java.util.Comparator;

public class CompareHerosByStatsAvg implements Comparator<TopTrumpCard> {

	@Override
	public int compare(TopTrumpCard c1, TopTrumpCard c2) {
		return c1.getAverage() > c2.getAverage() ? -1 : 1;
	}

}
