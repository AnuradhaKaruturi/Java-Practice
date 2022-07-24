package MultiThreading;

public class ThreadLifeCycle implements Runnable{


    public void run() {
        System.out.println("Running thread name: "+ Thread.currentThread().getName()); 
        System.out.println("Current state of Thread = "+Thread.currentThread().getState());
        for(int i = 0 ; i < 4 ; i++){
            System.out.println("i : "+i );
            if(i == 2){
                Thread.currentThread().interrupt();
            }
        }
        
    }

    public static void main(String[] args) {
        ThreadLifeCycle tlc = new ThreadLifeCycle();
        Thread t = new Thread(tlc);
        Thread t2 = new Thread(tlc);
        Thread.State state = Thread.currentThread().getState();  
        System.out.println("Current state of Thread = "+state);
        t.start();
        t2.start();
    }

    
}
