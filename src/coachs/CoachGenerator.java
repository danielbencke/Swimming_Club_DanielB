package coachs;

/**
 * Pick a random coach from Enum CoachType
 * 
 */
import java.util.Random;

public class CoachGenerator {

	public Coach getCoach() {
		
		Random r = new Random();
		CoachType[] types = CoachType.values();
		
		int number = r.nextInt(types.length-1);	
	                
		return getCoach(types[number]);
}	
	public Coach getCoach(CoachType type) {
		
		return type.getCoach();
}	
}
