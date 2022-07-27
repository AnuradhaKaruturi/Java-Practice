package practice;
public class LoopingTest {
    public static void main(String[] args) {
        System.out.println("---------for in for---------");
        for (int i = 1;i<= 5;i++){
          for(int j =1;j<=5;j++){
              System.out.println(i*j+" ");
              if(i==3)
              break;
          }
          }
          System.out.println("  ");
System.out.println("--while And Do while In For--------------");
        for (int i = 1;i<= 5;i++){
            while(i<4){
                System.out.print(i+" ");
                i++;
            }
            System.out.println("  ");
            do{
                System.out.print(i+ " ");
                i++;
            }while(i<5);
            }
  System.out.println("---While in For & For In DO While-------------");
             int j;
               do{
                for( j =1;j<=5;j++){
                    System.out.println(j);
                    while(j < 2){
                        System.out.println("greater than 2");
                        j++;

                    }
                }
                j++;
            }while(j<3);
    
            System.out.println("------For EACH----------");   
            int array[] = {2,4,6,8,10};
            int array1[] = {1,3,5,7,9};
            for (int i : array) {
                System.out.println(i);
                if(i == 3)
                continue;
            }         
            System.out.println("-------LAbeled For---------");

            xx:
              for (int i : array) {
                  System.out.println(i);
                //  yy:
                    for (int k : array1) {
                        System.out.println(k);
                        if(k > 4)
                        break xx;
                        
                    }

                }
              } 
        }
    
    

