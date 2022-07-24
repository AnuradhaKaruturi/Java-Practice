package MultiThreading;

public class StartAndRun implements Runnable {

    public void run() {

        System.out.println("Current thread name: " + Thread.currentThread().getName());
        System.out.println("run() method called");
        
    }

    public static void main(String[] args) {
        StartAndRun sr  = new StartAndRun();
        Thread t = new Thread(sr);
        t.start(); //Current thread name: Thread-0                 run() method called
      /*  t.start(); /* start() can be invoked only once.
        Exception in thread "main" Current thread name: Thread-0
        java.lang.IllegalThreadStateException
        run() method called
        at java.base/java.lang.Thread.start(Thread.java:791)
        at MultiThreading.StartAndRun.main(StartAndRun.java:16) */
        t.run();   //Current thread name: main               run() method called
        t.run();  //run can be invoked multiple times
        /*Current thread name: main
run() method called
Current thread name: Thread-0
run() method called
Current thread name: main
run() method called
*/
    }
    
}
