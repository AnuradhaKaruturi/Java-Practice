package Synchronization;

public class StaticSynchronization {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        ThreadThree t3 = new ThreadThree();
        Threadfour t4 = new Threadfour();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }  
}

class Multiplication {

        synchronized static  void multiply(int num){
            for(int i = 0; i <= num ; i++ ){
            System.out.println(num +" * "+ i +" = "+ num  * i);
            }
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }  
        }
      
    
    } 
    
    class ThreadOne extends Thread{

        public void run(){
            Multiplication.multiply(2);
    
        }
    }

    class ThreadTwo extends Thread{

        public void run(){
            Multiplication.multiply(3);
    
        }
    }
    
    class ThreadThree extends Thread{

        public void run(){
            Multiplication.multiply(4);
    
        }
    }
    
    class Threadfour extends Thread{

        public void run(){
            Multiplication.multiply(5);
    
        }
    }
    
    
  /*
  3 * 0 = 0
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
4 * 0 = 0
4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
2 * 0 = 0
2 * 1 = 2
2 * 2 = 4
5 * 0 = 0
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
*/ 
