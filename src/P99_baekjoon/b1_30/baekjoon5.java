package P99_baekjoon.b1_30;

import java.util.Scanner;

public class baekjoon5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int[] alphabetPositions = new int[26]; // 알파벳 개수(26)만큼 배열 생성하고 초기값은 -1로 설정

        for (int i = 0; i < 26; i++) {
            alphabetPositions[i] = -1;
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int index = c - 'a'; // 알파벳의 아스키 코드 값에서 'a'의 아스키 코드 값을 뺍니다.

            if (alphabetPositions[index] == -1) {
                alphabetPositions[index] = i;
            }
        }

        for (int position : alphabetPositions) {
            System.out.print(position + " ");
        }
    }
}
