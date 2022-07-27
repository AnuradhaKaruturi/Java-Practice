package Anuradha.Strings;

//Find maximum and minimum occurring character in String
public class Program35 {
    public static void main(String[] args) {
        String str = "This is Java Program.";
        //Taking an array of length, of String
        int[] rep = new int[str.length()];
        //passing first character
        char min_Ch = str.charAt(0);
        //passing first character
        char max_Ch = str.charAt(0);
        //for min count
        int min;
        //for max count
        int max;
        //converting string to char array
        char string[] = str.toCharArray();
        //looping through array
        for (int i = 0; i < string.length; i++) {
            //rep array of every index is set to 1
            rep[i] = 1;
            //checking with i=0,1,2... to remaining array elements
            for (int j = i + 1; j < string.length; j++) {
                //string[0,1,2...] == string[1,2,3...] equal
                //and it should be a space character or 0
                if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
                    //then rep[i] increments to 1
                    rep[i]++;
                    //string[j] is set to '0'
                    string[j] = '0';
                }
            }
        }
        //min and max are set to rep[0]
        min = rep[0];
        max = rep[0];
        //looping through rep array
        for (int i = 0; i < rep.length; i++) {
            //if min value is > rep[0,1,2...]
            if (min > rep[i] && rep[i] != '0') {
                min = rep[i];
                //min occurring character is string[i]
                min_Ch = string[i];
            }
            //if max value is < rep[0,1,2...]
            if (max < rep[i]) {
                max = rep[i];
                //max occurring character is string[i]
                max_Ch = string[i];
            }
        }
        //Printing characters
        System.out.println("Minimum occurring character: " + min_Ch);
        System.out.println("Maximum occurring character: " + max_Ch);
    }
}