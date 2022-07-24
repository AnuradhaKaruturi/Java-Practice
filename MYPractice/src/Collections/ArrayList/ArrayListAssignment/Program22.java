package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
//printing alla elements based on its positions
public class Program22 {

    public static void main(String[] args) {
        
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(50);
        arrlist.add(100);
        arrlist.add(150);
        arrlist.add(200);

        for (int i = 0; i < arrlist.size();i++) 
	      { 		      
	          System.out.println(arrlist.get(i)); 		
	      }   
    }
    
}
