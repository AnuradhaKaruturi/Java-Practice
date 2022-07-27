package StringsAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; 
public class StringExercise3 {
    public static void main(String[] args) throws ParseException {
        String strdate1 = "30/9/2021";
        String strdate2 = "30-sep-2021";
        String strdate3 = "Thu, sep 30 2021 23:37:50"; 
        
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
        SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy");  
        SimpleDateFormat formatter3=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");  

        Date date1=formatter1.parse(strdate1);  
        Date date2=formatter2.parse(strdate2);  
        Date date3=formatter3.parse(strdate3);  

        System.out.println(strdate1+"\t"+date1);  
        System.out.println(strdate2+"\t"+date2);  
        System.out.println(strdate3+"\t"+date3);  
    }
    
}
