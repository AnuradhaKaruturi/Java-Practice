package ExceptionHandlingAssignment;
class classcast{
    String name;
    String color;

    classcast(String name){
       this.name  = name;
    }

    void display()
    {
        System.out.println("My name is :"+name);
    }

    void show(String nature) {
        System.out.println(name + " is a " + nature + " person");
    }
}


class classcastDemo extends classcast{
    
    classcastDemo(String name){
        super(name);
    }
}

public class Exceptionprogram19 {
    public static void main(String[] args) {  

        classcastDemo demo = new classcastDemo("Anu");
        demo.display();
        classcast cast = new classcast("RAM");
        cast.display();
        cast = demo;
        cast.show("good");

        classcast cast1 = new classcast("Sammy");
        classcastDemo dem = (classcastDemo)cast1;
    }
}

