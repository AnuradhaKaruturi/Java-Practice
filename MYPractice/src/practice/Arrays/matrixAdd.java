package practice.Arrays;

public class matrixAdd {
    public static void main(String[] args) {
        //matrix addition

         
   int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
   int b[][]={{4,4,4},{5,5,5},{6,6,6}};   
   
   int add[][]=new int[3][3]; 

   for(int i=0;i<3;i++)
   {    
    for(int j=0;j<3;j++)
    {    
    add[i][j]= a[i][j] + b[i][j];
    }
}

for(int i=0;i<3;i++)
{    
    for(int j=0;j<3;j++)
    {    
        System.out.print(add[i][j]+" ");  
    }
    System.out.println();
}
 }
    
}
