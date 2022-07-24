
package InheritanceAssignment;
class Counter{
    int i = 0;

    public void increment() {
        for (i = 0; i < 3; i++) {

        }
        System.out.println("i = " + i);

    }
}


public class CounterClass extends Counter {
    public static void main(String[] args) {
        CounterClass counterObj = new CounterClass();
        counterObj.increment();
        
    }
}
