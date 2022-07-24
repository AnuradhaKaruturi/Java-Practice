package Collections.Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;



public class ArrayDeque1 {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("yellow");
        ArrayDeque<String> arrdeq = new ArrayDeque<String>(colors);

       /* 
        ArrayDeque<String> de_que = new ArrayDeque<>();
        System.out.println("Deque elements "+de_que);
        de_que.addFirst("Apple");
        de_que.add("Mango");
        System.out.println("Deque elements "+de_que);
*/

    }
    
}
