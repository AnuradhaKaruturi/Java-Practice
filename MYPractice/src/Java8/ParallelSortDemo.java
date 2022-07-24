package Java8;

import java.util.Arrays;
import java.util.Comparator;

public class ParallelSortDemo {
    public static void main(String[] args) {

        int numbers[] = {22,18,66,2,59,6,48, 89, 1,38, 32, 19, 5};
	    //Parallel Sort method for sorting int array
	     Arrays.parallelSort(numbers);
	    //converting the array to stream and displaying using forEach
	    Arrays.stream(numbers).forEach(n->System.out.print(n+" "));

        System.out.println();
        //ParallelSort with fromindex and toindex
        Arrays.parallelSort(numbers, 1, 10);
        Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
        
    }
    
}
