package practice.Strings.REGEX;

import java.util.regex.*;

public class regexCreation {
    public static void main(String[] args) {
        //1st way
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");
        boolean b = m.matches(); 
        System.out.println(b);

        //2nd way  
       boolean b2 = Pattern.compile(".s").matcher("as").matches();  
       System.out.println(b2);

       //3rd way  
      boolean b3 = Pattern.matches(".s", "as");  
      System.out.println(b3);
    }
    
}
