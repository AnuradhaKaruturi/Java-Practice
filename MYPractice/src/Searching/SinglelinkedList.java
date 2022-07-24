package Searching;

public class SinglelinkedList {

    public static void main(String[] args) {

        SinglelinkedList list = new SinglelinkedList();
        list.addNode(5);
        
    }

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    }

    public Node head = null;  
    public Node tail = null;    

    public void addNode(int data){
    
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        } 
    }

    public void searchNode(int data) {  
        Node current = head;  
        int position = 1;
     
         boolean flag = false;  
       
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            while(current != null) {  
                
                if(current.data == data) {  
                    flag = true;  
                    break;  
                }  
                position++;  
                current = current.next;  
            }  
        }  
        if(flag)  
             System.out.println("Element is present in the list at the position : " + position);  
        else  
             System.out.println("Element is not present in the list");  
    }  
}
  
