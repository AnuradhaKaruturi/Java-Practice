package Collections.LinkedList.LinkedListAssignment;
import java.util.LinkedList;
//add element at end of the list 
public class Program8 {

    public static void main(String[] args) {
        
    LinkedList<String> linkedList = new LinkedList<String>();
    linkedList.add("anu");
    linkedList.add("siri");
    linkedList.add("vivek");
    linkedList.add("shahstra");
    System.out.println("Actual List : "+ linkedList);
    linkedList.addLast("Sravan");
    System.out.println(" After add element at end of the list  : "+ linkedList);

}
    
}
