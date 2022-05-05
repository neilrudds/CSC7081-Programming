package Challenges.OOP.ScoreProcessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ScoreManager {
	
	private static final String RESOURCES_PATH = "Resources/";
	private static final String FILE_NAME = "Results.txt";
	
	/**
	 * Stores the results from file for processing
	 */
	private static ArrayList<String> results = new ArrayList<String>();
	
	/**
	 * Map to store the team names (key) and the the team stats (values)
	 */
	private static Map<String, Team> teams = new HashMap<String, Team>();
	
	private final static int WIN_POINTS = 3;
	private final static int DRAW_POINTS = 1;
	private final static int LOSS_POINTS = 0;
	

	public static void main(String[] args) {

		// Read the scores file
		getScoresFromFile(RESOURCES_PATH + FILE_NAME);
		
		// Process the results
		processScores();
		
		// output to screen the stats for each team
		showAllTeamsStats();
		
		// print the league table
		showLeagueTable();

	}
	
	/**
	 * Reads the scores line by line and stores in arraylist
	 */
	public static void getScoresFromFile(String fname) {
		
		File file = new File(fname);
		
		try {
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String row;
			
			while((row = br.readLine()) != null && row.length() > 0) {
				results.add(row);
			}
			System.out.print(results.toString());
			System.out.println("File processed.");
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Process the results line by line
	 */
	public static void processScores() {
		
		String tokenedResult[] = null;
		String team1 , team2;
		int team1Goals, team2Goals, team1Pts, team2Pts;
		
		for(String result : results) {
			
			tokenedResult = result.split(" "); // Split based on space
			team1 = tokenedResult[0];
			team1Goals = Integer.parseInt(tokenedResult[1]);
			team2Goals = Integer.parseInt(tokenedResult[2]);
			team2 = tokenedResult[3];
			
			if (team1Goals > team2Goals) {
				team1Pts = WIN_POINTS;
				team2Pts = LOSS_POINTS;
			} else if (team2Goals > team1Goals) {
				team1Pts = LOSS_POINTS;
				team2Pts = WIN_POINTS;
			} else {
				team1Pts = DRAW_POINTS;
				team2Pts = DRAW_POINTS;
			}
			updateTeamStats(team1, team1Goals, team2Goals, team1Pts);
			updateTeamStats(team2, team2Goals, team1Goals, team2Pts);
		}
	}
	
	/**
	 * Updates / stores the team stats.
	 * 
	 * @param team
	 * @param goalsScored
	 * @param goalsConceeded
	 * @param teamPts
	 */
	private static void updateTeamStats(String team, int goalsScored, int goalsConceeded, int teamPts) {
		
		// Check if the HashMap has the team in the key
		if (teams.containsKey(team)) {
			// Already in the HashMap key - So get the current details and update
			Team teamDetails = teams.get(team);
			teamDetails.incrementPlayed();
			teamDetails.incrementGoalsFor(goalsScored);
			teamDetails.incrementGoalsAgainst(goalsConceeded);
			
			// calculate win, loss, draw stats
			switch (teamPts) {
			case WIN_POINTS:
				teamDetails.incrementWins();
				break;
			case DRAW_POINTS:
				teamDetails.incrementDraws();
				break;
			case LOSS_POINTS:
				teamDetails.incrementLosses();
				break;
			default:
				break;
			}
		}
		else {
			// first time read for this team. Need to add the key and value
			teams.put(team, new Team(team));
			// recursive call
			updateTeamStats(team, goalsScored, goalsConceeded, teamPts);
		}
		
	}
	
	/**
	 * Shows each team stats to screen
	 */
	public static void showAllTeamsStats() {
		// sort by keys (alphabetically) - switching to a TreeMap
		SortedMap<String, Team> sortedTeams = new TreeMap<>(teams);
		// show all
		for (String team : sortedTeams.keySet()) {
			System.out.println(team);
			Team t = teams.get(team);
			System.out.println(t.stats() + "\n");
		}
	}
	
	/**
	 * Shows the league details in the format... Team Played For Against W D L
	 * Points Arsenal 3 17 4 3 0 0 9
	 */
	public static void showLeagueTable() {
		
		// Going to need to order by points so first get the values in the
		// HashMap and put into a List
		List<Team> allTeams = new ArrayList<Team>(teams.values());
		
		// now sort using comparator
		Collections.sort(allTeams, new ComparePoints());
		
		// output to screen (lots of formatting here - don't spend too much time on formatting getting the data out is the main thing
		// although if really keen https://www.baeldung.com/java-printstream-printf !) 
		
		// Print the header
		System.out.printf("%-20s %-6s %-5s %-10s %-2s %-2s %-8s %-6s\n",
				"Team", "Played", "For", "Against", "W", "D", "L", "Points");
		
		// Print the teams list
		for (Team t : allTeams) {
			System.out.printf("%-20s %-6s %-5s %-10s %-2s %-2s %-8s %-6s\n",
					t.getTeamName(), t.getPlayed(), t.getGoalsFor(), t.getGoalsAgainst(),
					t.getWins(), t.getDraws(), t.getLosses(), t.getTotalPoints());
		}
	}

}
