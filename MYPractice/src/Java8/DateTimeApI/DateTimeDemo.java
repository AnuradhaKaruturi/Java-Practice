package Java8.DateTimeApI;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTimeDemo {

    public static void main(String[] args) {
        
        // the current date
    LocalDate date = LocalDate.now();
    System.out.println("Current Date "+ date);
  
    // the current time
    LocalTime time = LocalTime.now();
    System.out.println("Current Time "+time);
      
  
    // will give us the current time and date
    LocalDateTime current = LocalDateTime.now();
    System.out.println("Current Date  and Time : "+current);

    //Date in a particular format
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM-dd  HH:mm");
    System.out.println("Date in a 'dd-MM-yyyy HH:mm:ss' format " +current.format(formatter));
    System.out.println("Date in a 'MM-dd  HH:mm' format " +current.format(formatter1));


    System.out.println("Month : "+current.getMonth()+" day : "+ current.getDayOfMonth()+" week : "+current.getDayOfWeek());
    System.out.println("day of year : " + current.getDayOfYear() + " month value  : "+ current.getMonthValue());

    // printing some specified date
    LocalDate date2 = LocalDate.of(1990,5,01);
    System.out.println("Labor day : "+date2);

    LocalDateTime specificDate =current.withDayOfMonth(26).withYear(2020);
    System.out.println("specific date with current time : "+specificDate);

    //period :  It deals with date based amount of time.
    LocalDate pastdate = LocalDate.of(1995, Month.FEBRUARY, 10);
    Period dayspassed = Period.between(pastdate, date);
    System.out.println("Number of days passed in your life : " + dayspassed);
    
    Period ofmonth = Period.ofMonths(5);
    System.out.println("Of months in period "+ofmonth);

    //Duration : It deals with time based amount of time.
    Duration timepassed = Duration.ofHours(8);
    LocalTime futuretime = time.plus(timepassed);
    LocalTime pasttime = time.minus(timepassed);

    Duration futuretimegap = Duration.between(time, futuretime);
    Duration pasttimegap = Duration.between( pasttime , time);

    System.out.println("Gap bewteen past time and current time : " +pasttimegap);
    System.out.println("Gap bewteen current time and future time : " +futuretimegap);

          //TemporalAdjuster
    LocalDate ld1 = LocalDate.of(2022, Month.MARCH, 22);
    LocalDate ld2 = ld1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
    LocalDate ld3 = ld1.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
    System.out.println("Current date : "+ld1);
    System.out.println("Next week : " + ld2);
    System.out.println("Previous week :" +ld3);

    LocalDate ld4 = ld1.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
    System.out.println("First Monday in month :" +ld4);


    //ChronoUnits
    //Get the current date
      LocalDate today = LocalDate.now();
      System.out.println("Current date: " + today);
		
      //add 1 week to the current date
      LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
      System.out.println("Next week: " + nextWeek);

      LocalDate secondnextWeek = today.plus(2, ChronoUnit.WEEKS);
      System.out.println("Second Next week: " + secondnextWeek);
		
      //add 1 month to the current date
      LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
      System.out.println("Next month: " + nextMonth);
		
      //add 1 year to the current date
      LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
      System.out.println("Next year: " + nextYear);
		
      //add 10 years to the current date
      LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
      System.out.println("Date after ten year: " + nextDecade);
    



}
    
}
