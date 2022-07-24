package practice.Interface;

//protected,private modifers can't be given only public and abstract are permitted
    //interface inside another interface
 interface OuterInterface {  //

  void outerMethod();

  default void outerDefaultMethod(){
    System.out.println("Default method of outerDefaultMethod");
  }
	
	interface InnerInterface{
     void innerMethod();

     default  void innerDefaultMethod(){
      System.out.println("Default method of innerDefaultMethod");
     }

	}
    
}

class OnlyOuter implements OuterInterface{
	public void outerMethod() {
		System.out.println("This is OuterInterface method");
	}
}

class OnlyInner implements OuterInterface.InnerInterface{
	public void innerMethod() {
		System.out.println("This is InnerInterface method");
	}
}

public class NestedInterfaceInInterface {

	public static void main(String[] args) {
		OnlyOuter obj_1 = new OnlyOuter();
		OnlyInner obj_2 = new OnlyInner();
		
		obj_1.outerMethod();
    obj_1.outerDefaultMethod();
  
		obj_2.innerMethod();
    obj_2.innerDefaultMethod();
   
	}

}

