package MultiThreading;

public class JoinThread {

    public static void main(String[] args) throws InterruptedException {
        
    // creating  threads
    ThreadJoining t1 = new ThreadJoining();
    ThreadJoining t2 = new ThreadJoining();
    ThreadJoining t3 = new ThreadJoining();
    t1.start();
    t1.join();
    t2.start();
    t2.join();
    t3.start();
    


    }
    
}

class ThreadJoining extends Thread
{

    public void run()
    {
        for (int i = 0; i < 2; i++)
        {
            try {
                Thread.sleep(500);
                System.out.println("Current Thread: " + Thread.currentThread().getName());
    }

    catch(Exception ex)
    {
        System.out.println("Exception has been caught" + ex);
    }
    System.out.println(i);
        }
    }
}