package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

//copy on elist to another list
public class Program16 {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("yellow");
        System.out.println("List elements of colors:"+ colors);
        List<String> colorsnewList = new ArrayList<String>(colors);
        System.out.println("List elements of colorsnewlist :"+ colorsnewList);
        
    }
    
}
