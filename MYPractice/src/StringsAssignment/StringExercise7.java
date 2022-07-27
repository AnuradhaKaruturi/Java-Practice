package StringsAssignment;

public class StringExercise7 {
    public static void main(String[] args) {
        String str = new String("java");
        String str1 = new String("java");
        if(str == str1){
            System.out.println("Str && Str1 are Equal");
           }
          else{
         System.out.println("Str && Str1 are Not Equal");
           }
           if(str == str){
            System.out.println("Str && Str are Equal");
           }
          else{
         System.out.println("Str && Str are Not Equal");
           }
    }
    
}

/*Str && Str1 are Not Equal
Str && Str are Equal
*/
