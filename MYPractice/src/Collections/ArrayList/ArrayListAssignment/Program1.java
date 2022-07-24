package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

//create ArrayList of colors
public class Program1 {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");

        System.out.println("Colors in the list are :"+ colors);

    }
    
}

//Colors in the list are :[red, green, yellow, blue, red, yellow]