package P99_baekjoon.b1_30;

import java.util.Scanner;

public class baekjoon22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        a = a.trim();
        if (a.isEmpty()) {
            System.out.println(0);
        } else {
            String[] c = a.split(" ");
            System.out.println(c.length);
        }



        /*
        String c = a.trim();
        String[] b = c.split(" ");
        System.out.println(b.length);
         */


    }
}
