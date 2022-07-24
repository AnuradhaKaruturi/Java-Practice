package ArrayAssignment;

import java.util.ArrayList;

public class ArrayExercise4 {

    public static void main(String[] args) {
        int[] intArr = new int[] {10,20,30,40,10,40,50,30,70,10,20};
        for(int n:intArr){
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("Duplicate elements in given array:");
        boolean isPresent = false;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<intArr.length;i++){
            for(int j = i+1;j<intArr.length;j++){
                if(intArr[i] == intArr[j]){
                    if(list.contains(intArr[i])){
                        break;
                    }
                    else{
                        list.add(intArr[i]);
                        isPresent = true;
                    }
                   
                }

            }
        }

        if(isPresent == true){
            System.out.println(list+" ");
        }
        else{
            System.out.println("No Duplicate elements");
        }
    }
    
}
