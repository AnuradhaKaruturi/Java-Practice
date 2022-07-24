package Collections.HashSet;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;



public class CopyOnWriteArraySetDemo {

    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        Iterator itr = set.iterator();//The returned iterator provides an immutable 
        //snapshot of the state of the set when the iterator was constructed.
        set.add("Rose");
        set.add("Daisy");
        set.add("Jasmine");
        System.out.println("Set contains: ");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        itr = set.iterator();

        System.out.println("Set contains:");
 
        while (itr.hasNext()){
            System.out.println(itr.next());
            
            if (itr.next().equals("Daisy")) {
            //   itr.remove();
            }
        }
    }
    }
    

