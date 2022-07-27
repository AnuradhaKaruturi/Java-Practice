package Anuradha.Strings;

import java.util.Scanner;

//Replace characters to lowercase and uppercase vice-versa
public class Program31 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        scanner.close();
        //checks in between lowercase characters
        String pattern="[a-z]+";
        //checks in between uppercase characters
        String pattern2="[A-Z]+";
        //String pattern3="^[a-z][A-Z]+";
        //conversion character are later stored here
        String result="";
        //splits every character since ""
        String[] strings=string.split("");
        System.out.println("Entered String is: "+string);
        //looping through strings array
        for (int i=0;i<strings.length;i++){
            //taking an empty string
            String s="";
            //if charAt(0,1,2....) matches pattern(a-z)
            if(strings[i].matches(pattern)){
                //Convert strings[i] to upper case and that character is stored in s
               s=strings[i].toUpperCase();
            }
            //if charAt(0,1,2....) matches pattern(A-Z)
            else if(strings[i].matches(pattern2)){
                //Convert strings[i] to lower case and that character is stored in s
                s=strings[i].toLowerCase();
            }
            //this is for spaces and special characters
            else {
                s=strings[i];
            }
            //Now whatever strings[i] in is concatenated to the result string
            result+=s;
        }
        //Now printing the concatenated string
        System.out.println("Converted String is: "+result);
    }
}
/*
Output:
Enter a String:
MeTHoDs uSEd HeRE ArE sPlIT aNd MatcHES
Entered String is: MeTHoDs uSEd HeRE ArE sPlIT aNd MatcHES
Converted String is: mEthOdS UseD hEre aRe SpLit AnD mATChes
Enter a String:
ThiS iS JaVA.
Entered String is: ThiS iS JaVA.
Converted String is: tHIs Is jAva.
 */
