package MultiThreading;

public class ThreadPriority implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread());   
    }

    public static void main(String[] args) 
{
    ThreadPriority tp = new ThreadPriority();
 Thread t1 = new Thread(tp, "First Thread");
 Thread t2 = new Thread(tp, "Second Thread");
 Thread t3 = new Thread(tp, "Third Thread");
 
 t1.setPriority(4); // Setting the priority of first thread.
 t2.setPriority(2); // Setting the priority of second thread.
 t3.setPriority(6); // Setting the priority of third thread.
 
 t1.start();
 t2.start();
 t3.start();
  }
    
}

/*Thread[Third Thread,6,main]
Thread[First Thread,4,main]
Thread[Second Thread,2,main]
*/