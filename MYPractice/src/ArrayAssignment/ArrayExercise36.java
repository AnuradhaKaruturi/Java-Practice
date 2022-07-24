
package ArrayAssignment;
public class ArrayExercise36 {

    public static void main(String[] args) {
        int a[][] = { { 6, 9, 2 }, { 8, 5, 5 }, { 3, 8, 12 } };
        int b[][] = { { 4, 7, 4 }, { 3, 5, 6 }, { 6, 6, 6 } };

        int add[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                add[i][j] = a[i][j] - b[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
