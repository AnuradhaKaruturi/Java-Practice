package Anuradha.Strings;

//Find All the Permutations of a String
public class Program29 {
    public static void main(String[] args) {
        //passing add to the string
        String string = "add";
        //appending string to Buffer
        StringBuffer sb = new StringBuffer(string);
        //passing buffer and index as 0 to the method
        performPermutations(sb, 0);
    }

    //method to perform permutation of string and the index to move in between characters
    public static void performPermutations(StringBuffer sb, int index) {
        //if index==string length then it prints the string. This case its 3==3
        if (index == sb.length()) {
            System.out.println("String is: " + sb);
        }
        //if index!=length 0!=3, enters the loop
        else {
            //here is the recursive function, parameters passed are string and index=0+1
            performPermutations(sb, index + 1);
            //looping through string to perform permutations
            for (int i = index + 1; i < sb.length(); i++) {
                //calling swapping function. Permutation meaning swapping characters with each other
                // until every possibility is checked
                swap(sb, index, i);
                //again recursive function is called sb,0+1
                performPermutations(sb, index + 1);
                //again swap function is called here sb,0,0+i
                //meaning swapping characters at that index with another to that index
                swap(sb, index, i);
            }
        }
    }

    //swap method needs a string and two positions
    //one to swap and one to store the swap positions character
    public static void swap(StringBuffer sb, int ind1, int ind2) {
        //to swap a temp variable is used
        char temp = sb.charAt(ind1);
        //swapping position 1 to character index position 2 using charAt(index)
        sb.setCharAt(ind1, sb.charAt(ind2));
        //putting A's index position into B's index position
        //A=B-->B=A using temp
        sb.setCharAt(ind2, temp);
    }
    /*
         add = 6
         Mango permutation count = 119
         Funny = 120
     */
}
