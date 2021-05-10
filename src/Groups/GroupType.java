package Groups;
/**
 * Groups Types
 * 
 */
import NameGenerators.GroupsNameGenerator;

public enum GroupType {

	DOLPHIN{

		@Override
		public Group getGroup() {
			
			this.GNG = new GroupsNameGenerator();
			String name = GNG.getRandomName();
		
			return new Dolphin("Dolphin" + name);
}
		@Override
		public String toString() {

			return "Dolphin";
}		
},
	SEALS{

		@Override
		public Group getGroup() {
			
			this.GNG = new GroupsNameGenerator();
			String name = GNG.getRandomName();
					
			return new Seals("Seals" + name);
}
		@Override
		public String toString() {

			return "Seals";
}
},	
	TURTLES{

		@Override
		public Group getGroup() {
			
			this.GNG = new GroupsNameGenerator();
			String name = GNG.getRandomName();
						
			return new Turtles("Turtles" + name);
}
		@Override
		public String toString() {
			
			return "Turtles";
}
};	
	protected  GroupsNameGenerator GNG;
	public abstract Group getGroup();
	public abstract String toString();
}
