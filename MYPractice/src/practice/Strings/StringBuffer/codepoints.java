package practice.Strings.StringBuffer;

import java.util.stream.IntStream;

public class codepoints {
    public static void main(String[] args) {

        String str = "Code Points";

        System.out.println("Input string value : "+str);

        IntStream intStream = str.codePoints();

        System.out.println("Printing each char from string as ASCII value");
        intStream.forEach(value -> System.out.println(value+" "));
       System.out.println("-----------");
       int code = str.codePointAt(7);
       System.out.println(code);

       code = str.codePointBefore(2);
       System.out.println(code);

       code = str.codePointCount(0, str.length()-1);
       System.out.println(code);

    }
    
}
