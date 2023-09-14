package P99_baekjoon.b1_30;

import java.util.Scanner;

public class baekjoon4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h = sc.nextInt(); // 시간
        int m = sc.nextInt(); // 분
        int add = sc.nextInt(); //더하는 값

        if(add+m>=60) {
            h+=(m+add)/60;
            m=(m+add)%60;
            if(h>=24) {
                h=h-24;
            }
        }else if(add+m<60 && add+m>0) {
            m+=add;
        }
        System.out.println(h + " " + m);
    }
}
