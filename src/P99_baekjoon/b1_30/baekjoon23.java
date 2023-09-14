package P99_baekjoon.b1_30;

import java.util.Scanner;

public class baekjoon23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] basket = new int[N];

        for (int i = 0; i < M; i++) {
            int from = sc.nextInt() -1;
            int to = sc.nextInt() -1;
            int k = sc.nextInt();

            for (int j = 0; j < to; j++) {
                basket[j] = k;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
