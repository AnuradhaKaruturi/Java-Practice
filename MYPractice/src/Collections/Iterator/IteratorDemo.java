package Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(150);
        list.add(200);
        list.add(250);
        list.add(300);
        list.add(350);
        list.add(400);
        list.add(450);
        list.add(500);
        list.add(550);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Using ForEachRemaining..");//avoids need of while loop
        Iterator<Integer> iter = list.iterator();
        iter.forEachRemaining((num)->System.out.println(num));
    }
    
}
