package practice.Strings.StringBuilder;

import java.util.*;
import java.util.stream.Collectors;

public class StrConcatination {
    
    public static void main(String[] args) {

        //concatination using "+"
        String s="Anu"+" Radha";  
        System.out.println(s);//Anu Radha 

        String ss=20+30+"anu"+40;  
        System.out.println(ss);//50anu40

        String aaa = "anu";
        String bbb = "radha";
        System.out.println(aaa.concat(bbb));

        //String concatenation using StringBuilder class APPEND
       
        StringBuilder s1 = new StringBuilder("Hello");      
        StringBuilder s2 = new StringBuilder(" World"); 
        System.out.println(s1.append(s2));
        
        //using format method
        StringBuilder aa = new StringBuilder("This is");
        StringBuilder bb = new StringBuilder(" java");
        StringBuilder cc = new StringBuilder(" Program");
        System.out.printf("%s %s",aa,bb);
        System.out.println();
        System.out.printf("%s%s%s",aa,bb,cc);

        //string join()
        System.out.println();
        StringBuilder xx = new StringBuilder("Advanced");
        StringBuilder yy = new StringBuilder(" Technology");
        String s4 = String.join("",xx,yy); 
        String s5 = String.join("*",xx,yy); 
        System.out.println(s4);
        System.out.println(s5);

       //StringJoiner

       StringJoiner str = new StringJoiner("& ");   //StringeJoiner object  
        str.add("simple");    //String 1   
        str.add("method");    //String 2  
        System.out.println(str.toString());

        //Collectors.join()
        List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array  
        String str1 = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation  
        System.out.println(str1.toString());  //Displays result  
    }
}
