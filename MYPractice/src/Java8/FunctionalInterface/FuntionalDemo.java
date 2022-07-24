package Java8.FunctionalInterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FuntionalDemo {

    public static void main(String[] args) {

        FuntionalDemo obj = new FuntionalDemo();

        List<String> list = Arrays.asList("node", "c++", "java", "javascript" ,"angularjs" ,"python");

        // lambda
        Map<String, Integer> map = obj.convertListToMap(list, x -> x.length());

        System.out.println(map);    

        // method reference
        Map<String, Integer> map2 = obj.convertListToMap(list, obj::getLength);

        System.out.println(map2);
        
    }

    private Map<String, Integer> convertListToMap(List<String> list, Function<String, Integer> func) {
        Map<String, Integer> result = new HashMap<>();
        for ( String str : list) {
            result.put(str, func.apply(str));
        }
        return result;

    }

    public Integer getLength(String str) {
        return str.length();
    }
    
}
