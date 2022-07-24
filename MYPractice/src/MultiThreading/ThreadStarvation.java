package MultiThreading;

public class ThreadStarvation extends Thread {
    
 
 public void run() { 
  System.out.println(Thread.currentThread().getName() + " Thread execution starts"); 
  System.out.println(Thread.currentThread().getName() +"Thread execution completes");  
 } 

 public static void main(String[] args) throws InterruptedException { 
    System.out.println("Parent thread execution starts"); 
    ThreadStarvation thread1 = new ThreadStarvation();
    thread1.setPriority(10);
    thread1.setName("First");

    ThreadStarvation thread2 = new ThreadStarvation();
    thread2.setPriority(5);
    thread2.setName("second");
  
    ThreadStarvation thread3 = new ThreadStarvation();
    thread3.setPriority(7);
    thread3.setName("Third");
  
    ThreadStarvation thread4 = new ThreadStarvation();
    thread4.setPriority(8);
    thread4.setName("Fourth");
  
    ThreadStarvation thread5 = new ThreadStarvation();
    thread5.setPriority(6);
    thread5.setName("Fifth");
  
    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
    thread5.start();
    
    System.out.println("Parent thread execution completes"); 
}
}
