package Challenges.OOP.ScoreProcessor;

import java.util.Comparator;

/**
 * Comparator used to compare the points total for a team (Ascending) 
 * @author neilr
 */
public class ComparePoints implements Comparator<Team>{

	@Override
	public int compare(Team team1, Team team2) {
		return team2.getTotalPoints() - team1.getTotalPoints();
	}
	
}