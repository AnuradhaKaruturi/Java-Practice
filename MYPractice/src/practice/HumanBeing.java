package practice;
public class HumanBeing {
    String nature = "kind";
    String behaviour = "good";
    String gender = "Female";
    String  type = "person";
    int idnum = 66;
    public static void main(String[] args) { //testing
        HumanBeing obj = new HumanBeing();
        System.out.println("Qualities Described are: " + obj.nature + ", " + obj.behaviour + ", "+obj.gender + ", "+obj.type + ", "+obj.idnum );
    }
   
}
