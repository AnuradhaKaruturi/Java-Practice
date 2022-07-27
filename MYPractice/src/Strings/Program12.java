package Anuradha.Strings;

//Clear the StringBuffer
public class Program12 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("This ");
        sb.append("is ");
        sb.append("String");
        sb.append("Buffer ");
        sb.append("class.");
        System.out.println("Appended String is: " + sb);
        sb.delete(0, sb.length());
        System.out.println("After delete(0,sb.length()): " + sb);
    }
}