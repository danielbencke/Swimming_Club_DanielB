package coachs;

import coachs.*;

public class HeadCoach extends Coach {
	
	public HeadCoach(String coachName) {
		
		super(coachName, CoachType.HEADCOACH);
}
/**
 * 
 * @return qualification level 5 for HEADCOACH
 * 
 */
	@Override
	public int qualiLevel() {
		int level = 5;
		return level;
}
}
