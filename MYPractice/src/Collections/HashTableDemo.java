package Collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1, "Lily");
        map.put(2, "Marigold");
        map.put(3, "Daisy");
        map.put(4, " poppy");
        Hashtable table = new Hashtable<>(map);
        table.put(5, "Jasmine");
        table.put(6, "rose");

        System.out.println(table);
        System.out.println("HashTable containds Value Daisy : "+table.contains("Daisy"));
        System.out.println("Contains key 4 :"+ table.containsKey(4));
        System.out.println("ContainsValue poppy :"+table.containsValue("poppy"));
        System.out.println("Get element at index 2 : "+ table.get(2));
        System.out.println("GetOrDefault element at 1 if present :"+table.getOrDefault(1, "peacelily"));
        System.out.println("GetOrDefault element at 7 if not present :"+table.getOrDefault(7, "balsamina"));

        System.out.println(table.remove(2));
        System.out.println(table);

        Enumeration en = table.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

    }
    
}
