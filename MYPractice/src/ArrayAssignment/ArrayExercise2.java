
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise2 {

    public static void main(String[] args) {
        int[] intArr = new int[10];
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter 10 integer values :");
        for(int i = 0;i< intArr.length;i++){
            intArr[i]=sc.nextInt();
        }

        sc.close();
        System.out.println("Entered values are");
        for(int n:intArr){
            System.out.print(n+" ");
        }   

        int freq[] = new int[intArr.length];
        int visited= -1;

        for(int i = 0 ; i< intArr.length;i++){
            int count = 1;
              for(int j = i+1;j<intArr.length;j++){
                  if(intArr[i] == intArr[j])
                  {
                      count++;
                      freq[j] = visited;
                  }
              }

              if(freq[i] != visited)
              {
                  freq[i] = count;
              }
        }

        System.out.println();
        System.out.println("Element" + "  :  " +"Frequency");
        for(int i = 0; i < freq.length; i++){  
            if(freq[i] != visited)  
                System.out.println(intArr[i] + "        :          " +freq[i]);  
        }  
        
    }
    
    
}
