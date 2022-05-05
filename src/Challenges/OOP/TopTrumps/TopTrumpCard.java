package Challenges.OOP.TopTrumps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Name,Real Name,Image Filename,Category,Speed,Strength,Agility,Intelligence,Bio
 */

public class TopTrumpCard {

	public static final int NAME_MIN_CHARS = 1;
    public static final int NAME_MAX_CHARS = 30;
    public static final int REAL_MIN_CHARS = 1;
    public static final int REAL_MAX_CHARS = 30;
    public static final int IMG_FN_MIN_CHARS = 5;
    public static final int IMG_FN_MAX_CHARS = 30;
    public static final String IMG_REQUIRED_EXT = ".jpg";
    public static final int STAT_MIN_VAL = 0;
    public static final int STAT_MAX_VAL = 100;

    private String name;
    private String realName;
    private String imageFilename;
    private HeroCategory category;
    private int speed;
    private int strength;
    private int agility;
    private int intellegence;
    private String bio;
    private double statAvg;

    /**
     * Default Constructor
     */
    public TopTrumpCard() {

    }

    public TopTrumpCard(String name, String realName, String imageFilename, HeroCategory category, int speed,
            int strength, int agility, int intellegence, String bio) {
        setName(name);
        setRealName(realName);
        setImageFilename(imageFilename);
        setCategory(category);
        setSpeed(speed);
        setStrength(strength);
        setAgility(agility);
        setIntellegence(intellegence);
        setBio(bio);
        calculateAverage();
    }

