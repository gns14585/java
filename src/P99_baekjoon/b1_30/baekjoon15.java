package P99_baekjoon.b1_30;

import java.util.Scanner;

public class baekjoon15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bottom = sc.nextInt(); // 둘째
        int middle = sc.nextInt(); // 막내

        int a = middle - bottom;

        System.out.println(a + middle);


    }
}
