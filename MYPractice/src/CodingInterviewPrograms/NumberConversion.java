package CodingInterviewPrograms;

import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter integer  number");
        int num = sc.nextInt();
        sc.close();
        int temp = num;
        String binary = "";
        String octal = "";
        String hexa="";
        int rem = 0;
        while(temp > 0){
            rem = temp % 2;
            binary = rem + binary;
            temp /= 2;
        }
        System.out.println("Binary form of "+num+" is "+binary);
        temp =num;
        rem = 0;
        while(temp > 0){
            rem = temp % 8;
            octal = rem + octal;
            temp /= 8;
        }
        System.out.println("Octal form of "+num+" is "+octal);
        
        char hexaDecimals[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        temp =num;
        rem = 0;
        while(temp > 0){
            rem = temp % 16;
            hexa = hexaDecimals[rem] + hexa;
            temp /= 16;
        }
        System.out.println("HexaDecimal form of "+num+" is "+hexa);
    }
    
}
