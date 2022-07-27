package StringsAssignment;

public class StringExercise12 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("Hi ");
        str.append("i am");
        str.append("String Buffer");
        str.append("delete Program");
        System.out.println("String is : "+str);
        //usind delete

        str.delete(0, str.length()); //deleting the string with  length of str.length
        System.out.println("String after clearing is :"+str);
    }
    
}
