package Challenges.OOP.CardSharp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/**
 * @author neilr
 */

public class CardSharpDriver {
    public static void main(String[] args) {

        List<PlayingCard> myDeck = getNewDeck();
        //System.out.println(myDeck);
        printDeck(myDeck);

        shuffleDeck(myDeck);
		System.out.println(myDeck);

		sortDeck(myDeck);
		System.out.println(myDeck);
		System.out.println();

        playHighCard(myDeck);

        playSnap_simple(myDeck);

        playSnap_proper(myDeck);
    }

    /**
	 * Simulate a game of snap between 2 players.
	 * Deck will be shuffled as a result of calling this method.
	 * 
	 * Full version with true alternating turns and check for snap each time
	 * Slightly complex use of ternarys to keep track of current player and where to play next card from etc.
	 * @param deck
	 */
	private static void playSnap_proper(List<PlayingCard> deck) {
		shuffleDeck(deck);
		Queue<PlayingCard> dealer = new LinkedList<PlayingCard>(deck);

        // Check the dealers deck
		if (dealer.size() % 2 != 0) {
			System.err.println("Cards in deck: " + dealer.size());
			System.err.println("Even number of cards required to play");
			System.err.println("Discarding 1 card to balance it out");
			dealer.remove();
		} else if (dealer.size() < 2) {
			System.err.println("Not enough cards to play");
			System.err.println("Cards in deck: " + dealer.size());
			System.err.println("Exiting method");
			return;
		}

		Queue<PlayingCard> p1Pile = new LinkedList<PlayingCard>();
		Queue<PlayingCard> p2Pile = new LinkedList<PlayingCard>();
		List<PlayingCard> centerPile = new LinkedList<PlayingCard>();
        
        // Deal cards out to players until none left
		while (!dealer.isEmpty()) {
			p1Pile.add(dealer.remove());
			p2Pile.add(dealer.remove());
		}

		Random rand = new Random();
		
		System.out.println("Lets play Snap - Full Version");
		System.out.println("First player to get rid of all their cards wins");
		System.out.println("***********************************************");

		System.out.println("Player 1 plays: " + p1Pile.peek().toString());
		centerPile.add(p1Pile.remove()); //start by playing p1s first card
		
		int currentPlayer = 2;
		while (p1Pile.size() > 0 && p2Pile.size() > 0) {
			Queue<PlayingCard> curPlayerPile = currentPlayer == 1 ? p1Pile:p2Pile;
			Queue<PlayingCard> opponentPile = currentPlayer == 1 ? p2Pile:p1Pile;
			int otherPlayer = currentPlayer == 1 ? 2:1;
			PlayingCard topCard = centerPile.get(centerPile.size() - 1);
			PlayingCard curCard = curPlayerPile.peek();
			
			System.out.printf("Player %d plays: " + curCard.toString() + "%n" , currentPlayer);
			centerPile.add(curPlayerPile.remove()); // add peeked card before moving on
		
			if (topCard.getFaceValue() != curCard.getFaceValue()) {
				System.out.println("No Match - next round");	
			} else {
				System.out.println("****SNAP!!****");
				int race = rand.nextInt(2) + 1; // random num 1 or 2 to indicate who said snap first
				int opponent = race == 1 ? 2 : 1;
				System.out.printf("Player %d snapped first, Player %d must take discard pile%n", race, opponent);
				if (race == 1) {
					p2Pile.addAll(centerPile);
					centerPile.clear();
				} else {
					p1Pile.addAll(centerPile);
					centerPile.clear();
				}
				System.out.printf("Card counts: P1-%d cards | P2-%d cards | center-%d cards | Total (%d)%n",
						p1Pile.size(), p2Pile.size(), centerPile.size(),
						(p1Pile.size() + p2Pile.size() + centerPile.size()));
            }

			if(centerPile.size() == 0 && opponentPile.size() > 0) {
				// make sure theres at least one card on the center pile before starting the loop again
				PlayingCard nextCard = opponentPile.peek();
				System.out.printf("Player %d plays: " + nextCard.toString() + "%n" , otherPlayer);
				centerPile.add(opponentPile.remove());
			} else {
				currentPlayer = currentPlayer == 1 ? 2:1;
			}
		}
		
		System.out.println("Game Over");
		System.out.printf("Final Card counts: P1-%d cards | P2-%d cards | center-%d cards | Total (%d)%n",
				p1Pile.size(), p2Pile.size(), centerPile.size(), (p1Pile.size() + p2Pile.size() + centerPile.size()));
		if (p1Pile.size() == p2Pile.size()) {
			System.out.println("Draw Game");
		} else if (p1Pile.size() == 0) {
			System.out.println("Player 1 wins");
		} else {
			System.out.println("Player 2 wins");
		}
		System.out.println();
	}

