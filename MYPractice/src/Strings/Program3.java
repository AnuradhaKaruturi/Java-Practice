package Anuradha.Strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//Convert a String to Date
public class Program3 {
    public static void main(String[] args) throws ParseException {
        //Taking a date as string
        String string="29 09 2021";
        //Date class & object
        //SimpleDateFormat class constructor to pass the pattern as the given String
        //If pattern has a match, Its parsing string to date
        Date date=new SimpleDateFormat("dd MM yyyy").parse(string);
        //Prints date
        System.out.println("Date: "+date);
    }
}
