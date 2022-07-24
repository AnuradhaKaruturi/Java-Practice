package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

//update array element by given element
public class Program5 {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");

        System.out.println("Colors in the list are :"+ colors);

        colors.set(4, "pink");
        colors.set(5, "seaBlue");

        System.out.println("Updated Colors in the list are :"+ colors);
    }
    
}
