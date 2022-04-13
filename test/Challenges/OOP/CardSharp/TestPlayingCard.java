package Challenges.OOP.CardSharp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPlayingCard {

	// test data
	int valueValidLow, valueValidMid, valueValidHigh;
	int valueInvalidLow, valueInvalidHigh;
	Suit suit1, suit2, suit3, suit4;
	String validCardName1, validCardName2, validCardName3, validCardName4;
	PlayingCard playingCard;
	
	@BeforeEach
	void setUp() throws Exception {
		valueValidLow = 2;
		valueValidMid = 7;
		valueValidHigh = 14;

		valueInvalidHigh = 15;
		valueInvalidLow = 1;

		suit1 = Suit.CLUBS;
		suit2 = Suit.HEARTS;
		suit3 = Suit.SPADES;
		suit4 = Suit.DIAMONDS;

		validCardName1 = "Two of Clubs";
		validCardName2 = "Seven of Hearts";
		validCardName3 = "Ace of Spades";
		validCardName4 = "Two of Diamonds";

		playingCard = new PlayingCard(suit1, valueValidLow);
	}
	
	@Test
	void testPlayingCardConstructorValid() {
		PlayingCard toCreate = new PlayingCard(suit1, valueValidLow);
		
		assertEquals(valueValidLow, toCreate.getFaceValue());
		assertEquals(suit1, toCreate.getSuit());
	}

	@Test
	void testPlayingCardConstructorInvalid() {
		String expectedMessage = "Card Face Value must be between 2 and 14 inclusive";

		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			new PlayingCard(suit1, valueInvalidHigh);
		});

		assertEquals(expectedMessage, exp.getMessage());
	}

	@Test
	void testGetSetSuit() {
		// test setting and retrieving all 4 suit values (probably overkill)
		// enum, so no need to test unhappy path (not possible)
		playingCard.setSuit(suit1);
		assertEquals(suit1, playingCard.getSuit());

		playingCard.setSuit(suit2);
		assertEquals(suit2, playingCard.getSuit());

		playingCard.setSuit(suit3);
		assertEquals(suit3, playingCard.getSuit());

		playingCard.setSuit(suit4);
		assertEquals(suit4, playingCard.getSuit());
	}

	@Test
	void testGetSetValidValue() {
		playingCard.setFaceValue(valueValidLow);
		assertEquals(valueValidLow, playingCard.getFaceValue());

		playingCard.setFaceValue(valueValidMid);
		assertEquals(valueValidMid, playingCard.getFaceValue());

		playingCard.setFaceValue(valueValidHigh);
		assertEquals(valueValidHigh, playingCard.getFaceValue());
	}

	@Test
	void testGetSetInvalidValue() {
		String expectedMessage = "Card Face Value must be between 2 and 14 inclusive";

		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			playingCard.setFaceValue(valueInvalidLow);
		});

		assertEquals(expectedMessage, exp.getMessage());

		exp = assertThrows(IllegalArgumentException.class, () -> {
			playingCard.setFaceValue(valueInvalidHigh);
		});
	}

	@Test
	void testToString() {
		PlayingCard pCard1 = new PlayingCard(suit1, valueValidLow);
		assertEquals(validCardName1, pCard1.toString());

		PlayingCard pCard2 = new PlayingCard(suit2, valueValidMid);
		assertEquals(validCardName2, pCard2.toString());

		PlayingCard pCard3 = new PlayingCard(suit3, valueValidHigh);
		assertEquals(validCardName3, pCard3.toString());

		PlayingCard pCard4 = new PlayingCard(suit4, valueValidLow);
		assertEquals(validCardName4, pCard4.toString());
	}
	
	@Test
	void testToStringValueSwitch() {
		String[] nums = new String[] {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
		for(int i=0;i<nums.length;i++) {
			int val=i+2;
			PlayingCard pCard = new PlayingCard(suit1, val);
			String expectedName = nums[i]+" of Clubs";
			assertEquals(expectedName, pCard.toString());
		}

	}
}
