package Collections.ArrayList.ArrayListCodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountFrequencyOfElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of TestCases :");
        int no_of_testcases = sc.nextInt();

        while(no_of_testcases--  >  0)
        {
        ArrayList<Character> charlist = new ArrayList<Character>();
         
        System.out.println("enter number of queries :");
        int quires = sc.nextInt();

            while(quires--  >  0){

                char c = sc.next().charAt(0);

                if(c == 'i'){
                    char ch = sc.next().charAt(0);
                    insert(charlist, ch);
                }

                if(c == 'f'){
                    char ch = sc.next().charAt(0);
                    freq(charlist, ch);
                }

            }
         }
            sc.close();
    }

        private static void freq(ArrayList<Character> charlist, char ch) {
            if(charlist.contains(ch)){
                System.out.println(Collections.frequency(charlist, ch));
            }
            else{
                System.out.println("Not Present");
            }
        }

    private static void insert(ArrayList<Character> charlist, char ch) {
        charlist.add(ch);
    }
    
}

/*output
enter number of TestCases :
2
enter number of queries :
6
ieieigidieif
e
i
g
i
e
i
d
i 
e
f
e
3
enter number of queries :
4
i 
e
i
e
f  
e
2
*/