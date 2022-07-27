package practice.Inheritance;

public class UIprogrammer extends Programmer{
  /* cannot override final method
    final void display(){
        System.out.println("final Display method in UIProgrammer ");
    }
    */
    public static void main(String[] args) {
        UIprogrammer UIobj = new UIprogrammer();
        UIobj.name = "UIProgram";
        UIobj.age = 26;
        UIobj.salary = 50000;
        UIobj.language = "French";
        UIobj.printData();
        Programmer.Data();
        UIobj.emp();

    }
    
}
