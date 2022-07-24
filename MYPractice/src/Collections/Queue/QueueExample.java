package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args)
    {
        Queue<Integer> que = new LinkedList<>();
            que.add(20);
            que.add(40);
            que.add(50);
            que.add(60);
            que.add(10);
            que.add(30);

        System.out.println("Elements of queue " + que);
 
        int removedele = que.remove();
        System.out.println("removed element" +removedele); //remove head element and throws exception if queue is empty
 
        System.out.println(que);
 
        int head = que.peek();   //view head element
        System.out.println("head of queue-"+ head);
 
        int size = que.size();
        System.out.println("Size of queue-" + size);

        int poll = que.poll(); //remove and return head of queue or null if queue is empty
        System.out.println("head of queue-" + poll);

        System.out.println("Elements of queue " + que);
 
    }
    
}
