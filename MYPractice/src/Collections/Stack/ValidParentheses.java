package Collections.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String with '(','[','{','}',']',')' characters to check whether it is valid String or not ");
        String input =  sc.nextLine();
        validString(input);
        sc.close();

    }

    private static void validString(String input) {

        Stack<Character> stack = new Stack<Character>();  //declare a stack
        char[] charArr = input.toCharArray();  //convert given string to character Array
        for(Character c : charArr){           //for all elements in Array

            if(c == '(' || c == '{' || c == '['){  //if charcter is opening parenthesis
                stack.push(c);               //push to stack
            }

            else{  //when closing parenthesis encounters it should match with opening parenthesis
               
                if(stack.empty()) {    //so stack cannot be empty
                    System.out.println(input + " contains invalid parentheses.");
                    return;
                  }
                  else{
                      Character top = stack.peek();//if input char is closing parenthesis and top element of stack is opening parenthesis 
                      if(c == ')' && top == '(' || c == '}' && top == '{' || c == ']'&& top == '['){
                      stack.pop(); //we can pop the top element
                      }
                      else{
                        System.out.println(input + " contains invalid parentheses.");
                         return;
                      }
                  }


            }

        }
        //  Checking the status of the stack to determine the
    //  validity of the string.
    if(stack.empty()) {
        System.out.println(input + " contains valid parentheses.");
      }
      else{
        System.out.println(input + " contains invalid parentheses.");
      }

    }
    
}
