package practice.Arrays;

public class ArrayClone {
    public static void main(String[] args) {
        
        int[] arrMain = {2,4,6,8,10,12};

        for(int i:arrMain){
            System.out.print(i+ " ");
        }

        int[] arrClone = arrMain.clone(); //clone method

        System.out.println();
        for(int i:arrClone){
            System.out.print(i+ " ");
        }
        System.out.println( );
        System.out.println("Are both equal with equals?");  
        System.out.println(arrMain==arrClone); 

        System.out.println("Are both equal with == ?");  
        System.out.println(arrMain==arrClone); 

        
    }
    
}
