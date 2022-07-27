package practice.TypeCasting;

public class TypeConversions {
    
    public static void main(String[] args) {

        //String to int,float Conversion
        String st = "100";
        int intnum = Integer.parseInt(st);
        System.out.println(intnum);
        int intnumVal = Integer.valueOf(st);
        System.out.println(intnumVal);
        float floatnum = Float.parseFloat(st);
        System.out.println(floatnum);
        float floatnumVal = Float.valueOf(st);
        System.out.println(floatnumVal);

        //Int to string Conversion

        int five = 5;
        String str = String.valueOf(five);
        System.out.println(str);
        String strr = Integer.toString(five);
        System.out.println(strr);

        //String.format()
        int sum = 20;

        String strng = String.format("%d", sum);
        System.out.println(strng);
    }


}
