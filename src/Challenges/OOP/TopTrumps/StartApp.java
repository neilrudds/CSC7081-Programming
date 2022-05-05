package Challenges.OOP.TopTrumps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * PUT YOUR NAME HERE AND YOUR STUDENT NUMBER
 * 
 *
 */

public class StartApp {
	
	public static final String RESOURCES_PATH = "Resources/";
	public static final String FILE_NAME = "toptrumpscards.csv";
	
	/**
	 * Entry point of program - no need to modify this method
	 * @param args
	 */
	public static void main(String[] args) {
		showMenu();	
	}
	
	//TODO modify readData method to populate List appropriately - method partially completed already
	//TODO add static methods to this class as required to achieve tasks outlined in menu
	//TODO modify showMenu method to add calls to new methods you write to accomplish the tasks outlined in the menu

	/**
	 * Launches menu system which in turn calls appropriate methods based on user choices
	 * Partially implemented already
	 * requires updating to add calls to other methods written to achieve the tasks described in tasks 3-10
	 */
	public static void showMenu() {
		List<TopTrumpCard> mainDeck = readData();

		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int option;
		System.out.println("Hero Card Processing");
		do {
			System.out.println("1. (Re)read Data From File (use to restore removed card for example)");
			System.out.println("2. Play Demo Game with Current Deck");
			System.out.println("3. Display the number of Cards in the Current Deck");
			System.out.println("4. Display full details for all cards in the current Deck");
			System.out.println("5. Display summary details of the top 5 strongest Heroes in the Deck");
			System.out.println(
					"6. Display summary details of Villains in the Deck with an agility rating of 75 or more, sorted alphatically by name");
			System.out.println("7. Display the card name and bio of the card/cards with the longest bio in the Deck");
			System.out.println(
					"8. Find Swapsies: Identify and display summary details of any duplicate cards in the Deck");
			System.out.println("9. Remove any duplicate cards from the Deck.");
			System.out.println(
					"10. Sort the deck from highest to lowest determined by average of the 4 main stats. \n\tDisplay summary details of all cards and include the average as part of the summary.");
			System.out.println("11. Quit");
			System.out.println("Enter option ...");
			option = scanner.nextInt();
			System.out.println();
			switch (option) {

			case 1:
				mainDeck = readData();
				break;
			case 2:
				//System.out.println("Option currently disabled...");
				/* TODO Uncomment method call to enable this option 
				 * (requires TopTrumpCard class to match expectations of Game Method to compile successfully)
				 * deliberately commented out initially to allow attempting other tasks
				 */
				CardGame.playDemo(mainDeck);
				break;
			case 3:
				//System.out.println("Not yet implemented...");
				displayCardCount(mainDeck);
				break;
			case 4:
				//System.out.println("Not yet implemented...");
				displayAllHeroDetails(mainDeck);
				break;
			case 5:
				//System.out.println("Not yet implemented...");
				displayTopFiveHeroSummary(mainDeck);
				break;
			case 6:
				//System.out.println("Not yet implemented...");
				displayHerosAgilitySeventyFiveAndOver(mainDeck);
				break;
			case 7:
				displayHeroWithLongestBio(mainDeck);
				break;
			case 8:
				removeDuplicates(mainDeck, true);
				break;
			case 9:
				removeDuplicates(mainDeck, false);
				// Could also do
				mainDeck = new ArrayList<TopTrumpCard>(new HashSet<TopTrumpCard>(mainDeck));
				break;
			case 10:
				displaySummaryByAverage(mainDeck);
				break;
			case 11:
				System.out.println("Quitting");
				break;
			default:
				System.out.println("Try options again...");
			}
		} while (option != 11);
		scanner.close();
	}

