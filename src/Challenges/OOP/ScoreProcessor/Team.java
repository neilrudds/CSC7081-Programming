package Challenges.OOP.ScoreProcessor;

public class Team {
		
	private String teamName;
	private int played;
	private int goalsFor;
	private int goalsAgainst;
	private int win;
	private int draw;
	private int loss;
	
	// Default Constructor
	public Team() {
		
	}
	
	public Team(String teamName) {
		this.setTeamName(teamName);
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		if (teamName.length() > 0) {
			this.teamName = teamName;
		} else {
			throw new IllegalArgumentException("The team name  " + teamName + " is invalid.");
		}
	}

	/**
	 * @return the played
	 */
	public int getPlayed() {
		return played;
	}

	/**
	 * @param played the played to set
	 */
	public void incrementPlayed() {
		this.played++;
	}

	/**
	 * @return the goalsFor
	 */
	public int getGoalsFor() {
		return goalsFor;
	}

	/**
	 * @param goalsFor the goalsFor to set
	 */
	public void incrementGoalsFor(int goalsFor) {
		this.goalsFor += goalsFor;
	}

	/**
	 * @return the goalsAgainst
	 */
	public int getGoalsAgainst() {
		return goalsAgainst;
	}

	/**
	 * @param goalsAgainst the goalsAgainst to set
	 */
	public void incrementGoalsAgainst(int goalsAgainst) {
		this.goalsAgainst += goalsAgainst;
	}

	/**
	 * @return the win
	 */
	public int getWins() {
		return win;
	}

	/**
	 * @param win the win to set
	 */
	public void incrementWins() {
		this.win++;
	}

	/**
	 * @return the draw
	 */
	public int getDraws() {
		return draw;
	}

	/**
	 * @param draw the draw to set
	 */
	public void incrementDraws() {
		this.draw++;
	}

	/**
	 * @return the loss
	 */
	public int getLosses() {
		return loss;
	}

	/**
	 * @param loss the loss to set
	 */
	public void incrementLosses() {
		this.loss++;
	}

	/**
	 * @return the totalPoints
	 */
	public int getTotalPoints() {
		return this.getWins()*3 + this.getDraws();
	}
	
	/**
	 * Note the use of the StringBuilder
	 * @return
	 */
	public String stats() {
		
		StringBuilder sb = new StringBuilder();
		String newLine = "\n";
		sb.append("Games played  : " + this.getPlayed());
		sb.append(newLine);
		sb.append("Goals for     : " + this.getGoalsFor());
		sb.append(newLine);
		sb.append("Goals against : " + this.getGoalsAgainst());
		sb.append(newLine);
		sb.append("Wins          : " + this.getWins());
		sb.append(newLine);
		sb.append("Draws         : " + this.getDraws());
		sb.append(newLine);
		sb.append("Losses        : " + this.getLosses());
		sb.append(newLine);
		sb.append("Points        : " + this.getTotalPoints());
		
		return sb.toString();
	}
	
}
