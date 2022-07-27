package practice.NestedClasses;
public class LocalNestedClass {
    int a = 10;
    int b = 20;
    void AddData(){
        int sum = a+b;
        System.out.println(sum); 
        class LocalClass{
            int diff;
            int prod;
            
            int getDiff(){
                diff = a-b;
                return diff;
            }
            int getProd(){
                prod = a*b;
                return prod;
            }          
        }
        LocalClass local = new LocalClass();
        System.out.println(local.getDiff());
        System.out.println(local.getProd());
    }
      public static void main(String[] args) {
          LocalNestedClass localnested = new LocalNestedClass();
          localnested.AddData();
      }  

    }

