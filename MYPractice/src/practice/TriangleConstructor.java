package practice;
    public class TriangleConstructor {

        int a,b;
        String str = "AA";
        void display(){
            System.out.println("Display method");
        }
        TriangleConstructor(TriangleConstructor Obj){
            
        }
        TriangleConstructor(){
            this("aaa");
           display();
           System.out.println(" default Constructor");
        }

        TriangleConstructor(int n,int m){
           a = n;
           b = m;
           System.out.println("two param");
        }
        TriangleConstructor(String str){
           this(3,7);
           this.str = str;
           System.out.println("one");
        }

        public static void main(String[] args) {
            TriangleConstructor triObj = new TriangleConstructor();
            System.out.println("---------------------");
            TriangleConstructor triObj1 = new TriangleConstructor(3,5);
            System.out.println("---------------------");
           TriangleConstructor triObj2 = new TriangleConstructor("Anu");
           
           
        }
    }







