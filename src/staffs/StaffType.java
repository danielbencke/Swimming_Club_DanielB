package staffs;
/**
 * 
 * Staffs Types
 * 
 */
import NameGenerators.NameGenerator;

public enum StaffType {

	RECEPTIONIST{

		@Override
		public Staff getStaff() {
			
			this.NG = new NameGenerator();
			String name = NG.getRandomName();
						
			return new Receptionist(name);
}
		@Override
		public String toString() {

			return "Receptionist";
}		
},	
	CLEANER{

		@Override
		public Staff getStaff() {
			
			this.NG = new NameGenerator();
			String name = NG.getRandomName();
						
			return new Cleaner(name);
}
		@Override
		public String toString() {

			return "Cleaner";
}		
},	
	CARETAKER{

		@Override
		public Staff getStaff() {
			
			this.NG = new NameGenerator();
			String name = NG.getRandomName();
						
			return new Caretaker(name);
}
		@Override
		public String toString() {
			
			return "Caretaker";
}		
};
	protected  NameGenerator NG;
	public abstract Staff getStaff();
	public abstract String toString();
}