	/**
	 * Reads in the data from the provided csv and returns a list of TopTrumpCard
	 * objects for further processing - requires updating for full functionality
	 */
	public static List<TopTrumpCard> readData() {

		List<TopTrumpCard> listFromFile = new ArrayList<TopTrumpCard>();

		File file = new File(RESOURCES_PATH + FILE_NAME); // hard coded to specific file

		// try with resources - auto closes reader resources when finished/exception
		// occurs
		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {

			br.readLine(); // discard header

			String row;
			while ((row = br.readLine()) != null && row.length() > 0) {

				// Parse the row into parts
				String[] cells = row.split(",");

				// Create a new TopTrumpCard with the row values
				listFromFile.add(new TopTrumpCard(
						cells[0].trim(),
						cells[1].trim(),
						cells[2].trim(),
						HeroCategory.valueOf(cells[3].trim().toUpperCase()),
						Integer.parseInt(cells[4].trim()),
						Integer.parseInt(cells[5].trim()),
						Integer.parseInt(cells[6].trim()),
						Integer.parseInt(cells[7].trim()),
						cells[8].trim())
				);

			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		} catch (IOException e) {
			System.out.println("IO Exception");
		} catch (Exception e) {
			System.out.println("Exception occured");
			System.out.println(listFromFile.size() + " lines read successfully");
			System.out.println(e.getMessage());
		}
		System.out.println(listFromFile.size() + " lines read successfully");
		return listFromFile;
	}
	
	/**
	 * Displays the number of cards in the provided deck to screen
	 * @param cards
	 */
	public static void displayCardCount(Collection<TopTrumpCard> cards) {
		System.out.println("Currently there are " + cards.size() + " cards in the deck.");
		System.out.println();
	}
	
	/**
	 * Displays the details of all provided cards to the screen
	 * @param cards
	 */
	public static void displayAllHeroDetails(Collection<TopTrumpCard> cards) {
		if (cards == null || cards.isEmpty()) {
			System.out.println("There are no cards in the deck to display.");
			return;
		}
		for(TopTrumpCard ttc : cards) {
			System.out.println(ttc.toString());
		}
	}
	
	public static void displayTopFiveHeroSummary(Collection<TopTrumpCard> cards) {
		
		// Store the sorted cards locally to preserve the deck
		List<TopTrumpCard> sorted = new ArrayList<TopTrumpCard>(cards);
		
		//List<TopTrumpCard> strongest = findXStrongest(cards, 5);
		
		// Sort the cards using our comparator
		Collections.sort(sorted, new CompareHerosByStats());
		
		// Print
		for(int i = 0; i < 5; i++) {;
			System.out.print(sorted.get(i).getHeroSummary());
		}
	}
	
	/**
	 * Find the X Strongest Cards
	 * @param cards
	 * @param x
	 * @return
	 */
	private static List<TopTrumpCard> findXStrongest(Collection<TopTrumpCard> cards, int x) {

		List<TopTrumpCard> sortable = new ArrayList<TopTrumpCard>();
		for (TopTrumpCard ttc : cards) {
			if (ttc.getCategory() == HeroCategory.HERO)
			{
				sortable.add(ttc);
			}
		}
		Collections.sort(sortable, new CompareHerosByStats());
		
		List<TopTrumpCard> results = new ArrayList<TopTrumpCard>();
		for(int i = 0; i < x; i++) {;
			results.add(sortable.get(i));
		}
		return results;
	}

	public static void displayHerosAgilitySeventyFiveAndOver(List<TopTrumpCard> cards) {
		
		// Filter the cards by agility >= 75 and order alphabetically by name
		List<TopTrumpCard> filtered = SearchHeroByStat.searchHeroByMinStatAndSort(cards, 75, 2, new CompareHerosByName());
		
		for(TopTrumpCard ttc : filtered) {
			System.out.println(ttc.getHeroSummary());
		}
	}
	
	public static void displayHeroWithLongestBio(List<TopTrumpCard> cards) {
				
		TopTrumpCard maxBioLength = Collections.max(cards, new CompareHerosByBioLength());
		int maxLength = maxBioLength.getBio().length();
		for(TopTrumpCard ttc : cards) {
			if (ttc.getBio().length() == maxLength) {
				System.out.printf("Name: %s, Bio: %s%n", ttc.getName(), ttc.getBio());
			}
		}
		
		// Above solution doesnt feel very elegant, perhaps a better way...
		/*Map<TopTrumpCard, Integer> map = new TreeMap<TopTrumpCard, Integer>(new CompareHerosByBioLength());

		int i = 0;
		for(TopTrumpCard ttc : cards) {
			map.put(ttc, i++);
		}
		
		System.out.println("\nMap contains:\nKey\t\tValue");

		// display all map content
		for (TopTrumpCard key : map.keySet()) {
		    System.out.printf("%-10s%10d \n", key, map.get(key));
		}
		// Not finished yet...this only prints out one of the two cards
		*/
		
	}
	
	public static void removeDuplicates(List<TopTrumpCard> cards, Boolean displayOnly) {
		
		// A set requires that the elements are unique
		// The method add of Set returns a boolean whether a value already exists (true if it does not exist, false if it already exists.
		Set<TopTrumpCard> mySet = new HashSet<TopTrumpCard>();
		for (TopTrumpCard ttc : cards) {
			if (!mySet.add(ttc)) {
				System.out.println("Duplicate card found:");
				System.out.println(ttc.getHeroSummary());
			}
		}
		// Should we update the main deck
		if (!displayOnly) {
			cards.clear();
			cards.addAll(mySet);
			System.out.println("Duplicate cards removed from main deck.");
		}
		
		// Another solution.
		/*
		List<TopTrumpCard> unique = new ArrayList<TopTrumpCard>();
		List<TopTrumpCard> swappable = new ArrayList<TopTrumpCard>();
		for (TopTrumpCard tc : cards) {
			if(!unique.contains(tc)) {
				unique.add(tc);
			} else {
				// already in unique, must be a swappable
				swappable.add(tc);
			}
		}
		*/
	}
	
	public static void displaySummaryByAverage(List<TopTrumpCard> cards) {
		
		List<TopTrumpCard> ordered = new ArrayList<TopTrumpCard>(cards);
		Collections.sort(ordered, new CompareHerosByStatsAvg());
		
		for(TopTrumpCard ttc : ordered) {
			System.out.print(ttc.getHeroSummary());
			System.out.printf("Average Stat: %.2f\n", ttc.getAverage());
		}
	}
	
}
