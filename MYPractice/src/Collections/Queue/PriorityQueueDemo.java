package Collections.Queue;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        
      Queue<String> pq = new PriorityBlockingQueue<>();
      
    //  System.out.println(pq.poll()); //remove top returns null
    //  System.out.println(pq.remove());//remove top throws exception
      pq.add("apple");
      pq.add("mango");
      pq.add("kiwi");
      pq.add("banana");
      pq.add("grapes");
      pq.offer("xxx");

      Iterator<String> iterator = pq.iterator();
 
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        String peek = pq.peek();
        System.out.println("Top elements is :"+peek);

        System.out.println(pq.poll()); 
       System.out.println(pq.remove());
 
       
 
    }
    
}
