

package ClassObjectAssignment;

import InterfaceAssignment.Exercise7;

public class Ex7Class {

    void dis(){
        System.out.println("dis");
    }

    protected class InnerEX7Class implements Exercise7    //Ex7Interface from Interface Assignment
    {
        public void num() {
            System.out.println("NUM method in InnerEx7 inner class"); 
        }

        public void innerEx7Method(){
            System.out.println("innerEx7 method");
        }
       
    }
        

}
    
    
    
    
    

