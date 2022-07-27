package practice;

import java.util.Scanner;

public class EqualPartsOfString {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scannerObj.nextLine();
        System.out.println("Enter number of parts to divide the string");
        int num = scannerObj.nextInt();
        scannerObj.close();
        int strLength = str.length();
        int eachPartLength = strLength/num;
        String subPartsArr[] = new String[num];
        int temp = 0;
        if(strLength % num != 0 || str.equals(" ")){
            System.out.println("String canot be divide to equal parts");
        }
        else{
            for(int i =0;i<strLength;i = i+eachPartLength){
                subPartsArr[temp] = str.substring(i, i+eachPartLength);
                temp++;
            }

           for(int i = 0 ;i < subPartsArr.length;i++){
               System.out.println(subPartsArr[i]);

           }
        }
    }
    
}
