package Synchronization;

public class DeadLock {

    public static void main(String[] args) {
        final String resourceA = "A";
        final String resourceB = "B";

        Thread t1 = new Thread(){

            public void run(){

                synchronized(resourceA){
                    System.out.println("Thread 1: Locked resourceA");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized(resourceB){
                        System.out.println("Thread 1: Locked resourceB");
                    }
                }
                
            }
        };

        Thread t2 = new Thread(){

            public void run(){

                synchronized(resourceB){
                    System.out.println("Thread 2: Locked resourceB");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized(resourceA){
                        System.out.println("Thread 2: Locked resourceA");
                    }
                }
               
            }
        };
          t1.start();
          t2.start();
    }

}

