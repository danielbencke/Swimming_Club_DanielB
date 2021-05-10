package NameGenerators;
import java.util.Random;

/**
 * 
 * @author daniel
 * return a group random name
 * 
 */
public class GroupsNameGenerator {

	protected String[] Names = {"Apollo", "Tom", "Ceitan", "Jurassic", "Keykan", "Stompor", "Avancer", "Costello", "Droma", "Fidero", "Weran", "Lopoa"};
	
	public GroupsNameGenerator() {
}	
	public String getRandomName() {
	
		Random r = new Random();
		String name = this.Names[r.nextInt(Names.length)];
		return (name);
}
}
