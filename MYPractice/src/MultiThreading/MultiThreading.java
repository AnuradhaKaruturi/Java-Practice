package MultiThreading;

public class MultiThreading implements Runnable {

    String name;
    MultiThreading(String name){
      this.name = name;
    }


    public void run() {
        System.out.println("Name of thread: " +Thread.currentThread());	
       for(int i =0 ;i < 2;i++){
           System.out.println(name+" " + i);
           try
           {
              Thread.sleep(1000); // Pause the thread execution for 1000 milliseconds.
           }
           catch(InterruptedException ie) {
             System.out.println(ie.getMessage());	
            }
         }
        }

        public static void main(String[] args) 
{
    System.out.println("Name of thread: " +Thread.currentThread());	
    //multiple threads on multiple objects.
    MultiThreading t1 = new MultiThreading("First");
    MultiThreading t2 = new MultiThreading("second");

    Thread thread1 = new Thread(t1);
    Thread thread2 = new Thread(t2);

    thread1.start();
    thread2.start();

    //multipule threads sharing the same object (same run() method)
    MultiThreading mt = new MultiThreading("Hello");
    Thread th1 = new Thread(mt);
    Thread th2 = new Thread(mt);
    Thread th3 = new Thread(mt);
    th1.setName("Thread1 :");
    th2.setName("Thread2 :");
    th3.setName("Thread3 :");
    th1.start();
    th2.start();
    th3.start();
}
    }
    

