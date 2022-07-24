package Collections.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithComparator {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(new NameSorting());
        set.add("Poppy");
        set.add("Jasmine");
        set.add("Daisy");
        set.add("Marigold");
        set.add("cacti");

        System.out.println("TreeSet Elements :"+set);
    }
    
}


class NameSorting implements Comparator<String>{
 
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
     
}
    
