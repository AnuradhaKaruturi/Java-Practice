package practice.Strings.StringMethods;

public class ContainsAndEndsWith {
    public static void main(String[] args) {
        //contains() method searches the sequence of characters in this string.
        // It returns true if the sequence of char values is found in this string
        // otherwise returns false.

       //Contains()
        String name="my name is";  
        System.out.println(name.contains("name"));  //true
        System.out.println(name.contains("xyz"));  //false 
        System.out.println(name.contains("Name")); //false case sensitive

        //endsWith()  returns boolean values
        String str ="method is dependent on the startsWith";
        System.out.println(str.endsWith("h"));  //true
        System.out.println(str.endsWith("With"));  //true
        System.out.println(str.endsWith("startswith")); //false , case sensitive

        //empty string
        //any string in Java ends with an empty string ("").
        String str1 = "Ladies and Gentlemen";  //String str1 = "Ladies and Gentlemen" + "";   

        System.out.println(str1.endsWith(""));   // prints true  
        System.out.println(str1.endsWith(" "));  // prints false as there is no white space after the string
     
        // endsWith() method raises the NullPointerException
        // if one passes null in the parameter of the method
    }
}