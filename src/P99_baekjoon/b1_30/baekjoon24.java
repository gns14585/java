package P99_baekjoon.b1_30;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();

        if (A == B) {
            System.out.println(0);
        } else if (A < B) {
            System.out.println(B - A - 1);
            for (long i = A + 1; i < B; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println(A - B - 1);
            for (long i = B + 1; i < A; i++) {
                System.out.print(i + " ");
            }
        }
        /*
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = Math.abs(A - B);
        if (A == B) {
            System.out.println(count);
        } else {
            System.out.println(count-1);
        }

        Arrays.sort(A);
        Arrays.sort(B);

        if (A < B) {
            for (int i = A+1; i < B; i++) {
                System.out.println(i + " ");
            }
        } else if(A > B) {
            for (int i = A-1; i > B; i--) {
                System.out.println(i + " ");
            }
        }
       */

    }
}
