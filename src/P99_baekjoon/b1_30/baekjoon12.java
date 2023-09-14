package P99_baekjoon.b1_30;

import java.util.Scanner;

public class baekjoon12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int piece;
        int[] chesspiece = {1, 1, 2, 2, 2, 8};
        int[] check = new int[6];

        for (int i = 0; i < chesspiece.length; i++) {
            piece = sc.nextInt();
            if (piece <= 0) {
                check[i] = chesspiece[i] + piece;
            } else {
                check[i] = chesspiece[i] - piece;
            }
        System.out.print(check[i] + " ");
        }


    }
}
