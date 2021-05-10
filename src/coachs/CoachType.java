package coachs;

import NameGenerators.NameGenerator;

public enum CoachType {

	ASSISTANTCOACH{

		@Override
		public Coach getCoach() {
			
			this.NG = new NameGenerator();
			String name = NG.getRandomName();
			return new AssistantCoach(name);
}
		@Override
		public String toString() {

			return "Assistant Coach";
}
},	
	SWIMTEACHER{

		@Override
		public Coach getCoach() {
			
			this.NG = new NameGenerator();
			String name = NG.getRandomName();
			return new SwimTeacher(name);
}
                @Override
		public String toString() {

			return "SwimTeacher";
}
},	
	HEADCOACH{

		@Override
		public Coach getCoach() {
			
			this.NG = new NameGenerator();
			String name = NG.getRandomName();
			return new HeadCoach(name);
}
		@Override
		public String toString() {
			
			return "HeadCoach";
}
};        
	protected  NameGenerator NG;
	public abstract Coach getCoach();
	public abstract String toString();
}
