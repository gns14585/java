package ch17stream.lecture;

import java.util.List;

public class C09limit {
    public static void main(String[] args) {
        var list = List.of(3,9,10,11,1,0,-3);
        list.stream()
                .limit(3) // 1번부터 3번까지 출력
                .forEach(System.out::println);

        System.out.println();

        // 순서대로 정렬 후 limit 1번부터 3번까지 출력
        list.stream()
                .sorted()
                .limit(3) // 1번부터 3번까지 출력
                .forEach(System.out::println);
    }
}
