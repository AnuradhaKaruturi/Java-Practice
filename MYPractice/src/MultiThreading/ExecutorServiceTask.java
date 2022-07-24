package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTask {

    public static void main(String[] args) {
    
   // Creating a fixed thread pool with maximum of three threads.	
    ExecutorService executor = Executors.newFixedThreadPool(1);
    ExecutorThread t1 = new ExecutorThread("anu");
    ExecutorThread t2 = new ExecutorThread("devi");
    ExecutorThread t3 = new ExecutorThread("sindhu");

    // Submit tasks to thread pool.
   executor.execute(t1);
   executor.execute(t2);
   executor.execute(t3);
 
// Shut down the executor. 
   executor.shutdown();
    
}

}
class ExecutorThread extends Thread{

    String name;
    ExecutorThread(String name){
        this.name = name;
    }

    public void run(){
        for(int i = 0 ;  i< 3;i++){
            System.out.println(i+name);
        }
    }
}

/*abstract0anu
1anu
0sindhu
1sindhu
0devi
2sindhu
2anu
1devi
2devi
*/

/* onr thread and three tasks
0anu
1anu
2anu
0devi
1devi
2devi
0sindhu
1sindhu
2sindhu
*/