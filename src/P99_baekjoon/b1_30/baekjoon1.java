package P99_baekjoon.b1_30;

import java.util.Scanner;

public class baekjoon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int maxIndex = -1;
        for(int i = 0; i < 9; i++) {
            System.out.print("숫자 입력해주세요 >");
            int num = sc.nextInt();

            if(max < num) {
                max = num;
                maxIndex = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);

        sc.close();
    }
}
