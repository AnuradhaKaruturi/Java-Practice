package Java8.MethodReference;

interface CheckDigit {
	public boolean checkSingleDigit(int x);
}

class IsDigit {
	public static boolean isSingleDigit(int x) {
	    return x > -10 && x < 10;
	}
}

public class StaticMethodReferenceDemo {

    public static void main(String[] args) {

        //using lambda
        CheckDigit isdigit =  (x) -> { return x > -10 && x < 10;};
        System.out.println(isdigit.checkSingleDigit(8));

    //using MethodReference
    CheckDigit isSingledigit = IsDigit::isSingleDigit;
    System.out.println(isSingledigit.checkSingleDigit(6));
        
    }
    
}
