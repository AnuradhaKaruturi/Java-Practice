package practice.Strings.StringMethods;

public class SplitTrimValueOf {
    public static void main(String[] args) {
        String s1="java string split method";  
        String[] words=s1.split("\\s");//splits the string based on whitespace  
        //using java foreach loop to print elements of string array  
        for(String w:words){  
        System.out.println(w);  
        }
        //we are passing split limit as a second argument to this function.
        // This limits the number of splitted strings
        String s2 = "splitingthemethodofthis";
        String[] arr = s2.split("t", 0);  
        for (String wx : arr) {  
            System.out.println(wx);  
        }  
        System.out.println("Split array length: "+arr.length);  

        String ss = "makinginstrumentinicecofee";
        String[] arr1 = ss.split("i", 2);  
        for (String wx : arr1) {  
            System.out.println(wx);  
        }  
        System.out.println("Split array length: "+arr1.length);  
    //stratsWith
    
    String state="There are diff states in our country";    
    System.out.println(state.startsWith("The"));  // true  
    System.out.println(state.startsWith("There are"));   // true  
    System.out.println(state.startsWith("there"));  // false as 'j' and 'J' are different  
    
    // no offset mentioned; hence, offset is 0 in this case.  
    System.out.println(state.startsWith("T")); // True    
  
      // no offset mentioned; hence, offset is 0 in this case.  
     System.out.println(state.startsWith("e")); // False   
   // offset is 1  
   System.out.println(state.startsWith("e",2)); // True  
   
   //a string in Java always starts with the empty string.

//trim()

    String st ="  hello java string   ";    
    System.out.println(st.length());    
    System.out.println(st); //Without trim()    
    String tr = st.trim();    
    System.out.println(tr.length());    
    System.out.println(tr); //With trim() 

//ValueOf()

    int value=30;  
    String val =String.valueOf(value);  
    System.out.println(val+10);//concatenating string with 10  
    
    boolean b1=true;  
        byte b2=11;    
        short sh = 12;  
        int i = 13;  
        long l = 14L;  
        float f = 15.5f;  
        double d = 16.5d;  
        char chr[]={'j','a','v','a'};  
        SplitTrimValueOf obj=new SplitTrimValueOf();  
        String s11 = String.valueOf(b1);    
        String s22 = String.valueOf(b2);    
        String s3 = String.valueOf(sh);    
        String s4 = String.valueOf(i);    
        String s5 = String.valueOf(l);    
        String s6 = String.valueOf(f);    
        String s7 = String.valueOf(d);    
        String s8 = String.valueOf(chr);    
        String s9 = String.valueOf(obj);    
        System.out.println(s11);  
        System.out.println(s22);  
        System.out.println(s3);  
        System.out.println(s4);  
        System.out.println(s5);  
        System.out.println(s6);  
        System.out.println(s7);  
        System.out.println(s8);  
        System.out.println(s9);  
}
    
}
