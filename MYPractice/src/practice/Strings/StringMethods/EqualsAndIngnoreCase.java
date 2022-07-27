package practice.Strings.StringMethods;

public class EqualsAndIngnoreCase {

    public static void main(String[] args) {

        //Equals()
        String s1="javatpoint";  
        String s2="javatpoint";  
        String s3="JAVATPOINT";  
        String s4="python";  
        System.out.println(s1.equals(s2));//true because content and case is same  
        System.out.println(s1.equals(s3));//false because case is not same  
        System.out.println(s1.equals(s4));//false because content is not same  

        //passing reference

        String str = new String("python");
        System.out.println(s4.equals(str)); //true

        //equalsIgnoreCase
        System.out.println(s1.equals(s3));   //false
        System.out.println(s1.equalsIgnoreCase(s3));   //true


    }
    
}
