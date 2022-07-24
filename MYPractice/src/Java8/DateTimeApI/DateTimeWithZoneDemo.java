package Java8.DateTimeApI;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeWithZoneDemo {

    public static void main(String[] args) {

    // the current time
    LocalTime time = LocalTime.now();
    System.out.println("Current Time "+time);

    // will give us the current time and date
    LocalDateTime current = LocalDateTime.now();
    System.out.println("Current Date  and Time : "+current);
      
    // to get the current zone
    ZonedDateTime currentZone = ZonedDateTime.now();
    System.out.println("the current zone is "+currentZone.getZone());

    //zone of specific area
    ZonedDateTime indiaZone =currentZone.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
    System.out.println("India time zone is " + indiaZone);

    //with formatting
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    System.out.println("India time zone with formatter " + indiaZone.format(formatter));
                   
        
    }
    
}
