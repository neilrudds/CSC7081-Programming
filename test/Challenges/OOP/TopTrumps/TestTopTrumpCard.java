package Challenges.OOP.TopTrumps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Challenges.OOP.CardSharp.PlayingCard;
import Challenges.OOP.CardSharp.Suit;

class TestTopTrumpCard {
	
	// test data
	String nameValid, nameInvalid, realNameValid, realNameInvalid, imageFilenameValid, imageFilenameInvalid, bioInvalid, bioValid;
	HeroCategory categoryValid, categoryInvalid;
	int speedValid, speedInvalid, strengthValid, strengthInvalid, agilityInvalid, agilityValid, intellegenceInvalid, intellegenceValid;
	TopTrumpCard ttcValid1, ttcValid2, ttcValid3;
	
	@BeforeEach
	void setUp() throws Exception {
		
		// test data
		nameValid = "abcdefgABCDEFG";
		nameInvalid = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJK";
		realNameValid = "abcdefgABCDEFG";
		realNameInvalid = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJK";;
		imageFilenameValid = "myImage.jpg";
		imageFilenameInvalid = ".png";
		categoryValid = HeroCategory.HERO;
		//categoryInvalid = HeroCategory.valueOf("INVALID");
		speedValid = 1;
		speedInvalid = -1;
        strengthValid = 35;
        strengthInvalid = 101;
        agilityInvalid = -1;
        agilityValid = 65;
        intellegenceInvalid = -100;
        intellegenceValid = 100;
        bioInvalid = ""; // The are 
        bioValid = "This is my bio!";
        
        ttcValid1 = new TopTrumpCard(nameValid, realNameValid, imageFilenameValid, categoryValid, speedValid, strengthValid, agilityValid, intellegenceValid, bioValid);
        ttcValid2 = new TopTrumpCard(nameValid, realNameValid, imageFilenameValid, categoryValid, speedValid, strengthValid, agilityValid, intellegenceValid, bioValid);
        ttcValid3 = new TopTrumpCard("Banana Man", "Eric Allan", "banana.jpg", HeroCategory.HERO, 50, 65, 54, 89, "Bananaman is a parody of traditional superheroes, being portrayed as a schoolboy who is transformed into a muscled, caped figure when he eats a banana");
	}

	@Test
	void testTopTrumpCardDefaultConstructor() {
		TopTrumpCard ttc = new TopTrumpCard();
		assertNotNull(ttc);
	}

	@Test
	void testTopTrumpCardNonDefaultConstructor() {
		TopTrumpCard ttc = new TopTrumpCard(nameValid, realNameValid, imageFilenameValid, categoryValid, speedValid, strengthValid, agilityValid, intellegenceValid, bioValid);
		
		assertNotNull(ttc);
		assertEquals(nameValid, ttc.getName());
		assertEquals(categoryValid, ttc.getCategory());
	}

	@Test
	void testSetName() {
		TopTrumpCard ttc = new TopTrumpCard();
		
		// Valid
		ttc.setName(nameValid);
		assertEquals(nameValid, ttc.getName());
		
		// Invalid
	    assertThrows(IllegalArgumentException.class, () -> {
	       ttc.setName(nameInvalid);
	    });         
	}

	@Test
	void testSetRealName() {
		TopTrumpCard ttc = new TopTrumpCard();
		
		// Valid
		ttc.setRealName(realNameValid);
		assertEquals(realNameValid, ttc.getRealName());
		
		// Invalid
	    assertThrows(IllegalArgumentException.class, () -> {
	       ttc.setRealName(nameInvalid);
	    });         
	}

	@Test
	void testSetImageFilename() {
		TopTrumpCard ttc = new TopTrumpCard();
		
		// Valid
		ttc.setImageFilename(imageFilenameValid);
		assertEquals(imageFilenameValid, ttc.getImageFilename());
		
		// Invalid
	    assertThrows(IllegalArgumentException.class, () -> {
	       ttc.setImageFilename(imageFilenameInvalid);
	    });
	}

	@Test
	void testSetCategory() {
		TopTrumpCard ttc = new TopTrumpCard();
		
		// Valid
		ttc.setCategory(categoryValid);
		assertEquals(categoryValid, ttc.getCategory());
		
		// Invalid
	    assertThrows(IllegalArgumentException.class, () -> {
	       ttc.setCategory(HeroCategory.valueOf("INVALID"));
	    });
	}

	@Test
	void testSetSpeed() {
		TopTrumpCard ttc = new TopTrumpCard();
		
		// Valid
		ttc.setSpeed(speedValid);
		assertEquals(speedValid, ttc.getSpeed());
		
		// Invalid
	    assertThrows(IllegalArgumentException.class, () -> {
	       ttc.setSpeed(speedInvalid);
	    });
	}

	@Test
	void testSetStrength() {
		TopTrumpCard ttc = new TopTrumpCard();
		
		// Valid
		ttc.setStrength(strengthValid);
		assertEquals(strengthValid, ttc.getStrength());
		
		// Invalid
	    assertThrows(IllegalArgumentException.class, () -> {
	       ttc.setStrength(strengthInvalid);
	    });
	}

	@Test
	void testSetAgility() {
		TopTrumpCard ttc = new TopTrumpCard();
		
		// Valid
		ttc.setAgility(agilityValid);
		assertEquals(agilityValid, ttc.getAgility());
		
		// Invalid
	    assertThrows(IllegalArgumentException.class, () -> {
	       ttc.setAgility(agilityInvalid);
	    });
	}

	@Test
	void testSetIntellegence() {
		TopTrumpCard ttc = new TopTrumpCard();
		
		// Valid
		ttc.setIntellegence(intellegenceValid);
		assertEquals(intellegenceValid, ttc.getIntellegence());
		
		// Invalid
	    assertThrows(IllegalArgumentException.class, () -> {
	       ttc.setIntellegence(intellegenceInvalid);
	    });
	}

	@Test
	void testSetBio() {
		TopTrumpCard ttc = new TopTrumpCard();
		
		// Valid
		ttc.setBio(bioValid);
		assertEquals(bioValid, ttc.getBio());
		
		// Invalid
	    assertThrows(NullPointerException.class, () -> {
	       ttc.setBio(null);
	    });
	    assertThrows(IllegalArgumentException.class, () -> {
		   ttc.setBio("");
		});
	}
	
	@Test
	void testGetAverage() {
		assertEquals(ttcValid1.getAverage(), 50.25);
	}
	
	@Test
	void testGetMaxStatID() {
		assertEquals(ttcValid3.getMaxStatID(), 3);
	}
	
	@Test
	void testGetStatScore() {
		assertEquals(ttcValid3.getStatScore(0), 50);
		assertEquals(ttcValid3.getStatScore(1), 65);
	}

	@Test
	void testEqualsObject() {
		
		assertEquals(ttcValid1.equals(ttcValid2), true);
		assertEquals(ttcValid1.equals(ttcValid3), false);
		assertEquals(ttcValid2.equals(ttcValid3), false);
	}

}
