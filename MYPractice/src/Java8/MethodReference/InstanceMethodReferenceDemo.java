package Java8.MethodReference;

interface AddInterface {
    public   void add(int x, int y) ;
}

class Addition {

	public void sum(int a, int b) {
	    System.out.println("The sum is :"+(a+b));
	}
}

public class InstanceMethodReferenceDemo {

    public static void main(String[] args) {

        Addition obj = new Addition();
         //using lambda
         AddInterface adds = (a,b) -> System.out.println("The sum is :"+(a+b));
        adds.add(5, 8);
 
        //using MethodReference
         AddInterface addnum = obj::sum;
         addnum.add(6, 3);
        
    }   
}
