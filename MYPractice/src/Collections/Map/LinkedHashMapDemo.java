package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> lhmap =  new LinkedHashMap<Integer, String>();
        lhmap.put(3, "apple");
        lhmap.put(1, "mango");
        lhmap.put(2, "cherry");
        lhmap.put(4, "berry");
        lhmap.put(null, null);
        lhmap.put(5, null);

        for(Map.Entry<Integer,String> m : lhmap.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        lhmap.put(3, "green apple");
        System.out.println();

        for(Map.Entry<Integer,String> m : lhmap.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }
        System.out.println();
        LinkedHashMap<Integer, String> lhmap1 =  new LinkedHashMap<>(20, 0.75f, true);
        //true is passed for the last access order and false is passed for the insertion order.
        lhmap1.put(3, "red");
        lhmap1.put(1, "green");
        lhmap1.put(2, "yellow");
        lhmap1.put(4, "blue");
        lhmap1.put(5 ,"purple");
        lhmap1.put(6, "pink");
        lhmap1.put(7, "violet");
        
        for(Map.Entry<Integer,String> m : lhmap1.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        System.out.println("Element at key 5 :"+lhmap1.get(5));
        System.out.println("Element at key 7 :"+lhmap1.get(7));
 
        System.out.println("Element at key 5 :"+lhmap1.getOrDefault(5, "peaceLily"));
        System.out.println("Element at key 7 :"+lhmap1.getOrDefault(15, "whiteRose"));
 
        System.out.println("Does map contains key 5 "+ lhmap1.containsKey(5));
        System.out.println("Does map contains key 13 "+ lhmap1.containsKey(13));
        System.out.println("Does map contains value red "+ lhmap1.containsValue("red"));
        System.out.println("Does map contains value sea green "+ lhmap1.containsValue("sea green"));
        System.out.println("Is map Empty ? :" +lhmap1.isEmpty());
        System.out.println(lhmap1);
        System.out.println(" Add element if not present " + lhmap1.putIfAbsent(11, "sea blue"));
       System.out.println(lhmap1);
 
        LinkedHashMap<Integer,String> lhmap2 = new LinkedHashMap<Integer,String>(); 
        lhmap2.putAll(lhmap1);
         System.out.println(" Elements of  lhmap2 :"+ lhmap2);
     
        
 
         lhmap2.merge(5, "lotus", (x,y)->x+" / "+y);
         for(Map.Entry<Integer,String> m : lhmap2.entrySet()){
             System.out.print(m.getKey() + " : ");
             System.out.println(m.getValue());
         }
         System.out.println("************");
        
         lhmap2.merge(10, "daisy", (x,y)->x+y);
         for(Map.Entry<Integer,String> m : lhmap2.entrySet()){
             System.out.print(m.getKey() + " : ");
             System.out.println(m.getValue());
         }
         System.out.println();
         System.out.println(lhmap2.get(5));
         System.out.println("Compute");
         lhmap2.compute(5, (k,v)->v.concat(" color"));
        // map.compute(14, (k,v)->v.concat(" colors")); if element is not present throws nullpointer exception 
         for(Map.Entry<Integer,String> m : lhmap2.entrySet()){
             System.out.print(m.getKey() + " : ");
             System.out.println(m.getValue());
         }
         System.out.println(" computeIfPresent");
         lhmap2.computeIfPresent(6, (k,v)->v.concat("es"));
         lhmap2.computeIfPresent(11, (k,v)->v.concat("colors"));
         System.out.println(" computeIfAbsent");
         lhmap2.computeIfAbsent(11, (v)-> "Blue");
         for(Map.Entry<Integer,String> m : lhmap2.entrySet()){
             System.out.print(m.getKey() + " : ");
             System.out.println(m.getValue());
         }
         
         System.out.println("replace "+lhmap2.replace(1, "navy blue"));
         System.out.println("replace "+lhmap2.replace(3, "red", "Neon"));
         System.out.println("replace "+lhmap2.remove(2, "Lemon yellow"));
         for(Map.Entry<Integer,String> m : lhmap2.entrySet()){
             System.out.print(m.getKey() + " : ");
             System.out.println(m.getValue());
         }

         
         LinkedHashMapDemo demo = new LinkedHashMapDemo();
        //  demo.removeEldestEntry(lhmap2.entrySet());
     
    }
    
}
