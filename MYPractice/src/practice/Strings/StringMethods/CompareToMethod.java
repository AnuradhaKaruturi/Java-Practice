package practice.Strings.StringMethods;

//CompareTo returns integer value
public class CompareToMethod {
    public static void main(String[] args) {
        
    String s1="hello";  
    String s2="hello";  
    String s3="heslo";  
    String s4="heclo";  
    String s5="haz";
    String s6 ="";
    String s7 = "helloWorld";
    String s8 = "HELLO";

//compare two strings with same value
System.out.println(s1.compareTo(s2));  //0 because both are equal  

//Compare str with same length different values
System.out.println(s1.compareTo(s3));  //-7 (hello - heslo) l is less than s
System.out.println(s1.compareTo(s4));  //9  (hello - heclo) l is greater than c

//Compare with Empty String
System.out.println(s6.compareTo(s1));  //-5  //first string is empty so length is -5
System.out.println(s1.compareTo(s6));  //5   //second string empty so returns length

//Compare different length Strings
System.out.println(s1.compareTo(s5)); //4
System.out.println(s5.compareTo(s1)); //-4
System.out.println(s7.compareTo(s1)); //5
System.out.println(s1.compareTo(s7)); //-5

//CompareCaseIgnore
System.out.println(s1.compareTo(s8)); //32
System.out.println(s1.compareToIgnoreCase(s8));  //0
}
}