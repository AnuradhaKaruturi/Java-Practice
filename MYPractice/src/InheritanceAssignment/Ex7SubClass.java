/*
package InheritanceAssignment;

import ClassObjectAssignment.Ex7Class;
import InterfaceAssignment.Exercise7;

public class Ex7SubClass  extends Ex7Class {   //Ex7Class from ClassObject Assignment
         
        Exercise7 displayProtected(){
            Ex7Class exObj = new Ex7Class();
            InnerEX7Class innObj = exObj.new InnerEX7Class();
            innObj.num();
            innObj.innerEx7Method();
            return innObj;
        }

        public static void main(String[] args) {
            Ex7SubClass subObj = new Ex7SubClass();
            Exercise7 ex =  subObj.displayProtected();
            System.out.println(ex);
        }
    
}
*/