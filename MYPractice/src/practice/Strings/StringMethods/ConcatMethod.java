package practice.Strings.StringMethods;

public class ConcatMethod {
    public static void main(String[] args) {
        String s1="java";    
        String s2 ="tech";
       String s3 = "simple";
// The string s1 does not get changed, even though it is invoking the method      
// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
    s1.concat("string");    
    System.out.println(s1);    
    s1=s1.concat("string");    
    System.out.println(s1);    

    //multiple Concat
    s3 = s3.concat("string").concat("done");
    System.out.println(s3);

    //spaces and special characters

    // Concatenating Space among strings  
    String str4 = s1.concat(" ").concat(s2).concat(" ").concat(s3);  
    System.out.println(str4);         

    // Concatenating Special Chars        
    String s5 = s1.concat("!!!");  
    System.out.println(s5);         
    String s6 = s1.concat("@").concat(s2);  
    System.out.println(s6);  

    //concat string at the beginning of another string 
    String s = "India".concat(s1); 
    System.out.println(s);
    }
}
