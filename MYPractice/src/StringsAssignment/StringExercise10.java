package StringsAssignment;

     import java.util.Random;
import java.util.Scanner;

public class StringExercise10 {
    public static void main(String[] args) {
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String str;
        System.out.println("Enter your choice : ");
        System.out.println("1.Random Alphabetic string "+"\n" + " 2.Random AlphaNumeric" +"\n" + " 3. RandomNumeric String");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.close();

        if(choice == 1){
             str = upperAlphabet + lowerAlphabet;
        }
          else if(choice == 2){
             str = upperAlphabet + lowerAlphabet + numbers;
          }
          else{
             str = numbers;
          }
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
    strbuildObj.append(randChar);     // append the character to string builder
        }  
    String randomString = strbuildObj.toString();
    System.out.println("Random String is: " + randomString); 
}

}
