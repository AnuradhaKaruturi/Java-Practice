package practice.Arrays;

public class matrixMultiply {

    public static void main(String[] args) {
            
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};    
    int b[][]={{1,2,3},{4,5,6},{7,8,9}};    
    

int mul[][]=new int[3][3];  
    
//multiplying and printing multiplication of 2 matrices    
for(int i=0;i<3;i++)
{    
    for(int j=0;j<3;j++)
    {    
        mul[i][j]=0;      

        for(int k=0;k<3;k++)      
        {      
            mul[i][j]+=a[i][k]*b[k][j];      
        }  
        System.out.print(mul[i][j]+" ");   
    }
    System.out.println();   
}    

}
        
}
