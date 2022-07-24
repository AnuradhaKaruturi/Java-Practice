package CodingInterviewPrograms;

import java.util.Scanner;

public class PercentageOfAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String str = validate(sc);
        sc.close();
        characterCount(str);
      
    }

    static void characterCount(String str)
    {
        int upper = 0, lower = 0,dig = 0,specChar = 0;
        for(int i = 0;i<str.length();i++){

            if(str.charAt(i)>='A'&& str.charAt(i)<='Z'){
              upper++;
              }
              else if((str.charAt(i)>='a'&& str.charAt(i)<='z'))
              {
             lower++;
              }
              else if(str.charAt(i) >= 0 && str.charAt(i) <= 9 ){
               dig++;
              }
              else {
                  specChar++;
              }
        }

        float upperPer=(upper*100)/str.length();
        float lowerPer=(lower*100)/str.length();
        float digPer=(dig*100)/str.length();
        float spPer=(specChar*100)/str.length();
        System.out.println("Length of the String is :"+str.length());
        System.out.println("Percentage of UpperCase is :"+upperPer);
        System.out.println("Percentage of  LowerCase is:"+lowerPer);
        System.out.println("Percentage of digits is :"+digPer);
        System.out.println("Percentage of Special Characters is:"+spPer);
        
    }

    static String validate(Scanner scannerObj){ //validate method definition
        String st;
        do{
            System.out.println("Enter String:");
            while(!scannerObj.hasNext("[A-Za-z]*")){
                System.out.println("This is not a String.Please enter valid String:");
                scannerObj.next();
            }
            st = scannerObj.nextLine();
        }while(st.equals(""));
      return st;
    }
}


