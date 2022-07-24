package practice.Interface;

public class AnimalInterfaceDemo implements AnimalInterface,ClassificationOfAnimals {
    // inheriting interfaces animalInterface and ClassificationInterface (Multiple Inheritance)

    public void eatingHabits() { //implementing abstract method of Classification Interface
        System.out.println("Based on eating Habits they are divided into herbivores, omnivores, and carnivores");
    }

    public void backbone() {    //implementing abstract method of Classification Interface
        System.out.println("Based on backbone they are divided into vertibrates and invertibrates");
    }

    public void placeOfLiving() {   //implementing abstract method of Classification Interface
        System.out.println("Basis of place where animals live (habitat), they are classified into terrestrial, aquatic and amphibious animals");
    }
    public void travels() {   //implementing abstract method of Animal Interface
       System.out.println("Animals travel");
        
    }
    public void display(){
        AnimalInterface.super.display(); //calling display method from Animal Interface 
        System.out.println("Dispaly method inside Domestic Animal Class");
    }
    public void greetMessage(){  //overridding default method of Animal Interface and ClassificationAnimal Interface
        System.out.println("Greet overridden Message in Domestic Animal ");
        AnimalInterface.super.greetMessage(); //calling default method of AnimalInterface
        ClassificationOfAnimals.super.greetMessage(); //calling default method of Classification Interface
    }
    public static void main(String[] args) {
        AnimalInterfaceDemo domObj = new AnimalInterfaceDemo();
        domObj.backbone(); // calling abstarct method of classificationAnimal interface
        domObj.eatingHabits(); // calling abstarct method of classificationAnimal interface
        domObj.placeOfLiving(); // calling abstarct method of classificationAnimal interface
        domObj.travels();   // calling abstarct method of Animal interface
        domObj.display();  //  calling overridded default display method from AnimalInterfaceDemo
        domObj.greetMessage(); //  calling overridded default display method from AnimalInterfaceDemo
        System.out.println(AnimalInterface.Num());//calling static method of AnimalInterface
        ClassificationOfAnimals.staticDisplay();//calling static method of ClassificationAnimal Interface
        domObj.print();  //calling default method of Classification interface without overriding
        //you can access the default methods of an interface using the objects of the implementing classes.
    }

}

