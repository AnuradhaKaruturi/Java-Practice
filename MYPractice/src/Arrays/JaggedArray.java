package practice.Arrays;
public class JaggedArray {

    public static void main(String[] args)
    {
        //declare 2-D array
        int myarray[][] = new int[3][];

        //defining as a Jagged array
        myarray[0] = new int[2];
        myarray[1] = new int[3];
        myarray[2] = new int[4];

        int counter = 1;
        //initializing array
        for(int row=0; row < myarray.length; row++){
  
           for(int col=0; col < myarray[row].length; col++){
            myarray[row][col] = counter++;
           }
        }
  
        //printing array
        for(int row=0; row < myarray.length; row++){
           System.out.println();
           for(int col=0; col < myarray[row].length; col++){
              System.out.print(myarray[row][col] + " ");
           }
        }
        System.out.println("Class name of Array myarray is: "+myarray.getClass().getName());
   
    }
    
}
