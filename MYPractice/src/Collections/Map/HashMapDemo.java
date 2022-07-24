package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1, "Lily");
        map.put(2, "Marigold");
        map.put(3, "Daisy");
        map.put(4, " poppy");
        //clone
        HashMap<Integer,String> clonedmap =   (HashMap<Integer, String>) map.clone();
        if(map.equals(clonedmap)){
            System.out.println("Both maps are equals.");
        }
        else{
            System.out.println("Both maps are not equals.");
        }

        //adding elements
        map.put(5, "jasmine");
        map.put(7,"rose");
        map.put(8,"Peony");
        map.put(9, "Tulip");
        map.put(10, null);
        map.put(null, null);

       // Traversing through Map using for-each loop
       for(Map.Entry<Integer,String> m : map.entrySet()){
           System.out.print(m.getKey() + " : ");
           System.out.println(m.getValue());
       }

       //get methods
       System.out.println("Element at key 5 :"+map.get(5));
       System.out.println("Element at key 7 :"+map.get(7));

       System.out.println("Element at key 5 :"+map.getOrDefault(5, "peaceLily"));
       System.out.println("Element at key 7 :"+map.getOrDefault(15, "whiteRose"));

       System.out.println("Does map contains key 5 "+ map.containsKey(5));
       System.out.println("Does map contains key 13 "+ map.containsKey(13));
       System.out.println("Does map contains value rose "+ map.containsValue("rose"));
       System.out.println("Does map contains value carnation "+ map.containsValue("carnation"));
       System.out.println("Is map Empty ? :" +map.isEmpty());
       System.out.println(map);
       System.out.println(" Add element if not present " + map.putIfAbsent(11, "Daffodils"));
      System.out.println(map);

       HashMap<Integer,String> map1 = new HashMap<Integer,String>(); 
       HashMap<Integer,String> map2 = new HashMap<Integer,String>(); 
        map1.put(1, "mango");
        map1.put(2, "kiwi");
        map1.put(3, "leeche");
        map1.put(4, " strawberry");
        map1.put(5, "apple");
        System.out.println(" Elements of  map1 :"+ map1);
        map2.put(1, "Car");
        map2.put(2,"Bus");
        System.out.println(" Elements of  map2 :"+ map2);
    
        map2.putAll(map1);
        System.out.println(" Elements of  map2 :"+ map2);

        map.merge(1, "whitelily", (x,y)->x+" "+y);
        for(Map.Entry<Integer,String> m : map.entrySet()){
            System.out.print(m.getKey() + " : ");
            System.out.println(m.getValue());
        }
        System.out.println("************");
       /* map.merge(3, "es", (x,y)->x+y);
        for(Map.Entry<Integer,String> m : map.entrySet()){
            System.out.print(m.getKey() + " : ");
            System.out.println(m.getValue());
        }
        */
        map.merge(16, "redrose", (x,y)->x+y);
        for(Map.Entry<Integer,String> m : map.entrySet()){
            System.out.print(m.getKey() + " : ");
            System.out.println(m.getValue());
        }
        System.out.println();
        System.out.println(map.get(7));
        System.out.println("Compute");
        map.compute(7, (k,v)->v.concat("es"));
       // map.compute(14, (k,v)->v.concat("es")); if element is not present throws nullpointer exception 
        for(Map.Entry<Integer,String> m : map.entrySet()){
            System.out.print(m.getKey() + " : ");
            System.out.println(m.getValue());
        }
        System.out.println(" computeIfPresent");
        map.computeIfPresent(8, (k,v)->v.concat("es"));
        map.computeIfPresent(18, (k,v)->v.concat("bunches"));
        System.out.println(" computeIfAbsent");
        map.computeIfAbsent(18, (v)-> "Blue");
        for(Map.Entry<Integer,String> m : map.entrySet()){
            System.out.print(m.getKey() + " : ");
            System.out.println(m.getValue());
        }
        
        System.out.println("replace "+map1.replace(1, "Mangoes"));
        System.out.println("replace "+map1.replace(3, "leeche", "Lemon"));
        System.out.println("replace "+map1.remove(2, "Kiwi"));
        for(Map.Entry<Integer,String> m : map1.entrySet()){
            System.out.print(m.getKey() + " : ");
            System.out.println(m.getValue());
        }

        HashMap<Integer,String> maps = new HashMap<Integer,String>();
        maps.put(100, "one");
        maps.put(200, "two");
        System.out.println(maps);
      
        for(Map.Entry<Integer,String> m : map.entrySet()){
            System.out.print(m.getKey() + " : ");
            System.out.println(m.getValue());
        }
        map.putAll(maps);
        System.out.println();
        for(Map.Entry<Integer,String> m : map.entrySet()){
            System.out.print(m.getKey() + " : ");
            System.out.println(m.getValue());
        }

    }
    
}
