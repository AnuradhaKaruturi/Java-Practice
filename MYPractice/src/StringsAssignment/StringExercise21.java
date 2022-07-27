package StringsAssignment;

import java.util.Arrays;
import java.util.Scanner;
public class StringExercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = validate(sc);
        System.out.println("Enter a String");
        String s2 = validate(sc);
        System.out.println("Enter a substring that contains both string1 and sting2:");
        String s3 = validate(sc);
        sc.close();
        System.out.println("entered strings and substring  is :"+s1+"   "+s2+"\n"+s3);
        isValidShuffleString(s1,s2,s3); //// call the method to check if result string is
        // shuffle of the string first and second
    }
    
    public static void isValidShuffleString(String s1,String s2,String s3){

        boolean len = checkLength(s1, s2, s3);
        boolean sort = shuffleCheck(s1,s2,s3);
        if(len == true && sort == true){
            System.out.println(s3 + " is a valid shuffle of " + s1 + " and " + s2);
        }
        else {
          System.out.println(s3 + " is not a valid shuffle of " + s1 + " and " + s2);
        }   

    }

    // this method compares each character of the result with 
      // individual characters of the first and second string

    public static boolean shuffleCheck(String s1,String s2,String s3){
        // sort each string to make comparison easier
        s1 = sortString(s1);
        s2 = sortString(s2);
        s3 = sortString(s3);
        // variables to track each character of 3 strings
        int i = 0, j = 0, k = 0;
    
        // iterate through all characters of result
        while (k != s3.length()) {
           // check if first character of result matches
          // with first character of first string
          if (i < s1.length() && s1.charAt(i) == s3.charAt(k))
          i++;
  
        // check if first character of result matches
        // with the first character of second string
        else if (j < s2.length() && s2.charAt(j) == s3.charAt(k))
          j++;
  
        // if the character doesn't match
        else {
          return false;
        }
  
        // access next character of result
        k++;
      }
      if(i < s1.length() || j < s2.length()) {
        return false;
      }
  
      return true;
    }

    // this method converts the string to char array 
      // sorts the char array
      // convert the char array to string and return it
    
    public static String sortString(String str) {
      
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
    
        // convert char array back to string
        str = String.valueOf(charArray);
    
        return str;
      }

       // length of result string should be equal to sum of two strings
    public static boolean checkLength(String s1, String s2, String s3){

        if (s1.length() + s2.length() != s3.length()) {
            return false;
          }
          else {
            return true;
          }
    }

    static String validate(Scanner scannerObj){ //validate method definition
        String st;
        do{
            while(!scannerObj.hasNext("[A-Za-z]*")){
                System.out.println("This is not a String.Please enter valid String:");
                scannerObj.next();
            }
            st = scannerObj.nextLine();
        }while(st.equals(""));
      return st;
    }

}
    
/* //String 1
        String s1 = "Pre-fix ";
        //String 2
        String s2 = "Post-fix";
        //String 3
        String s3 = "Pre-fix Post-fix";
        //if lengths are equal and shuffle method returns boolean value and if both are true
        if (((s1.length() + s2.length()) == s3.length()) && (shuffle(s1, s2, s3))) {
            System.out.println("This is a Valid Shuffle");
        } else {
            System.out.println("This is not a Valid Shuffle");
        }
    }
        //method to check whether s1+s2=s3
    static boolean shuffle(String s1, String s2, String s3) {
        //Storing concatenated string in temp
        String temp = s1 + s2;
        //Converting the temp to char array
        char[] temp_Arr = temp.toCharArray();
        //Sorting the array
        Arrays.sort(temp_Arr);
        //the given s3 String->Now a char array
        char[] s3_Arr = s3.toCharArray();
        //Sorting s3 array
        Arrays.sort(s3_Arr);
        //returns boolean value if condition satisfies
        return Arrays.toString(temp_Arr).equals(Arrays.toString(s3_Arr));
    }*/