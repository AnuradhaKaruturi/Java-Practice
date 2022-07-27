package practice;
public class IncrementOperator {
        public static void main(String[] args) {
     
          int x = 10;
        
          System.out.println("x: "+ x);
     
          x = 10;
          x = x++;
          System.out.println("x: "+ x); // why is it overridding?
//-----------------------------
      int y = 10;    //   STEP 1 : Initial value of y = 10;
        y = y++;   /* STEP 2 : The value of 'y'' is post incremented and assigned again to 'y''.
                     The variable 'y'' will be incremented first but the previous 'y' value (10) 
                     is assigned again to 'y'' variable, and the incremented (11) value
                      will be used after assigning. But in this example, 
                     the next value of 'y''  is overridden by previous value (10) always.  */ 
        y = y++;   //   STEP 3: The value of 'y'' is post incremented and assigned to 'y'' only.
 
        y = y++;      //STEP 4: The value of 'y'' is post incremented and assigned to 'y'' only.              
        System.out.println("The Value of y is : " + y);

        }
      }
    

