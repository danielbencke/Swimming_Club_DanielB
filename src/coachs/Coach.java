package coachs;

/**
 * 
 * Generic coach class. Set the properties, constructors and methods to be override later.
 */

import java.util.Random;

    public abstract class Coach {
                                                            // properties
	private String coachName;	
	private CoachType type;	
	private int licenceNo;	
	private static int currentNumber = 100;
        
    public Coach(String coachName, CoachType type) {
                                                            // constructors
	this.coachName = coachName;
	this.type = type;
	this.licenceNo = generateLicense();
		
}
                                                              // methods
/**
 * 
 * @return qualification level 1-4
 * 
 */      
    public int qualiLevel() {
		
		Random r = new Random();		
		return r.nextInt(4)+1;
}
/**
 * 
 * @return a different identification for each group.
 * 
 */
    private int generateLicense() {

		currentNumber++;
		return currentNumber;
}
/**
 * 
 * @return name
 * 
 */
    public String getName() {
		
		return this.coachName;
}
/**
 * 
 * @return the identification created 
 * 
 */	
    public int checkLicense() {
		
		return this.licenceNo;
}
/**
 * 
 * @return details for specific object created
 * 
 */	
	@Override 
    public String toString() {
		
		String details;
		
		details = "\n COACH NAME: " + this.coachName + "\n IDENTIFIER :  " + this.licenceNo + "\n ROLE: " + this.type  +  "\n QUALIFICATION: " + this.qualiLevel()  + "\n"; 
		return details;
}

    public CoachType getType() {
		
		return this.type;
}	
}