    /**
	 * Simulate a game of snap between 2 players. 
	 * Deck will be shuffled as a result of calling this method.
	 * 
	 * Slightly flawed version of game logic. 
	 * Each round, each player always plays a card each before any snaps possible.
	 * Should probably be able to snap at additional points in the game flow too.
	 *
	 * @param deck
	 */
	private static void playSnap_simple(List<PlayingCard> deck) {

		shuffleDeck(deck);
		Queue<PlayingCard> dealer = new LinkedList<PlayingCard>(deck);

        // Check the dealers deck
		if (dealer.size() % 2 != 0) {
			System.err.println("Cards in deck: " + dealer.size());
			System.err.println("Even number of cards required to play");
			System.err.println("Discarding 1 card to balance it out");
			dealer.remove();
		} else if (dealer.size() < 2) {
			System.err.println("Not enough cards to play");
			System.err.println("Cards in deck: " + dealer.size());
			System.err.println("Exiting method");
			return;
		}

		Queue<PlayingCard> p1Pile = new LinkedList<PlayingCard>();
		Queue<PlayingCard> p2Pile = new LinkedList<PlayingCard>();
		List<PlayingCard> centerPile = new LinkedList<PlayingCard>();

        // Deal cards out to players until none left
		while (!dealer.isEmpty()) {
			p1Pile.add(dealer.remove());
			p2Pile.add(dealer.remove());
		}

		Random rand = new Random();
		
		System.out.println("Lets play Snap");
		System.out.println("First player to get rid of all their cards wins");
		System.out.println("***********************************************");

		while (p1Pile.size() > 0 && p2Pile.size() > 0) {

			PlayingCard p1Card = p1Pile.peek();
			PlayingCard p2Card = p2Pile.peek();
			centerPile.add(p1Pile.remove());
			centerPile.add(p2Pile.remove());

			System.out.println("Player 1 plays: " + p1Card.toString());
			System.out.println("Player 2 plays: " + p2Card.toString());
			if (p1Card.getFaceValue() != p2Card.getFaceValue()) {
				System.out.println("No Match - next round");
			} else {
				System.out.println("****SNAP!!****");
				int race = rand.nextInt(2) + 1; // random num 1 or 2 to indicate who said snap first
				int opponent = race == 1 ? 2 : 1;
				System.out.printf("Player %d snapped first, Player %d must take discard pile%n", race, opponent);
				if (race == 1) {
					p2Pile.addAll(centerPile);
					centerPile.clear();
				} else {
					p1Pile.addAll(centerPile);
					centerPile.clear();
				}
				System.out.printf("Card counts: P1-%d cards | P2-%d cards | center-%d cards | Total (%d)%n",
						p1Pile.size(), p2Pile.size(), centerPile.size(),
						(p1Pile.size() + p2Pile.size() + centerPile.size()));
			}
		}

		System.out.println("Game Over");
		System.out.printf("Final Card counts: P1-%d cards | P2-%d cards | center-%d cards | Total (%d)%n",
				p1Pile.size(), p2Pile.size(), centerPile.size(), (p1Pile.size() + p2Pile.size() + centerPile.size()));
		if (p1Pile.size() == p2Pile.size()) {
			System.out.println("Draw Game");
		} else if (p1Pile.size() == 0) {
			System.out.println("Player 1 wins");
		} else {
			System.out.println("Player 2 wins");
		}
		System.out.println();
	}

