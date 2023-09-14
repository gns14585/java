package P99_baekjoon.b1_30;

import java.util.Scanner;

public class baekjoon11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int[] a = new int[number];

        int count = 0;
        for (int i = 0; i < number; i++) {
            a[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        for (int i = 0; i < number; i++) {
            if (a[i] == v) {
                count++;
            }
        }
        System.out.println(count);


    }
}
