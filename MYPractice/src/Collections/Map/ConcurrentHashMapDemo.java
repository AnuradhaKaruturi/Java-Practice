package Collections.Map;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap cmap = new ConcurrentHashMap<>();

        cmap.put(100, "apple");
        cmap.put(101, "mango");
        cmap.put(102, "kiwi");
        cmap.put(104,"grapes");

        cmap.putIfAbsent(101, "greenApple");
        cmap.putIfAbsent(103, "Orange");
        
        System.out.println(cmap); 

        cmap.remove(100, "apple");
 
        cmap.replace(101, "mango", "greenMango");
        System.out.println(cmap);
 
        System.out.println("MappingCount :" +cmap.mappingCount());
        System.out.println("Size  :" +cmap.size());

        System.out.println("Compute HashMap values :\n " );    
        cmap.computeIfAbsent(106, k -> k + "peaches");   
        cmap.computeIfAbsent(104, k -> k + " green");   
        cmap.computeIfPresent(103, (k,v)->((String) v).concat("es"));
        System.out.println("New HashMap after compute :\n "+ cmap);   


        Iterator<ConcurrentHashMap.Entry<Integer, String> >itr = cmap.entrySet().iterator();
 

        while (itr.hasNext()) {
            ConcurrentHashMap.Entry<Integer, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey()+ ", Value = "+ entry.getValue());
        }

        System.out.println(cmap);
        System.out.println("is kiwi  present? ::  "  + cmap.containsValue("kiwi"));   
        System.out.println("is melon  present? ::  "  + cmap.containsValue("melon"));   


    }
    
}
