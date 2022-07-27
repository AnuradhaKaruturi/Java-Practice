package StringsAssignment;

import java.util.Random;


public class StringExercise11 {
    public static void main(String[] args) {
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String  str = upperAlphabet + lowerAlphabet + numbers;
        randomStringMethod(str);   
      }

    public static  void randomStringMethod(String str){
    StringBuilder strbuildObj = new StringBuilder();    // create random string builder
    Random randomObj = new Random();        // create an object of Random class
    int length = 10;              //  // specify length of random string
    for(int i = 0 ; i<length;i++)
        {
        int index = randomObj.nextInt(str.length());   // generate random index number
        char randChar = str.charAt(index); // get character specified by index from the string
        strbuildObj.append(randChar); 
        }   // append the character to string builder
        String randomString = strbuildObj.toString();
        System.out.println("Random String is: " + randomString);
        
}
}
       
