package practice.Strings.StringMethods;

public class StringFormat {
    public static void main(String[] args) {
        
    // java string format() method returns the formatted string by given locale, format and arguments.
    String name="anu";  
    String sf1=String.format("name is %s",name);  
    String sf2=String.format("value is %f",20.4545);  
    String sf3=String.format("value is %32.6f",32.34);//returns 12 char fractional part filling with 0  
  
    System.out.println(sf1);  
    System.out.println(sf2);  
    System.out.println(sf3);  

        String str1 = String.format("%d", 101);          // Integer value  
        String str2 = String.format("%s", "Amar Singh"); // String value  
        String str3 = String.format("%f", 101.00);       // Float value  
        String str4 = String.format("%x", 101);          // Hexadecimal value  
        String str5 = String.format("%c", 'c');          // Char value  
        System.out.println(str1);  
        System.out.println(str2);  
        System.out.println(str3);  
        System.out.println(str4);  
        System.out.println(str5);  

        String strr1 = String.format("%d", 101);  
        String strr2 = String.format("|%10d|", 101);  // Specifying length of integer  
        String strr3 = String.format("|%-10d|", 101); // Left-justifying within the specified width  
        String strr4 = String.format("|% d|", 101);   
        String strr5 = String.format("|%010d|", 101); // Filling with zeroes  
        System.out.println(strr1);  
        System.out.println(strr2);  
        System.out.println(strr3);  
        System.out.println(strr4);  
        System.out.println(strr5); 
    
}
}
