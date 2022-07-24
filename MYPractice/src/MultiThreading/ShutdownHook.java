package MultiThreading;

public class ShutdownHook {

    public static void main(String[] args) throws InterruptedException {
        MyThread th = new MyThread();
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(th);

        for(int i = 0 ; i< 8 ;i++ ){
            System.out.println("Inside main Thread ..");
            Thread.sleep(1000);
        }
    }
    
}


class MyThread extends Thread{
    public void run(){
     System.out.println("This is shutdownHook...");
    }
}

/*press ctrl+c 
Inside main Thread ..
Inside main Thread ..
Inside main Thread ..
Inside main Thread ..
Inside main Thread ..
Inside main Thread ..
This is shutdownHook...
*/