package Collections.LinkedList.LinkedListAssignment;
import java.util.LinkedList;

//insert elemnet at first and last position
public class Program6 {

    public static void main(String args[]){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("anu");
        linkedList.add("siri");
        linkedList.add("vivek");
        linkedList.add("shahstra");
        System.out.println("Actual LinkedList:"+linkedList);
        linkedList.add(0, "welcome"); //addFirst()
        linkedList.add(linkedList.size(),"Thankyou");  //addLast()
        System.out.println("After adding first and last elements in   LinkedList:"+linkedList);
    }
}
