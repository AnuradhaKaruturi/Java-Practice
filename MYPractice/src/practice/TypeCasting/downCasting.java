package practice.TypeCasting;

public class downCasting {
    
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();


        Animal animal = new Cat();
        String animalVar = ((Cat) animal).ca;
        System.out.println(animalVar);
       // animal.meow();
       if(animal instanceof Cat){
        ((Cat) animal).meow();
    }
    }
}

class Animal{
    String an ="animal";
    void eat(){
        System.out.println("Animal eating..");
    }
    void sleep(){
        System.out.println("Animal is sleeping..");
    }

}

class Cat extends Animal{
    String ca = "cat";
    void meow(){
        System.out.println("inside cat meow");
    }

    void eat(){
        System.err.println("cat eating");
    }
}

