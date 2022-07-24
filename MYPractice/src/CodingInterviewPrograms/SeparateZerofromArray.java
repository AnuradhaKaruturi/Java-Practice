package CodingInterviewPrograms;

import java.util.Scanner;
public class SeparateZerofromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter length of the array");
        int len  = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter array elements :");
        for(int i = 0 ;i < len;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("choose whether zero's should be present at start of the array or end of the array");
        System.out.println("Enter  1 for Start or  2 for End");
        int pos = sc.nextInt();
        sc.close();
        if(pos == 1){
            zeroAtStart(arr);
        }
        else{
            zeroAtEnd(arr);
        }

    }
    
  public static void zeroAtStart(int[] arr) {

    int index = arr.length - 1;
    for(int i = arr.length - 1;i > 0;i--){
        if(arr[i] != 0){
            arr[index] = arr[i];
            index--;
        }
    }

    while(index >= 0){
        arr[index] = 0;
        index--;
    }

    System.out.println("Array for separating Zero's");

    for(int x: arr){
        System.out.print(x+" ");
    }
   
     
 }

  public static void  zeroAtEnd(int[] arr) {

    int index = 0;
    for(int i = 0;i< arr.length;i++){
        if(arr[i] != 0){
            arr[index] = arr[i];
            index++;
        }
    }

    while(index < arr.length){
        arr[index] = 0;
        index++;
    }

    System.out.println("Array for separating Zero's");

    for(int x: arr){
        System.out.print(x+" ");
    }
}
   
     
}

