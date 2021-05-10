package Club;
import java.util.ArrayList;
import java.util.Random;
import staffs.*;
import coachs.*;
import Groups.*;
import Swimmers.*;
import Utilities.InputUtilities;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 
 * @author daniel
 * 
 * The application use object-oriented programming to create a Swimming Club. Objects presents : Staffs, Coachs, Groups, Swimmers.
 * An user interface using switch case statement allows display information through typing specific words.
 * 

 */
public class ClubGenerator {

	private ArrayList<Staff> staffList;          
	public ArrayList<Coach> coachList;
        public ArrayList<Group> groupList;
        public ArrayList<Swimmer> swimmerList;        
        
        public static void main(String[] args) {
		
		ClubGenerator myClub = new ClubGenerator();           // start all the process of creation. Arrays and objects
}
		
	public ClubGenerator() {   // Objects creation : staffs - 10 units , coachs - 50 units , groups - 50 units , swimmers - 300 units;
		
		this.staffList = new ArrayList<Staff>();
		createStaffs();
                
		this.coachList = new ArrayList<Coach>();
		createCoach();
                
                this.groupList = new ArrayList<Group>();
                createGroup();
               
                this.swimmerList = new ArrayList<Swimmer>();
                createSwimmers();
                
                BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));
          
        int stop = 0;
                
        do {   // User interface: Display some options to view the objects created. Switch Case statement
            
            System.out.println("Type to display.  " + " We have the following options:  \n  ALLSTAFFS, RECEPTIONIST, CLEANER, CARETAKER, ASSISTANTCOACH, SWIMTEACHER , HEADCOACH, ALLGROUPS, DOLPHIN, SEALS, TURTLES, TRAININGDAY, ALLSWIMMERS  \n  Ps: Type EXIT to leave" ) ;
        
            try {
            
                String input = myKB.readLine();
     
                switch (input){       
                    
                case "ALLSTAFFS": 
                    
                   
                    showStaffs(); 
                    showCoachs();
                        stop++;
                        break;
                        
                 case "RECEPTIONIST":
                    
                       categoriesStaff("Receptionist");
                        stop++;
                        break;
                
                 case "CLEANER":
                    
                      categoriesStaff("Cleaner");
                       stop++;
                        break;        
                        
                 case "CARETAKER":
                    
                      categoriesStaff("Caretaker");
                       stop++;
                        break;
                        
                 case "ASSISTANTCOACH":
                    
                      categoriescouchs("Assistant Coach");
                       stop++;
                        break;
                
                        
                 case "SWIMTEACHER":
                    
                      categoriescouchs("SwimTeacher");
                       stop++;
                        break;
                        
                 case "HEADCOACH":
                    
                      categoriescouchs("HeadCoach");
                       stop++;
                        break;   
                        
                 case "ALLGROUPS":
                    
                      showGroups();
                       stop++;
                        break;
                 
                 case "DOLPHIN":
         
              
                      categoriesgroups("Dolphin");
                       stop++;
                        break;
                        
                 case "SEALS":

                      categoriesgroups("Seals");
                       stop++;
                        break;
               
                        
                 case "TURTLES":
  
                      categoriesgroups("Turtles");
                       stop++;
                        break;
                        
                        
                 case "TRAININGDAY":
                     
                    String dayUser = InputUtilities.getUserText("Please type which day are your session to check the list: MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY");
                      training(dayUser);
                       stop++;
                        break;
                        
                case "ALLSWIMMERS":
                    
                      showSwimmers();
                       stop++;
                        break;
           
                case "EXIT":                  // stop the while structure 
                  
                       stop = 101;  
                        break;        
                              
                default:
                    
                    System.out.println("That is not a categorie available!");
                    stop = 0;
}                
}
            catch (Exception e) {
            
                    System.out.println("Something's wrong. Start again");
}
} 
        while (stop < 100); 
}
	
	private void createStaffs() {    // create and add staffs objects to staffList array
		        
	StaffGenerator myStaffGenerator = new StaffGenerator();
		
		for (int i=0; i<10; i++) {
			
			Staff someStaff = myStaffGenerator.getStaff();
			
			this.staffList.add(someStaff);
}
}        
        
	private void showStaffs(){ 	//  go through all elements created
    
	System.out.println(" ********************************************STAFFS LIST ******************************************************************");
         
		for( Staff P: staffList) {
			
			System.out.println(P.toString());
}
}
        
       private void createCoach() {    // create and add coachs objects to coachList array
      
       CoachGenerator myCoachGenerator = new CoachGenerator();
		
		for (int i=0; i<50; i++) {
                               			
			Coach someMember = myCoachGenerator.getCoach();
			this.coachList.add(someMember);
}            
       Coach someMember = myCoachGenerator.getCoach(CoachType.HEADCOACH);
                        this.coachList.add(someMember);
}

       private void showCoachs(){     //  go through all elements created
           
        System.out.println("********************************* COACHS LIST******************************************** ");
 
		for( Coach P: coachList) {
			
                        System.out.println(P.toString());
 }
 }
       
       private void createGroup() {     // create and add groups objects to groupList array
     
       GroupGenerator myGroupGenerator = new GroupGenerator();
		
		for (int i=0; i<50; i++) {                    
           			
			Group someEntity = myGroupGenerator.getGroup();
                        this.groupList.add(someEntity);
}
}
       
       private void createSwimmers() {    // create and add swimmers objects to swimmerList array
    
		for (int i=0; i<300; i++) {                    
                    
                        Swimmer mySwimmersGenerator = new Swimmer();
                      	swimmerList.add(mySwimmersGenerator);
}
}    
    
       private void showSwimmers() {      //  go through all elements created
              
                for( Swimmer t: swimmerList) {
			
			System.out.println("Name: " + t.getSwimmer() + " Age: " +  t.generateAge() + " years old" );  
}       
}
     
       private void showGroups(){          // Nested loop created for show every group and respectively coachs and swimmers.
           
       System.out.println("********************************* GROUPS LIST******************************************** ");
         
         int b = 0;
         
		for( Group P: groupList) {            // go through every group assigning a coach and  showing specific information such as number of swimmers for example. 
                    
                        int numberOfSwimmers = P.numberSwimmers();       // create and assign a random number of swimmers for this group
			System.out.println("\n COACH assigned for this group is:  " + coachList.get(b).getName() + " ID Number: " + coachList.get(b).checkLicense() + P.toString() + " NUMBER OF SWIMMERS:" + numberOfSwimmers + " \n SWIMMER LIST:");
           
                     
                     for (int i=0; i< numberOfSwimmers; i++){      // Then pick a random swimmers from a swimmerList array
                         
                            Random r = new Random();
		            int swimmmerRandom = r.nextInt(swimmerList.size());
                            System.out.println(swimmerList.get(swimmmerRandom).name);
}
                      b++; 	// go through elements from coachList array

}
}
              
        private void categoriesgroups (String groups){    // go through elements from groupList Array and show only the ones selected by user. For example Dolphin, Seals, Turtles.
       
        System.out.println(groups + " LIST: \n" + "\n *********** ");
         
            for( Group t: groupList) {
                
                    if (t.getName().contains(groups)) {
                    System.out.println(t.getName() + t.checkLicense());}
}
        System.out.println("\n *********** ");              
}
            
        private void training (String weekDay){         // first ask the user which day of the week to show (weekDay) and then who is assigned to train on that day
                
        System.out.println("WHICH DAY ARE YOU TRAINING? : \n" + "\n *********** ");
         
            for( Group t: groupList) {
                       
                        if (t.toString().contains(weekDay)) {
			System.out.println(t.getName() + t.checkLicense()+ " are training on " + weekDay);
}
}
        System.out.println("\n *********** ");                 
}             
        
        private void categoriesStaff (String Staffs){   // go through elements from staffList Array and show only the ones selected by user.  Receptionist, Cleaner , Caretaker
                 
        System.out.println("List of " + Staffs + "\n *********** "); 
    
            for( Staff s: staffList) {            
          
                    if (s.toString().contains(Staffs)) {                         
                    System.out.println(s.getName());
 }
 }
        System.out.println("\n *********** ");        
}        
        
        private void categoriescouchs (String Coachs){   // go through all elements from coachList Array and show only the ones selected by user.  AssistantCoach, SwimTeacher , HeadCoach
    
        System.out.println("List of " + Coachs + "\n *********** "); 
    
            for( Coach s: coachList) {            
       
                    if (s.toString().contains(Coachs)) {                         
                    System.out.println(s.getName());
}        
}
        System.out.println("\n *********** ");
}     
}