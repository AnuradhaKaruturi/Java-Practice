package practice.Strings.StringMethods;

public class SubStringToCase {
    public static void main(String[] args) {
    
        //substring
        String str ="UnImaginatively";
        System.out.println(str.substring(5));
        System.out.println(str.substring(2,4));

    //charArray
       String s1 = "Java lessons";  
        char[] ch = s1.toCharArray();  
        int len = ch.length;  
        System.out.println("Char Array length: " + len);  
        System.out.println("Char Array elements: ");  
        for (int i = 0; i < len; i++) {  
            System.out.println(ch[i]);  
        }  
System.out.println(str);
    //toLowerCase

  String lower = str.toLowerCase();
  System.out.println(lower);

  //toUpperCase

  String upper = str.toUpperCase();
  System.out.println(upper);
    }
}
