package Challenges.OOP.TopTrumps;

import java.util.Comparator;

public class CompareHerosByBioLength implements Comparator<TopTrumpCard> {

	@Override
	public int compare(TopTrumpCard c1, TopTrumpCard c2) {
		return c2.getBio().length() - c1.getBio().length();
	}

}
