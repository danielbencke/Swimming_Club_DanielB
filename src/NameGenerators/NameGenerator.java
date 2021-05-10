package NameGenerators;
import java.util.Random;

/**
 * 
 * @author daniel
 * return a random name for staffs and coachs
 */
public class NameGenerator {

	protected String[] firstNames = {"Joao", "Tom", "Renan", "Pavel", "Priscilla", "Claudia", "Daniel", "Gabriel", "Ronan", "Shane", "Robson", "Maria", "Roberto", "Gael", "Andrw", "Ricardo", "Cleiton"};
	protected String[] surnames = {"Murphy", "Silva", "Smith", "Jones", "Carvalho", "Ernst", "Correa", "Camargo", "Silveira", "Forster", "Bencke", "Fansin", "Avenar", "Kley", "Palant", "Kiev", "Werz"};
	
	public NameGenerator() {
}	
	public String getRandomName() {

            Random r = new Random();

            String fname = this.firstNames[r.nextInt(firstNames.length)];
            String sname = this.surnames[r.nextInt(surnames.length)];
		
            return ( fname + " " + sname);
}
}
