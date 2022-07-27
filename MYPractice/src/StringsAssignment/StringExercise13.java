package StringsAssignment;

public class StringExercise13 {
    public static void main(String[] args) {
    StringBuffer str = new StringBuffer();
    str.append("Hi ");
    str.append("welcome");
    str.append("to string Buffer");
    str.append("setlength Program");
    System.out.println("String is : "+str);
    System.out.println("Length of the String is : "+str.length());
    str.setLength(0);  //setting length to 0
    System.out.println("Length of the String after using setLength : "+str.length());
    System.out.println("String after setLength : "+str);
    }
}
