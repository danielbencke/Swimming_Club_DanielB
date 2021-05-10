package staffs;
/**
 * 
 * Pick a random staff from StaffType
 * 
 */
import java.util.Random;

public class StaffGenerator {

	public Staff getStaff() {
		
            Random r = new Random();
            StaffType[] types = StaffType.values();
                
            int number = r.nextInt(types.length);	
                
            return getStaff(types[number]);                
		
}        
	public Staff getStaff(StaffType type) {
		
            return type.getStaff();
}	
}
