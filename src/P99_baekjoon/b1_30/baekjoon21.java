package P99_baekjoon.b1_30;

import java.util.Scanner;

public class baekjoon21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
