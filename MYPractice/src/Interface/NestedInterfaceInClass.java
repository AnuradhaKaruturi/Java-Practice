package practice.Interface;
//interface inside class
 class OuterClass {

    static int Num(){
        return 100;
    }

    interface InnerInterface{
		void innerMethod();
	}
}

class ImplementingClass implements OuterClass.InnerInterface{
	public void innerMethod() {
		System.out.println("This is InnerInterface method");
	}
    
    int Area(int l,int b){
        return 1*b;
    }

}

public class NestedInterfaceInClass extends ImplementingClass {

	public static void main(String[] args) {
		ImplementingClass obj = new ImplementingClass();
		System.out.println(OuterClass.Num());
		obj.innerMethod();
        obj.Area(5,7);
	}

}
