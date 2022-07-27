package practice.NestedClasses;
public class TopLevelClass {
    public static void main(String[] args) {
        //package examples
        OuterClass outobj = new OuterClass();//can create obj for class of another file within this package
      //  EncapsulationTest encaptestObj = new EncapsulationTest();  cannot create obj for class from another package
    }

    void accessMembers(OuterClass outer) {     
        
        System.out.println(outer.outer);
        System.out.println(OuterClass.staticOuter);
    }  
}
