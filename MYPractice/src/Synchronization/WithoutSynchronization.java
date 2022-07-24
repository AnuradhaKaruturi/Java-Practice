package Synchronization;

public class WithoutSynchronization {
    public static void main(String[] args) {
        ThreadExample ex1 = new ThreadExample("Thread - 1 ");
        ThreadExample ex2 = new ThreadExample("Thread - 2 ");
        ex1.start();
        ex2.start();

        try {
            ex1.join();
            ex2.join();
         } catch ( Exception e) {
            System.out.println("Interrupted :)");
         }

    }
    
}

class ThreadExample extends Thread{

   private String threadName;

   ThreadExample ( String name) {
      threadName = name;
   }

   public void run() {
    System.out.println("Starting the" +  threadName );
    printCount();
    System.out.println("Thread " +  threadName + " is exiting ;)");
 }

    public void printCount() {
        try {
           for(int i = 5; i > 0; i--) {
              System.out.println("Counter= "  + i );
           }
        } catch (Exception e) {
           System.out.println("Thread  interrupted :)");
        }
     }
}

/* without join
Starting theThread - 1 
Starting theThread - 2 
Counter= 5
Counter= 4
Counter= 5
Counter= 3
Counter= 4
Counter= 2
Counter= 3
Counter= 1
Counter= 2
Thread Thread - 1  is exiting ;)
Counter= 1
Thread Thread - 2  is exiting ;)
*/

/*with join
Starting theThread - 2 
Starting theThread - 1 
Counter= 5
Counter= 5
Counter= 4
Counter= 4
Counter= 3
Counter= 3
Counter= 2
Counter= 2
Counter= 1
Counter= 1
Thread Thread - 1  is exiting ;)
Thread Thread - 2  is exiting ;)
*/