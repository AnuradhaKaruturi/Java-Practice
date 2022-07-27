package Anuradha.Strings;

import java.util.Arrays;

//Find all subsets of a string
public class Program27 {
    public static void main(String[] args) {
        //Assuming String is funny
        //Output has to be: f,fu,fun,funn,funny,u,un,unn,unny,n,nn,nny,n,ny,y
        String string = "Funny";
        int length = string.length();
        //possible subsets for string of size n is n*(n+1)/2
        int index = length * (length + 1) / 2;
        //for elements purpose of array
        int temp = 0;
        //an array to store subsets. size of the array is index
        String[] strings = new String[index];
        //looping through String. Maintaining the first letter
        for (int i = 0; i < length; i++) {
            //with i looping through remaining letters
            for (int j = i; j < length; j++) {
                //array[0]=starts with 0 index so temp=0
                //array[temp]=string.substring(0,0+1.......)
                strings[temp] = string.substring(i, j + 1);
                //temp increments by 1 till iteration breaks
                temp++;
            }
        }

        System.out.println("All the possible Subsets of String are: ");
        //Prints the subset as an Array
        System.out.println(Arrays.toString(strings));
    }
}