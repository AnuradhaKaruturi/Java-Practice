package Java8;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) { 
        //constructor with delimiter
        StringJoiner names = new StringJoiner(",");
        //constructor with delimiter, prefix,suffix
        StringJoiner namesstr = new StringJoiner("/", "{", "}");
        
        // if Stringjoiner is empty we can set empty vlaue as the default value of StringJoiner return StringJoiner class
        names.setEmptyValue("It is empty");  
        System.out.println(names);   
        
        //add elements to StringJoiner
        names.add("apple");
        names.add("mango");
        names.add("orange");
        System.out.println(names);
        //length() of Stringjoiner
        System.out.println(names.length());

        namesstr.add("red");
        namesstr.add("yellow");
        namesstr.add("green");
        System.out.println(namesstr);
        System.out.println(namesstr.length());

        //merging two StringJoiners
        StringJoiner joinedstr = names.merge(namesstr);
        System.out.println(joinedstr);

        // toString() method is used for converting a StringJoiner instance to a String. 
        String s = namesstr.toString();  
        System.out.println(s);   
    }
    
}
