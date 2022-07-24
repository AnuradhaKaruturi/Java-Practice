package ExceptionHandlingAssignment;
public class ExceptionProgram16 {
    public static void main(String[] args) {
      
        CloneDemo t1 = new CloneDemo("Anu");
        t1.display();
        try {
            CloneDemo t2 = (CloneDemo)t1.clone();  
            t2.display();  
        }
        catch (CloneNotSupportedException a) {
            a.printStackTrace();
        }  
    }
    
}

 
class CloneDemo //implements Cloneable
{
 
    private String name;
 
    public CloneDemo(String name)
    {
        super();
        this.name = name;
    }
 
    public void display(){
       System.out.println(name);
    }
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}
 
    