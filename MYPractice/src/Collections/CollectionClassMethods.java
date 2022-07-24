package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClassMethods {

    public static void main(String[] args) {
        
        List<String> listitems = new ArrayList<>();
        listitems.add("fruits");
        listitems.add("greenLeafyVeg");
        listitems.add("sugar");
        listitems.add("lentils");
        System.out.println(listitems);

        List<String> listitems1 = new ArrayList<>();
        listitems.add("salt");
        listitems.add("sugar");
        listitems.add("pepper");
        System.out.println(listitems1);

        listitems.addAll(3,listitems1);
        System.out.println(listitems);

        Collections.sort(listitems);
        System.out.println("Elements in Sorted Order :"+ listitems);
        Collections.reverse(listitems);
        System.out.println("Elements in Reverse Order :"+ listitems);

        System.out.println("Size of the list : "+listitems.size());
        System.out.println("Element in list at index 2 : "+listitems.get(2));
        System.out.println("Does list contains element salt : "+listitems.contains("salt"));
        System.out.println("index of element sugar : "+Collections.binarySearch(listitems, "sugar") );
      
        List<String> listitems2 = new ArrayList<>();
        Collections.copy(listitems2, listitems1);
        System.out.println("Element in listitems2 : "+listitems2 );
        System.out.println("Maximum element in listitems : " +Collections.max(listitems));
        System.out.println("Manimum element in listitems : " +Collections.min(listitems));
        Collections.shuffle(listitems2);
        System.out.println("Shuffling listitems 2 :" +listitems2);
        int num = Collections.frequency(listitems, "sugar");
        System.out.println("Frequncy of sugar in Collection : " + num);
        System.out.println(listitems);
        System.out.println("Is  listitems1 disjoint from itemlists : "+ Collections.disjoint(listitems, listitems2));
        
        System.out.println("List elements : "+ listitems);
        Collections.rotate(listitems, 3);
        System.out.println("Elements after Rotate  : " +listitems);
        Collections.swap(listitems, 1, 5);
        System.out.println("Elements after swapping 1 and 5 th index elements  : " +listitems);

    }
    
}