    /**
	 * Simulate a game of high card best of 5 between 2 players. 
	 * Deck will be shuffled as a result of calling this method
	 * 
	 * @param deck
	 */
    private static void playHighCard(List<PlayingCard> deck) {
        final int GOAL = 3;

        shuffleDeck(deck);
        int player1Score = 0, player2Score = 0;
        Queue<PlayingCard> dealer = new LinkedList<PlayingCard>(deck);

        // Check the dealers deck
        if (dealer.size() % 2 != 0) {
            System.err.println("Cards in deck: " + dealer.size());
			System.err.println("Even number of cards required to play");
			System.err.println("Discarding 1 card to balance it out");
			dealer.remove();
		} else if (dealer.size() < 2) {
			System.err.println("Not enough cards to play");
			System.err.println("Cards in deck: " + dealer.size());
			System.err.println("Exiting method");
			return;
		}

        // Deal our cards to players until none left
        ArrayList<PlayingCard> p1deck = new ArrayList<PlayingCard>();
		ArrayList<PlayingCard> p2deck = new ArrayList<PlayingCard>();
		while (!dealer.isEmpty()) {
			p1deck.add(dealer.remove());
			p2deck.add(dealer.remove());
		}

        int round = 1;
		Random rand = new Random();

        System.out.printf("High Card, Best of %d. First to %d wins.%n", ((GOAL * 2) - 1), GOAL);
		System.out.println("**************************************");
		while (player1Score < GOAL && player2Score < GOAL) {
            System.out.printf("Round %d%n", round);
			
            // Get player 1 selection
            int p1index = rand.nextInt(p1deck.size());
			PlayingCard p1choice = p1deck.get(p1index);
			
            // Get player 2 selection
            int p2index = rand.nextInt(p2deck.size());
			PlayingCard p2choice = p2deck.get(p2index);
			
            System.out.println("Player 1 chooses: " + p1choice.toString());
			System.out.println("Player 2 chooses: " + p2choice.toString());

            // Compare player face values
			if (p1choice.getFaceValue() > p2choice.getFaceValue()) {
				System.out.println("Player 1 wins the round");
				player1Score++;
			} else if (p2choice.getFaceValue() > p1choice.getFaceValue()) {
				System.out.println("Player 2 wins the round");
				player2Score++;
			} else {
				System.out.println("Draw Round");
			}
			System.out.printf("Current Score: Player 1 (%d) | Player 2 (%d)%n", player1Score, player2Score);
			round++;
		}

		String result = player1Score > player2Score ? "Player 1 wins!!" : "Player 2 wins!!";
		System.out.println();
		System.out.println(result);
		System.out.printf("Final Score: Player 1 (%d) | Player 2 (%d)%n%n", player1Score, player2Score);
    }

    /**
	 * Sort the deck back into sorted order (by value, then by suit)
	 * 
	 * @param deckToSort
	 */
	private static void sortDeck(List<PlayingCard> deckToSort) {
		Collections.sort(deckToSort, new CompareCardByFaceValue());
		Collections.sort(deckToSort, new CompareCardBySuitSimple());
	}

    /**
	 * Randomise the order of the deck
	 * 
	 * @param deck
	 */
	private static void shuffleDeck(List<PlayingCard> deck) {
		Collections.shuffle(deck);
	}

    private static void printDeck(List<PlayingCard> deck) {
		for (PlayingCard card : deck) {
			System.out.println(card.toString());
		}
	}

    /**
	 * Create a new deck by adding all possible valid cards to a list
	 * @return the newly created deck of 52 cards
	 */
    private static List<PlayingCard> getNewDeck() {
        List<PlayingCard> deck = new ArrayList<PlayingCard>(52);

        Suit[] suits = Suit.values(); // get an array of all possible values for this enum
        for(Suit suit : suits) { // for each suit
            for (int i = 2; i <= 14; i++) { // generate the following cards
                deck.add(new PlayingCard(suit, i));
            }
        }
        return deck;
    }
}
