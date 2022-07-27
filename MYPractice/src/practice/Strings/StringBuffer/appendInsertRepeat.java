package practice.Strings.StringBuffer;

public class appendInsertRepeat {
    public static void main(String[] args) {

        //Constructors of StringBuffer Class

//StringBuffer()--->	It creates an empty String buffer with the initial capacity of 16.
//StringBuffer(String str)-->	It creates a String buffer with the specified string..
//StringBuffer(int capacity)--->	It creates an empty String buffer with the specified capacity as length
     

//creation 
     StringBuffer s = new StringBuffer();
     StringBuffer str = new StringBuffer("Java StringBuffer is ");
     StringBuffer str1 = new StringBuffer("Advanced Technology ");
 

        //append
        System.out.println(str);
        str.append("thread-safe and");
        System.out.println(str);

        //insert
        str.insert(18,"class ");
        System.out.println(str);

       //replace
       str.replace(str.length()-3, str.length(),"ordered");
       System.out.println(str);

       //reverse
       s.append("substring ofxyz");
       System.out.println(s);
       s.reverse();
       System.out.println(s);

       //delete
       System.out.println(str1);
       str1.delete(10, 12);
       System.out.println(str1);

        //charAt()
       char s1 = str1.charAt(5);
        System.out.println(s1);
 
     
        
    }
    
}
