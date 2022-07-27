package StringsAssignment;

public class StringExercise6 {

    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String s3 = "Java";
        String str = new String("java");
        String str1 = new String("java");
    
       if(s1.equals(s2)){
           System.out.println("S1 && S2 are Equal");
       }
       else{
        System.out.println("S1 && S2 are Not Equal");
       }
       if(s1.equals(s3)){
        System.out.println("S1 && S3 are Equal");
        }
        else{
        System.out.println("S1 && S3 are Not Equal");
       }
       if(s1.equals(str)){
        System.out.println("S1 && Str are Equal");
       }
      else{
     System.out.println("S1 && Str are Not Equal");
       }
       if(str.equals(str1)){
        System.out.println("Str && Str1 are Equal");
       }
      else{
     System.out.println("Str && Str1 are Not Equal");
       }

    }
    
}
/*S1 && S2 are Equal
S1 && S3 are Not Equal
S1 && Str are Equal
Str && Str1 are Equal */
