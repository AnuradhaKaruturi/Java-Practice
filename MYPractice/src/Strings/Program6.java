package Anuradha.Strings;

//Compare Strings using equals() method
public class Program6 {
    public static void main(String[] args) {
        String s1 = "Cherry";
        String s2 = s1;

        String st1 = new String("Mango");
        String st2 = st1;

        String s3 = "WaterMelon";
        String s4 = s3.toLowerCase();

        String str1 = new String("Mango");
        String str2 = new String("MaNgo");

        System.out.println("Is s1.equals(s2): " + s1.equals(s2));//true
        System.out.println("Is st1.equals(st2): " + st1.equals(st2));//true
        System.out.println("Is s3.equals(s4): " + s3.equals(s4));//false
        System.out.println("Is st1.equals(str1): " + st1.equals(str1));//true
        System.out.println("Is str1.equals(str2): " + str1.equals(str2));//false
        System.out.println("Is str1.equals(str2): " + str1.equalsIgnoreCase(str2));//true
    }
}
