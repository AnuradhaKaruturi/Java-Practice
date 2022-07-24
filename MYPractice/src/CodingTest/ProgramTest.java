package CodingTest;

import java.util.Scanner;

import Validations.ValidationsDoc;

public class ProgramTest {

    public static void main(String[] args) {
        Scanner scannerObj  = new Scanner(System.in);
        int[] intArr = new int[10]; //array to store 10 integer elements
        for(int i = 0;i < intArr.length;i++){
         intArr[i] = ValidationsDoc.validateInt(scannerObj); //validation method from validationDoc class
        }
        scannerObj.close();
        int min = intArr[0], max = intArr[0]; //initializing min amd max values to first element in the array

        for(int i = 0; i < intArr.length;i++){

            if(min > intArr[i]){  //comparing each element of array with minimum if min is great assiging 
                min = intArr[i];
            }

            if(max < intArr[i]){
                max = intArr[i];
            }
        }
        System.out.println("minimun :"+min);
        System.out.println("maximum :"+max);



    }
    
}
