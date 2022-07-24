package practice.Dates;

import java.util.Date;

public class DatesDelayDemo {
    
        public static void main(String[] args) throws Exception
        {
        Date currentTime = new Date();           // Get the current date and time
        Thread.sleep(3000);                      // Wait 3 seconds (3000milliseconds)
        Date newTime = new Date();               // Get the new current time
        
        long msDelay = newTime.getTime() - currentTime.getTime(); // Calculate the difference
        System.out.println("Time difference is: " + msDelay + " in ms");
        }   
    
}
