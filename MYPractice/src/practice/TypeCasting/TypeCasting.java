package practice.TypeCasting;

public class TypeCasting {

    public static void main(String[] args) {
        int num = 10;
        float side = 20f;
        double  area = num; //implicit casting

        int number = (int) side; //explicit casting

        int sum = (int)(10+20f+30.0);
    }
    
}
