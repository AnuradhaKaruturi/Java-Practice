package practice.Strings.StringMethods;

public class InternIsEmptyJoin {

    public static void main(String[] args) {

//intern
        String s1 = "Java";  
        String s2 = s1.intern();  
        String s3 = new String("Java");  
        String s4 = s3.intern();          
        System.out.println(s1==s2); // True  
        System.out.println(s1==s3); // False  
        System.out.println(s1==s4); // True       
        System.out.println(s2==s3); // False  
        System.out.println(s2==s4); // True        
        System.out.println(s3==s4); // False     
        
        //string literal always invokes the intern() method, 
        //whether one mention the intern() method along with the string literal or not

        String s = "d".intern();  
        String p = "d"; // compiler treats it as String p = "d".intern();  
        System.out.println(s == p); // prints true  

//isEmpty

       //Java String class isEmpty() method checks if the input string is empty or not.

       String emp = "";
       String empt = "not empty";
       System.out.println(emp.isEmpty());   //true
       System.out.println(empt.isEmpty());  //false

//Java String class join() method returns a string joined with a given delimiter.

    String date = String.join("/","25","06","2018");    
    System.out.print(date);    
    String time = String.join(":", "12","10","10");  
    System.out.println(" "+time);  
    }
    
}
