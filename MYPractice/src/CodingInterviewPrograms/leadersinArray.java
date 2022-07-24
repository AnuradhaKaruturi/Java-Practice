package CodingInterviewPrograms;

import java.util.Scanner;

public class leadersinArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter length of the array");
        int len  = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter array elements :");
        for(int i = 0 ;i < len;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        printLeaders(arr, len); 
}

    public static void printLeaders(int[] arr, int n) {
    int max =  arr[n-1];
    int i;
 
  System.out.printf("%d ", max);
      
    for(i = n-2; i >= 0; i--)
    {
        if(max < arr[i])
        {
            System.out.printf("%d ", arr[i]);
           max = arr[i];
        }
    }   

}
}