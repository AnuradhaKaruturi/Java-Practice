package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;

//clone from one list to another list
public class Program20 {
//clone arrayList
    public static void main(String[] args) {
        
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("yellow");

        System.out.println("List elements :"+colors);

        Object clonedcolors =   colors.clone();
        System.out.println("Cloned List :"+ clonedcolors);
        
    }
    
}
