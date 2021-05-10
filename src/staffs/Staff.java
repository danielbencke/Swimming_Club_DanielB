package staffs;
/**
 * 
 * Generic staffs class. Set the properties, constructors and methods to be override later.
 */
import java.util.Random;

    public abstract class Staff {
                                                                 // properties
        private String staffName;	
	private StaffType type;	
	private int licenceNo;	
	private static int currentNumber = 0;
        	
    public Staff(String staffName, StaffType type) {
                                                                // constructors
        this.staffName = staffName;
	this.type = type;
	this.licenceNo = generateLicense();		
}
                                                                // methods
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
		
        return this.staffName;
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
        details = "\n STAFF NAME: " + this.staffName + "\n IDENTIFIER :  " + this.licenceNo + "\n ROLE: " + this.type  + "\n"; 	
        return details;
}    
    public StaffType getType() {
		
        return this.type;
}	
}
