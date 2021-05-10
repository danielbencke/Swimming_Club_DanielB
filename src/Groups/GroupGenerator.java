package Groups;

/**
 * Pick a random group from Enum GroupType
 * 
 */
import java.util.Random;

public class GroupGenerator {
    
	public Group getGroup() {
		
		Random r = new Random();
		GroupType[] types = GroupType.values();
		
		int number = r.nextInt(types.length);	
	
		return getGroup(types[number]);
		
}
        
	public Group getGroup(GroupType type) {
		
		return type.getGroup();
}
}
