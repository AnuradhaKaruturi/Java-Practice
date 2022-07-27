package StringsAssignment;

import java.util.Scanner;
public class StringExercise27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        sc.close();
        int n = str.length();
        int temp = 0;
        String strArr[] = new String[n*(n+1)/2];
        for(int i =0;i<n;i++){
            for(int j=i;j<n;j++){
                strArr[temp] = str.substring(i, j+1);
                temp++;
            }
        }
        for(int i = 0;i < strArr.length;i++ ){
        System.out.println(strArr[i]);
        }
    }
}