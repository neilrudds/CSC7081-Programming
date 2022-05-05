package Challenges.OOP.TopTrumps;

import java.util.Comparator;

public class CompareHerosByName implements Comparator<TopTrumpCard>{

	@Override
	public int compare(TopTrumpCard c1, TopTrumpCard c2) {
		return c1.getName().compareTo(c2.getName());
	}
	
}
