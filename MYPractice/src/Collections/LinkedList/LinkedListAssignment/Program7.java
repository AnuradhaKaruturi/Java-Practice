package Collections.LinkedList.LinkedListAssignment;
import java.util.LinkedList;
//add element at front of the list 
public class Program7 {

    public static void main(String[] args) {
        
    LinkedList<String> linkedList = new LinkedList<String>();
    linkedList.add("anu");
    linkedList.add("siri");
    linkedList.add("vivek");
    linkedList.add("shahstra");
    System.out.println("Actual List : "+ linkedList);
    linkedList.addFirst("Aravind");
    System.out.println(" After add element at front of the list  : "+ linkedList);

}
    
}
