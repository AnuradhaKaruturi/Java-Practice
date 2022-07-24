package Java8.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        String str = "Hello all welcome to the World of programming.";

        Supplier<Integer> sup1 = ()->str.length();
        Supplier<String> sup2 = ()->str.substring(10, 17);
        Supplier<String> sup3 = ()->str.toLowerCase();
        Supplier<String> sup4 = ()->str.toUpperCase();
        Supplier<String> sup5 = ()->str.concat("ANU");

        System.out.println(sup1.get());
        System.out.println(sup2.get());
        System.out.println(sup3.get());
        System.out.println(sup4.get());
        System.out.println(sup5.get());


    }
    
}
