package practice;

class Output 
{
 
        public static int sum(int ...x)
        {
             System.out.println(x[3]);
             return  x[3]; 
        }
       public static void main(String args[]) 
        {    
             sum(10);
             sum(10,20);
             sum(10,20,30);
             sum(10,20,30,40);

        } 
}
