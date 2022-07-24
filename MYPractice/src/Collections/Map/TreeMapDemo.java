package Collections.Map;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();

        tree_map.put(1, "car");
        tree_map.put(5, "jeep");
        tree_map.put(2, "cycle");
        tree_map.put(4, "ship");
        tree_map.put(3, "Plane");
        tree_map.put(6, "jet");
        tree_map.putIfAbsent(7, "skiijet"); 
        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
        System.out.println("TreeMap: " + tree_map.descendingMap());

        System.out.println("SubMap TreeMap: " + tree_map.subMap(3, 6));
        System.out.println("TreeMap: " + tree_map.subMap(3,true, 6, true));

        System.out.println("TreeMap firstKey: " + tree_map.firstKey());
        System.out.println("TreeMap FirstEntry: " + tree_map.firstEntry());;
        System.out.println("TreeMap pollFirstEntry: " + tree_map.pollFirstEntry());
        System.out.println("TreeMap higherEntry: " + tree_map.higherEntry(3));
        System.out.println("TreeMap higherKey: " + tree_map.higherKey(3));

        System.out.println("TreeMap lastKey: " + tree_map.lastKey());
        System.out.println("TreeMap lastEntry: " + tree_map.lastEntry());;
        System.out.println("TreeMap pollLastEntry: " + tree_map.pollLastEntry());
        System.out.println("TreeMap lowerEntry: " + tree_map.lowerEntry(3));
        System.out.println("TreeMap lowerKeyS: " + tree_map.lowerKey(3));

        System.out.println("TreeMap: " + tree_map.size());
        System.out.println("TreeMap: " + tree_map.get(4));;
        System.out.println("TreeMap: " + tree_map.getOrDefault(8, "peach"));
        System.out.println("TreeMap: " + tree_map.getOrDefault(6, "waterJet"));
        

        

    }
    
}
