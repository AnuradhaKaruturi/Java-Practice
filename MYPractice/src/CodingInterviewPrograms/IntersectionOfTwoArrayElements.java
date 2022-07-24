package CodingInterviewPrograms;


import java.util.Scanner;

public class IntersectionOfTwoArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[6];
        int arr2[] = new int[6];
        System.out.println("Enter  6 elements for Array 1");
        for(int i = 0;i< 6;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter 6  elements for Array 2");
        for(int i = 0;i< 6;i++){
            arr2[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Intersection of Two Arrays :");
        for(int i = 0;i<6;i++){
            for(int j = 0;j< 6;j++){
               if(arr1[i] == arr2[j]){
                   System.out.println(arr2[j]);
               }
            }
        }
    }
    
}

