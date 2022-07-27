package practice.Strings.StringMethods;

public class getCharAndIndexOf {
    public static void main(String[] args) {
        // Java String class getBytes() method does the encoding of string into the 
        //sequence of bytes and keeps it in an array of bytes.  RETURNS  Sequence of bytes
      
        String s1 = "ABCDEFG";  
        byte[] barr = s1.getBytes();  
        for(int i=0;i<barr.length;i++){  
            System.out.println(barr[i]);  
        }  
        // Getting string back   
        String s2 = new String(barr);  
        System.out.println(s2);  

        // String getChars()
        //getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)  
        String str = new String("hello javatpoint how r u");  
        char[] ch = new char[10];  
            try{  
                str.getChars(6, 16, ch, 0);  
                System.out.println(ch);  
            }catch(Exception ex){System.out.println(ex);}  

 //indexOf()

            String ss1="this is index of method";  
        //passing substring  
         int index1=ss1.indexOf("is");//returns the index of is substring  
         int index2=ss1.indexOf("index");//returns the index of index substring  
         System.out.println(index1+"  "+index2);//2 8  
  
        //passing substring with from index  
        int index3=ss1.indexOf("is",4);//returns the index of is substring after 4th index  
        System.out.println(index3);//5 i.e. the index of another is  
  
        //passing char value  
        int index4=ss1.indexOf('s');//returns the index of s char value  
        System.out.println(index4);//3  

        // Passing substring and index  
        int index = ss1.indexOf("method", 10); //Returns the index of this substring  
        System.out.println("index of substring "+index);  
        index = ss1.indexOf("method", 20); // It returns -1 if substring does not found  
        System.out.println("index of substring "+index); 

        // Passing char and index from  
        int ind = s1.indexOf('e', 12); //Returns the index of this char  
        System.out.println("index of char "+ind); 
    

//lastIndexOf()

//Java String class lastIndexOf() method returns the last index of the given character value 
//or substring. If it is not found, it returns -1. The index counter starts from zero.

String strex ="this is from simple project from java ";//there are 2 's' characters in this sentence  
int indexs =strex.lastIndexOf('s');//returns last index of 's' char value  
System.out.println(indexs);  //13

int strindex = strex.lastIndexOf("from");
System.out.println(strindex);  //28

int indexing = strex.lastIndexOf('s',10);  
System.out.println(indexing);   

int strindex1 = strex.lastIndexOf("from",20);  
System.out.println(strindex1);


    
}
}