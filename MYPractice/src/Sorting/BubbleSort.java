package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {60 , 2, -5, 0 , 12, 88 , 55 , 20};
        print(arr);
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        int temp;
        for(int i = 0 ; i < arr.length - 1;i++){
            for(int j = 0; j < arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\nAfter bubble sort : ");
        print(arr);
    }

    private static void print(int[] arr) {
        for(int i = 0; i < arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}


/*
Algorithm

bubbleSort(array)
  for i <- 1 to indexOfLastUnsortedElement-1
    if leftElement > rightElement
      swap leftElement and rightElement
end bubbleSort

*/