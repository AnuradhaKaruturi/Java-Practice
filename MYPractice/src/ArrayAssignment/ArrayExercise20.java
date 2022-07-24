package ArrayAssignment;

import java.util.Scanner;

public class ArrayExercise20 {

    public static void main(String[] args) {

        int[] intArr = new int[10];
        int len = intArr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integer values :");
        for (int i = 0; i < len; i++) {
            intArr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Entered values are");
        for (int n : intArr) {
            System.out.print(n + " ");
        }

        int temp;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (intArr[i] > intArr[j]) {
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Even numbers in the given array are:");
        for (int i = 0; i < len; i++) {
            if (intArr[i] % 2 == 0) {
                System.out.print(intArr[i] + " ");

            }
        }

        System.out.println();
        System.out.println("Odd numbers in the given array are:");
        for (int i = 0; i < len; i++) {
            if (intArr[i] % 2 != 0) {
                System.out.print(intArr[i] + " ");

            }
        }

    }

}
