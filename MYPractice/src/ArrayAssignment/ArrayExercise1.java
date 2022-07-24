package ArrayAssignment;
public class ArrayExercise1 {

    public static void main(String[] args) {


    int [] arr1 = new int [] {1, 2, 3, 4, 5};     
      
    int n = arr1.length;
    int arr2[] = new int[n];    
  
    //without using copy method
    System.out.println("without using copy method");
   for (int i = 0; i < n; i++) {     
       arr2[i] = arr1[i];     
   }     
   
   System.out.println("Elements in arr1");
   for(int i : arr1){
       System.out.print(i+" ");
   }

   System.out.println();
   System.out.println("Elements in arr2");
   for(int i : arr2){
       System.out.print(i+" ");
   }

   System.out.println();
   //using copy method
   System.out.println("using copy method");
   int arr3[] = new int[n]; 
   System.arraycopy(arr1, 0, arr3, 0, 4);

      for(int i : arr3)
      {
        System.out.print(i+" ");
      } 
    
    
}

}
