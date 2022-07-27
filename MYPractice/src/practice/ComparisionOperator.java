package practice;
class ComparisionOPerator{
    public static void main(String[] args) {
        /*== is an equality operator, confusingly enough,
         it does not check if two values are equal,
          it checks if they’re the same.*/ 
          char charVal = 0;
           int intVal = 0; 
         System.out.println(charVal == intVal); 
         //System.out.println(charVal === intVal);
         // true. But be wary whenever floating point is involved. 
         float floatVal = 0.0f; 
         System.out.println(charVal == floatVal);
         String a = "abcd";
         String b = "abcd";
         System.out.println(a == b); 
         char x = 'p';
         int d = x << 2;
         System.out.println(d);

         int r = 10, s = 8;
        int one =  ++r-s--;     
        int two = r%s++ ;   
        int three =r*=s+5 ;    
        int four = 69>>>2;

    }
  }

