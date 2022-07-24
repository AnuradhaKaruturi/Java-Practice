package practice.Arrays;

public class AnonymousArray {

    public static void main(String[] args)
    {
          // anonymous array
          //pasing anonymous array to method
          sum(new int[]{ 1, 2, 3 });

          //return anonymous array from method
          int[] num = getArray();
          System.out.println(num);
          for(int i : num){
              System.out.println(i);
          }

    }
    public static void sum(int[] a)
    {
        int sum = 0;
  
        // using for-each loop
        for (int i : a) 
            sum += i;
          
        System.out.println("The sum is:" + sum);
    }

    public static int[] getArray(){
        return new int[]{1,2,3,4,5};
    }
    
}
