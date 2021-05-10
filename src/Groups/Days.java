/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Groups;

import java.util.Random;

/**
 *
 * @author daniel
 * 
 * Generator class to pick a random day for training
 */
    
    public enum Days {
    
    MONDAY, 
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    /**
     *     
     * 
     * 
     */
    public  static Days getRandomDay() {
       
        Random r = new Random();
        
         int dayNumber = r.nextInt(Days.values().length); 
        
         Days[] dayList = Days.values(); 
                
         return dayList[dayNumber];
         
}    
}
