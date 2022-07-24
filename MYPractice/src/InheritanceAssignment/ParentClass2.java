
package InheritanceAssignment;
class ParentClass2{
  
    private void PrintParent(){
        System.out.println("This is Parent class");
    }
    public static void main(String[] args) {
        ParentClass2 parentObj = new ParentClass2();
        ChildClass2  childObj = new ChildClass2();
       parentObj.PrintParent();
        childObj.PrintChild();
     //childObj.PrintParent();
 }
}
 
 class ChildClass2 extends ParentClass2{
 
     public void PrintChild(){
         System.out.println("This is Child class");
     }
    }
 
