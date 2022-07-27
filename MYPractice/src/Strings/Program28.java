package Anuradha.Strings;

//Find the longest repeating Sequence in a String

public class Program28 {
    public static String countSequence(String string, String string2) {
        int count = Math.min(string.length(), string2.length());
        for (int i = 0; i < count; i++) {
            if (string.charAt(i) != string2.charAt(i)) {
                return string.substring(0, i);
            }
        }
        return string.substring(0, count);
    }

    public static void main(String[] args) {
        //string to compare sequence
        String string = "Beginning";
        //empty string to store most repeating sequence
        String string2 = "";
        //storing the length
        int len = string.length();
        //to check with a letter index at each iteration
        for (int i = 0; i < len; i++) {
            //checking other letters with i
            for (int j = i + 1; j < len; j++) {
                //passing the repeat sequence and checking as substring of the string
                String sequence = countSequence(string.substring(i, len), string.substring(j, len));
                //if the sequence length>string2.length=0
                if (sequence.length() > string2.length())
                    //passing sequence to string2
                    string2 = sequence;
            }
        }
        //printing the repeat sequence
        System.out.println("Longest repeating sequence: " + string2);
    }
}