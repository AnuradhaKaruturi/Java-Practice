package CodingInterviewPrograms;

import java.util.Scanner;

public class ReverseStringWithPreservingSpaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String str = sc.nextLine();
        sc.close();
        
        reverseWithPreservingSpaces(str);
    }

    public static void reverseWithPreservingSpaces(String str) {

        char[] inputArr = str.toCharArray();
        char[] resultArr = new char[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) 
        {
            if (inputArr[i] == ' ') 
            {
                resultArr[i] = ' ';
            }
        }
        int j = resultArr.length -1 ;

        for(int i = 0 ;i < inputArr.length;i++){
            if(inputArr[i] != ' '){

                if(resultArr[j] == ' '){
                    j--;
                }
                resultArr[j] = inputArr[i];
                j--;
            }
        }

        System.out.println("String After Reverse is :"+String.valueOf(resultArr));
        
    }
    
}