	public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= NAME_MIN_CHARS && name.length() <= NAME_MAX_CHARS) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("The name " + name + " must be between " + NAME_MIN_CHARS + " and " + NAME_MAX_CHARS + " characters long.");
        }
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        if (realName.length() >= REAL_MIN_CHARS && realName.length() <= REAL_MAX_CHARS) {
            this.realName = realName;
        } else {
            throw new IllegalArgumentException("The real name " + realName + " must be between " + REAL_MIN_CHARS + " and " + REAL_MAX_CHARS + " characters long.");
        }
    }

    public String getImageFilename() {
        return imageFilename;
    }

    public void setImageFilename(String imageFilename) {
        if (imageFilename.length() >= IMG_FN_MIN_CHARS && imageFilename.length() <= IMG_FN_MAX_CHARS 
                && imageFilename.toLowerCase().indexOf(IMG_REQUIRED_EXT) > 0) {
            this.imageFilename = imageFilename;
        } else {
            throw new IllegalArgumentException("The image filename " + imageFilename + " must be between " + IMG_FN_MIN_CHARS + " and " + IMG_FN_MAX_CHARS + " characters long and must contain the extension " + IMG_REQUIRED_EXT);
        }
    }

    public HeroCategory getCategory() {
        return category;
    }

    public void setCategory(HeroCategory category) {
        this.category = category;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= STAT_MIN_VAL && speed <= STAT_MAX_VAL) {
            this.speed = speed;
        } else {
            throw new IllegalArgumentException("The speed must be between " + STAT_MIN_VAL + " and " + STAT_MAX_VAL + ".");
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength >= STAT_MIN_VAL && strength <= STAT_MAX_VAL) {
            this.strength = strength;
        } else {
            throw new IllegalArgumentException("The strength must be between " + STAT_MIN_VAL + " and " + STAT_MAX_VAL + ".");
        }
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        if (agility >= STAT_MIN_VAL && agility <= STAT_MAX_VAL) {
            this.agility = agility;
        } else {
            throw new IllegalArgumentException("The agility must be between " + STAT_MIN_VAL + " and " + STAT_MAX_VAL + ".");
        }
    }

    public int getIntellegence() {
        return intellegence;
    }

    public void setIntellegence(int intellegence) {
        if (intellegence >= STAT_MIN_VAL && intellegence <= STAT_MAX_VAL) {
            this.intellegence = intellegence;
        } else {
            throw new IllegalArgumentException("The intellegence must be between " + STAT_MIN_VAL + " and " + STAT_MAX_VAL + ".");
        }
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
    	if (bio == null)
    		throw new NullPointerException("The bio cannot be null.");
    	if (bio.length() <= 0)
    		throw new IllegalArgumentException("The bio must be more than 0 characters in length");
        this.bio = bio;
    }
    
    public int getMaxStatID() {
    	
    	List<Integer> stats = new ArrayList<Integer>();
    	stats.add(speed);
    	stats.add(strength);
    	stats.add(agility);
    	stats.add(intellegence);
    	
    	int maxVal = Collections.max(stats);
    	return stats.indexOf(maxVal);
    	
    	/*return (speed > strength && speed > agility && speed > intellegence) ? 0 
    			:((strength > speed && strength > agility && strength > intellegence) ? 1 
    				:((agility > speed && agility > strength && agility > intellegence) ? 2 : 3));*/
    }
    
    public int getStatScore(int statChoice) {
    	
    	List<Integer> stats = new ArrayList<Integer>();
    	stats.add(speed);
    	stats.add(strength);
    	stats.add(agility);
    	stats.add(intellegence);
    	return stats.get(statChoice);
    	
    	/*
    	switch(statChoice) {
    		case 0:
    			return speed;
    		case 1:
    			return strength;
    		case 2:
    			return agility;
    		case 3:
    			return intellegence;
    		default:
    			System.out.println("No corresponding property for provided stat choice!");
    			return -1;
    	}*/
    }
    
    private void calculateAverage() {
		this.statAvg = (speed + strength + agility + intellegence) / 4.0;		
	}   
    
    public double getAverage() {
    	return this.statAvg;
    }
    
    @Override
  	public String toString() {

    	StringBuilder sb = new StringBuilder();
    	sb.append("----------------------------------\n");
    	sb.append("name:         ");
    	sb.append(name + "\n");
    	sb.append("realname:     ");
    	sb.append(realName + "\n");
    	sb.append("filename:     ");
    	sb.append(imageFilename + "\n");
    	sb.append("category:     ");
    	sb.append(category.toString() + "\n");
    	sb.append("speed:        ");
    	sb.append(Integer.toString(speed) + "\n");
    	sb.append("strength:     ");
    	sb.append(Integer.toString(strength) + "\n");
    	sb.append("agility:      ");
    	sb.append(Integer.toString(agility) + "\n");
    	sb.append("intelligence: ");
    	sb.append(Integer.toString(intellegence) + "\n");
    	sb.append("bio:          ");
    	sb.append(bio + "\n");
    	sb.append("----------------------------------\n");
    	return sb.toString();
  	}
    
    public String getHeroSummary() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("----------------------------------\n");
    	sb.append(name);
    	sb.append(" / ");
    	sb.append(realName + " ");
    	sb.append("(" + category.toString() + ")");
    	sb.append("\n");
    	sb.append("sp: ");
    	sb.append(Integer.toString(speed));
    	sb.append(" | ");
    	sb.append("st: ");
    	sb.append(Integer.toString(strength));
    	sb.append(" | ");
    	sb.append("ag: ");
    	sb.append(Integer.toString(agility));
    	sb.append(" | ");
    	sb.append("in: ");
    	sb.append(Integer.toString(intellegence));
    	sb.append("\n");
    	sb.append("----------------------------------\n");
    	return sb.toString();
    }
    

	@Override
	public int hashCode() {
		return Objects.hash(agility, bio, category, imageFilename, intellegence, name, realName, speed, strength);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TopTrumpCard other = (TopTrumpCard) obj;
		return agility == other.agility && Objects.equals(bio, other.bio) && category == other.category
				&& Objects.equals(imageFilename, other.imageFilename) && intellegence == other.intellegence
				&& Objects.equals(name, other.name) && Objects.equals(realName, other.realName) && speed == other.speed
				&& strength == other.strength;
	}
    

    
}
