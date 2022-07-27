package practice.Dates;
import java.time.LocalTime; 
import java.util.*;

public class DatesDemo {
    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();
        // create 2 dates
        Date date1 = new Date(2016, 11, 18);
        Date date2 = new Date(1997, 10, 27);

        // Use of after() to check date2 is after date1
        boolean a = date2.after(date1);
        System.out.println("Is date2 is after date1 : " + a);

        // Use of after() to check date2 is after date1
        a = date1.after(date2);
        System.out.println("Is date1 is after date2 : " + a);
        System.out.println("");

        // Use of clone() method
        Object date3 = date1.clone();
        System.out.println("Cloned date3 :" + date3.toString());
        System.out.println("");

        // Use of before() to check date2 is after date1
        boolean b = date2.before(date1);
        System.out.println("Is date2 is before date1 : " + a);

        Date mydate = new Date();

        // Displaying the current date and time
        System.out.println("System date : " + mydate.toString());

        // Is used to set time by milliseconds. Adds 15680
        // milliseconds to January 1, 1970 to get new time.
        mydate.setTime(15680);

        System.out.println("Time after setting:  " + mydate.toString());

        int d = mydate.hashCode();
        System.out.println("Amount (in ms) by which time" + " is shifted :  " + d);

        Date d1 = new Date(97, 10, 27);
        Date d2 = new Date(97, 6, 12);

        // Use of compareto() method
        int comparison = d1.compareTo(d2); // d1 > d2
        int comparison2 = d2.compareTo(d1); // d2 > d1
        int comparison3 = d1.compareTo(d1); // d1 = d1

        System.out.println("d1 > d2 : " + comparison);
        System.out.println("d1 < d2 : " + comparison2);
        System.out.println("d1 = d1 : " + comparison3);
        System.out.println("");

        // Use of equal() method
        boolean r1 = d1.equals(d2);
        System.out.println("Result of equal() r1 : " + r1);

        boolean r2 = d1.equals(d1);
        System.out.println("Result of equal() r2 : " + r2);
        System.out.println("");

        // Use of getTime() method
        long count1 = d1.getTime();
        long count2 = d1.getTime();
        System.out.println("Milliseconds of d1 : " + count1);
        System.out.println("Milliseconds of d2 : " + count2);
    }

}

/*
  output: Is date2 is after date1 : false Is date1 is after date2 : true
  
  Cloned date3 :Mon Dec 18 00:00:00 IST 3916
  
  Is date2 is before date1 : true
 
 System date : Tue Nov 01 02:37:18 IST 2016 Time after setting: Thu Jan 01
  05:30:15 IST 1970 Amount (in milliseconds) by which time is shifted : 15680
  
 d1 > d2 : 1
d1 < d2 : -1
d1 = d1 : 0

Result of equal() r1 : false
Result of equal() r2 : true

Milliseconds of d1 : 880569000000
Milliseconds of d2 : 880569000000
 */