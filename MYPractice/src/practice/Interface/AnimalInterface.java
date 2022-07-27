package practice.Interface;

interface AnimalInterface {     //interface Animal
    int group = 5;             //public static final variable
    void travels();  
              // abstarct method 
    default void greetMessage(){        //default greetMessage  method
        System.out.println("Greet in Animal Interface");
    }

    default void display(){           //default Display method
        System.out.println("No of animals in group inside Animal Interface:"+group);

    }
    static int Num(){          //static method
        return 100;
    }
   /* AnimalInterface(){           //interfaces can't have constructors

    }*/
   /* final void finalMethod(){      //public,private,abstarct,default,strictfp and static modifiers are allowed
        
    }*/
}




interface ClassificationOfAnimals{      //interface     Clasification Animals
    void eatingHabits();                // abstarct method 
    void placeOfLiving();                // abstarct method 
    void backbone();                     // abstarct method 

    default void print(){              //default method
        System.out.println("print method");
    }              

    default void greetMessage(){          //default method
        System.out.println("Greet in ClassificationAnimals Interface");
    }

    static void staticDisplay(){          //static method
        System.out.println("Ststic method of ClassificationAnimals Interface");
    }
    
}