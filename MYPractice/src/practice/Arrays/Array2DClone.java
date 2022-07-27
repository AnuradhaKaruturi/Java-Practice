package practice.Arrays;

public class Array2DClone {
    public static void main(String[] args) {
        
        int[][] arr2DMain = {{2,4,6},{8,10,12},{14,16,18}};

        for(int[] i:arr2DMain){
            for(int j : i){
            System.out.print(j+ " ");
        }
    }

        int[][] arr2DClone = arr2DMain.clone();

        System.out.println();
        for(int[] i:arr2DClone){
            for(int j :i){
            System.out.print(j+ " ");
        }
    }
        System.out.println( );
        System.out.println("Are both equal with equals?");  
        System.out.println(arr2DMain==arr2DClone); 

        System.out.println("Are both equal with == ?");  
        System.out.println(arr2DMain==arr2DClone); 

        

    }
    
}
