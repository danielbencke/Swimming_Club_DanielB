package NameGenerators;

import java.util.Random;
/**
 * 
 * @author daniel
 * return a random name for swimmers
 */
public class SwimmersGenerator {

	protected String[] firstpart = {"A" , "B" , "C", "D", "E", "F", "G", "H", "I", "J", "L", "M" , "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Z"};
	protected String[] secondpart = {"1" , "2" , "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" , "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
        
        public String getRandomSwimmerName() {
		
		Random r = new Random();
	
		String fname = this.firstpart[r.nextInt(firstpart.length)];
		String sname = this.secondpart[r.nextInt(secondpart.length)];
		
		return ( fname + sname);
}
}
