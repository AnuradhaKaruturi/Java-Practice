package practice.Strings.StringBuffer;

public class capacity {
    public static void main(String[] args) {
        // create a StringBuilder object,
        // default capacity will be 16
        StringBuilder str = new StringBuilder();
 
        // get default capacity
        int capacity = str.capacity();
 
        System.out.println("Default Capacity of StringBuilder = "
                           + capacity);
 
        // add the String to StringBuilder Object
        str.append("Geek");
 
        // get capacity
        capacity = str.capacity();
 
        // print the result
        System.out.println("StringBuilder = " + str);
        System.out.println("Current Capacity of StringBuilder = "
                           + capacity);
         str.append("explainplaingsss");
         capacity = str.capacity();
         System.out.println("str is :"+str);
         System.out.println("Capacity :"+capacity);
                                                           

       str.append("Demo on ");
       capacity = str.capacity();
       System.out.println("str is :"+str);
       System.out.println("Capacity :"+capacity);
                    
       str.append(" Capacity");
       capacity = str.capacity();
       System.out.println("str is :"+str);
       System.out.println("Capacity :"+capacity);



    }
    
}
