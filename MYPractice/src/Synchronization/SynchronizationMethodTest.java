package Synchronization;

public class SynchronizationMethodTest {

    public static void main(String[] args) {
        MultiplicationTable obj = new MultiplicationTable();
        ThreadOnee t1 = new ThreadOnee(obj);
        ThreadTwoo t2 = new ThreadTwoo(obj);
        t1.start();
        t2.start();
    }   
    
}

class MultiplicationTable {
/*
    synchronized public void multiply(int num){
        for(int i = 0; i <= num ; i++ ){
        System.out.println(num +" * "+ i +" = "+ num  * i);
        }
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
    }
    */

    public void multiply(int num){
        System.out.println("Entering into multiply method :");
        synchronized(this){
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
}

class ThreadOnee extends Thread{

    MultiplicationTable mt;

    ThreadOnee(MultiplicationTable m){
        this.mt = m;
    }
    public void run(){
        mt.multiply(5);

    }
}

class ThreadTwoo extends Thread{

    MultiplicationTable mt;

    ThreadTwoo(MultiplicationTable m){
        this.mt = m;
    }
    public void run(){
        mt.multiply(10);

    }
}

/*
5 * 0 = 0
5 * 1 = 5
10 * 0 = 0
5 * 2 = 10
10 * 1 = 10
10 * 2 = 20
5 * 3 = 15
5 * 4 = 20
10 * 3 = 30
5 * 5 = 25
10 * 4 = 40
10 * 5 = 50
10 * 6 = 60
10 * 7 = 70
10 * 8 = 80
10 * 9 = 90
10 * 10 = 100
*/

/*with synchronized method
10 * 0 = 0
10 * 1 = 10
10 * 2 = 20
10 * 3 = 30
10 * 4 = 40
10 * 5 = 50
10 * 6 = 60
10 * 7 = 70
10 * 8 = 80
10 * 9 = 90
10 * 10 = 100
5 * 0 = 0
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
*/

/*with sync block
Entering into multiply method :
Entering into multiply method :
5 * 0 = 0
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
10 * 0 = 0
10 * 1 = 10
10 * 2 = 20
10 * 3 = 30
10 * 4 = 40
10 * 5 = 50
10 * 6 = 60
10 * 7 = 70
10 * 8 = 80
10 * 9 = 90
10 * 10 = 100
*/