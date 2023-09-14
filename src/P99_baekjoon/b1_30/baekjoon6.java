package P99_baekjoon.b1_30;

import java.util.Scanner;

public class baekjoon6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = num1 * num2;

        System.out.println(num1 * (num2%10));
        System.out.println(num1 * ((num2/10)%10));
        System.out.println(num1 * (num2/100));
        System.out.println(result);
    }
}
