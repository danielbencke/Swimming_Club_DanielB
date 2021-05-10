/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swimmers;
import NameGenerators.SwimmersGenerator;
import java.util.Random;
/**
 *
 * @author daniel
 * 
 */
    public class Swimmer {
                                                                 // properties
        public String name; 
        private  SwimmersGenerator SNG;
        protected int age; 
   
                                                                 //constructors
    public Swimmer(){
       
        this.SNG = new SwimmersGenerator(); // get a random swimmer name
        this.name = SNG.getRandomSwimmerName();
        this.age = generateAge();
}
    /**
     * 
     * @return swimmer name
     * 
     */
                                                                 //methods
    public String getSwimmer(){
        
        return name;
 }
    /**
     * 
     * @return swimmer age
     * 
     */
    public int generateAge() {
		
        Random r = new Random();
        int min = r.nextInt(82);
        return 18+min; // minimum age : 18
}
}