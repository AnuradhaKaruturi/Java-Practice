package Java8.OptionalClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OptionalClassDemo {

    public static void main(String[] args) throws Throwable {

      String str = null;
     // String substr = str.substring(3);
     // System.out.println(substr);  null pointer exception

     // empty() returns an empty Optional.
     System.out.println("EmptyOptional");
     Optional emptyOptional = Optional.empty(); 
     System.out.println(emptyOptional);

     //Optional.of -- returns non empty Optional.If value is null, will get NPE
     System.out.println("\nOptional.of()");
     Optional nonEmptyOptional = Optional.of("Anuradha"); 
     System.out.println(nonEmptyOptional);
     // Optional nonEmptyOptionalwithNull = Optional.of(null); ---null pointer Exception

     //Optional.ofNullable() returns non empty Optional.If value is null, will get Optional.empty()
     System.out.println("\nOptional.ofNullable()");
     Optional nonEmptyOrEmptyOptional1 = Optional.ofNullable("Anu");
     Optional nonEmptyOrEmptyOptional2 = Optional.ofNullable(null);
     System.out.println(nonEmptyOrEmptyOptional1);
     System.out.println(nonEmptyOrEmptyOptional2);


     //isPresent() - returns true if value Present otherwise false
     System.out.println("\nOptional.isPresent()\n");
     System.out.println(emptyOptional.isPresent());//false
     System.out.println(nonEmptyOptional.isPresent());//true

     //ifPresent() - if value present invoke specified Consumer else do nothing
     System.out.println("\nOptional.ifPresent()");
     nonEmptyOptional.ifPresent(s->System.out.println(s));//Peter
     emptyOptional.ifPresent(s->System.out.println(s));//never invoke consumer


     /* filter() - If a value is present, and value matches the given predicate, 
         return an Optional otherwise return an empty Optional. */
    
     System.out.println("\nOptional.filter()");
     Predicate<String> predicate = s -> s.contains("Anur");
     System.out.println("nonEmptyOptional with matching predicate  : " + nonEmptyOptional.filter(predicate));//Optional[Anuradha]
     System.out.println("nonEmptyOptional with non-matching predicate  : " + nonEmptyOptional.filter(s -> s.equals("Anu")));//Optional.empty
     System.out.println("EmptyOptional with matching predicate  : " + emptyOptional.filter(predicate));//Optional.empty
     System.out.println("nonEmptyOptional with matching predicate  : " +nonEmptyOptional.filter(s -> ((String) s).startsWith("A")));//Optional[Anuradha]
     System.out.println("nonEmptyOptional with non-matching predicate  : " +nonEmptyOptional.filter(s -> ((String) s).startsWith("V")));//Optional.empty


     System.out.println("\nOptional.map()\n");
     Function<String, String> function = s -> s.equals("Anuradha") ? s : null;
     System.out.println(nonEmptyOptional.map(function));
     System.out.println(nonEmptyOptional.map( s -> s.equals("rani") ? s : null));
     System.out.println(emptyOptional.map(function));


        System.out.println("\nOptional.flatmap()\n");
        Optional<Optional> optionalContainer = Optional.of(Optional.of("Java Programming."));
        Optional<Optional> emptyOptionalContainer = Optional.of(Optional.of("Java Programming."));
        
        Function<String, String> function1 = s -> s.substring(0, 0).length() == 0 ? null : s;
        Function<String, String> function2 = s -> s.substring(0, 4);
        System.out.println(optionalContainer.map(optional -> optional.map(function2)));//Optional[Optional[Java]]
        System.out.println(optionalContainer.flatMap(optional -> optional.map(function2)));//Optional[Java]
        System.out.println(emptyOptionalContainer.flatMap(optional -> optional.map(function1)));//Optional.empty
 

        System.out.println("\nOptional.orElse()\n");
        // orElse() - Return the value if present, otherwise return other.
        System.out.println(nonEmptyOptional.orElse("Devash Varma"));
        System.out.println(emptyOptional.orElse("Devash Varma"));

        System.out.println("\nOptional.orElseGet()\n");
        /* orElseGet - Return the value if present, otherwise invoke other 
        and return the result of that invocation.*/
        /*----------------------------------------------------------*/
        Supplier<String> supplier = () -> "Ravi Chandran";
        System.out.println(nonEmptyOptional.orElseGet(supplier));
        System.out.println(emptyOptional.orElseGet(supplier));


        System.out.println("\nOptional.orElseThrow()\n");
         // orElseThrow() - Return the contained value, if present, otherwise 
        //throw an exception to be created by the provided supplier.
        /*----------------------------------------------------------*/
        System.out.println(nonEmptyOptional.orElseThrow(NullPointerException::new));
        System.out.println(emptyOptional.orElseThrow(NullPointerException::new));
}

}
    

