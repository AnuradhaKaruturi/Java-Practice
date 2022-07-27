package practice.Strings.REGEX;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String args[]){  
        //X?	X occurs once or not at all
        System.out.println("? quantifier ....");  
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  
         System.out.println();

        //X+	X occurs once or more times
        System.out.println("+ quantifier ....");  
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  
        System.out.println();

        //X*	X occurs zero or more times
        System.out.println("* quantifier ....");  
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)  
        System.out.println(); 

        //X{n}	X occurs n times only
        System.out.println("X{n} quantifier ....");  
        System.out.println(Pattern.matches("[amn]{3}","mmm")); //true
        System.out.println(); 

        //X{n,}	X occurs n or more times
        System.out.println("X{n,} quantifier ....");  
        System.out.println(Pattern.matches("[amn]{3,}", "ammmmna"));//true
        System.out.println(); 

        //X{y,z}	X occurs at least y times but less than z times
        System.out.println("X{y,z} quantifier ....");  
        System.out.println(Pattern.matches("[amn]{2,5}", "mmmm"));   //true
        System.out.println(); 
    }
}