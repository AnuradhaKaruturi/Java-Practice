package practice.Strings.StringMethods;

public class CharAtLengthReplace {
    public static void main(String[] args) {
        
        String str = "Advanced java Technologies with java tech";
        String re = "Banana";

        // String charAt() 
        char ch = str.charAt(10);
        System.out.println("Character at position 10 in"+str+" is: "+ch);

 // length() Method
        int len = str.length();
        System.out.println("The length of string"+str+"is: "+len);
         //counting number of "a" in str1.
        int count = 0;
        for(int i = 0;i < len - 1;i++){   
            if(str.charAt(i)== 'a'){
                count++;
            }
        }
        System.out.println("Count of 'a' in String "+str+" is "+count);

//replace
   String replaced = re.replace('a','e');
   System.out.println(replaced);

   String strrep = str.replace("java","cpp");
   System.out.println(strrep);
//replaceAll
   String strrep1 = str.replaceAll("java","cpp");
   System.out.println(strrep1);
//replaceFirst
   String strrep2 = str.replaceFirst("java","cpp");
   System.out.println(strrep2);
//removing whiteSpaces
    String replaceString=str.replaceAll("\\s","");  
    System.out.println(replaceString);  
    
//inserting whitespaces
     String name ="Techie";
    String strr = name.replaceAll("", " ");  
    System.out.println(strr); 
    }  
}
