package Groups;

/**
 * 
 * Generic group class. Set the properties, constructors and methods to be override later.
 */
import java.util.Random;

        public abstract class Group {
                                                                  // properties
            private String groupName;	
            private GroupType type;	
            private int licenceNo;	
            private static int currentNumber = 0;
            private Days Day;
        
	public Group(String groupName, GroupType type) {
                                                                 // constructors
            this.groupName = groupName;
            this.type = type;
            this.licenceNo = generateLicense();
            this.Day = Days.getRandomDay();
}   
                                                                // methods
  /**
   * 
   * @return number of swimmers per group. Maximum 30.
   * 
   */
	public int numberSwimmers() {
		
            Random r = new Random();
            return r.nextInt(30)+1;	// "+1" not zero swimmers
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
 */
	public String getName() {
		
            return this.groupName;
}
/**
 * 
 * @return the identification created 
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
            details = "\n GROUP NAME: " + this.groupName+this.licenceNo + "\n GROUP TYPE: " + this.type  + "\n DAY OF THE WEEK: " + this.Day + "\n"; 
            return details;
}
	public GroupType getType() {
		
            return this.type;
}
}
