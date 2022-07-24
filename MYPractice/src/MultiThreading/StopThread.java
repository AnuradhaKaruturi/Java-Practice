package MultiThreading;

public class StopThread  extends Thread{

 boolean stop = false;
 public void run()
 {
  System.out.println("Thread is running");
  int i = 0;
while(i < 5)
{
 System.out.println("i: " +i);
 if(i == 3)
 if(stop == true) // Come out of run() method.
   return;	   
   i = i + 1;
 }
    
}

public static void main(String[] args) 
{
 StopThread th1 = new StopThread();
 Thread t1 = new Thread(th1);
  t1.start();
  th1.stop = true;
 }
}
