package practice.Strings.REGEX;

import java.util.regex.Pattern;

public class CharacterClass {
    public static void main(String[] args) {
        //[abc]---->Find one character from the options between the brackets
        System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
        System.out.println();
       
        //[^abc]----->	Find one character NOT between the brackets
        System.out.println(Pattern.matches("[^asd]", "abcd"));//false   
        System.out.println(Pattern.matches("[^asd]", "c"));//  true
        System.out.println();

        //[0-9]	Find one character from the range 0 to 9
        System.out.println(Pattern.matches("[0-9]", "55"));//false  
        System.out.println(Pattern.matches("[0-9]", "5"));//  true
        System.out.println();

        //[a-zA-Z]----> a through z or A through Z, inclusive (range)
        System.out.println(Pattern.matches("[a-zA-Z]", "5"));//false  
        System.out.println(Pattern.matches("[a-zA-Z]", "d"));//true
        System.out.println(Pattern.matches("[a-zA-Z]", "ed"));//false
        System.out.println();

        //	[a-d[m-p]]----->a through d, or m through p: [a-dm-p] (union)
        System.out.println(Pattern.matches("[a-d[m-p]]", "no"));//false  
        System.out.println(Pattern.matches("[a-d[m-p]]", "n"));//true
        System.out.println(Pattern.matches("[a-d[m-p]]", "ef")); //false
        System.out.println();

      //  [a-z&&[def]]---->	d, e, or f (intersection)
        System.out.println(Pattern.matches("[a-z&&[def]]", "no"));//false  
        System.out.println(Pattern.matches("[a-z&&[def]]", "e"));//true
        System.out.println(Pattern.matches("[a-z&&[def]]", "ef")); //false
        System.out.println();

	 // [a-z&&[^bc]]------>	a through z, except for b and c: [ad-z] (subtraction)
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "b"));//false  
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "n"));//true
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "hg")); //false
        System.out.println();

     //[a-z&&[^m-p]]---->a through z, and not m through p: [a-lq-z](subtraction)
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "n"));//false  
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "b"));//true
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "ij")); //false

   
    }
    
}
