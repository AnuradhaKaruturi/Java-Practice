package practice.Dates;
import java.time.LocalDate; 
import java.time.LocalTime; 
import java.time.LocalDateTime; 

public class LocalDates {

    public static void main(String[] args) {

        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

        LocalTime myObj1 = LocalTime.now(); //create a time object
        System.out.println(myObj1);//display the current time

        LocalDateTime myObj2 = LocalDateTime.now(); //create dateTime object
        System.out.println(myObj2); //display current date and Time 

    }
}
