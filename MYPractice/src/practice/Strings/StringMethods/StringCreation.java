package practice.Strings.StringMethods;

public class StringCreation {

    public static void main(String[] args) {

       //String literal
        String s1 = "Technology";
        String s2 = "Technology";  //It doesn't create a new instance 


        char strChar[] = {'a','e','i','o','u'};
        char strch[] = {'b','a','s','i','c','s'};

        String strstrch = new String(strch);
        String strnew = new String("Advanced");  //creates two objects and one reference variable 
        System.out.println(s1+" "+s2);
        System.out.println(strChar);
        System.out.println(strstrch+" "+strnew);
    }
    
}
