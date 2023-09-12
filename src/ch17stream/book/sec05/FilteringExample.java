package ch17stream.book.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동"); list.add("신용권");
        list.add("김자바"); list.add("신용권"); list.add("신민철");

        System.out.println("중복제거 후 전체 출력");
        list.stream()
                .distinct()  // 중복제거
                .forEach(n -> System.out.println(n));
        System.out.println();

        System.out.println("문자열 시작 부분이 '신' 으로 시작하는 값만 출력");
        list.stream()
                .filter(n -> n.startsWith("신")) // 문자열 시작 부분이 신 으로 시작하는 값만 출력
//                .forEach(System.out::println);
                .forEach(n -> System.out.println(n)); // 출력방식은 위 아래 구분없이 편한걸로 하면됨.
        System.out.println();

        System.out.println("중복 제거 후 문자열이 '신'으로 시작하는 값만 출력");
        list.stream()
                .distinct()
                .filter(n -> n.startsWith("신")) // 문자열 시작 부분이 신 으로 시작하는 값만 출력
                .forEach(n -> System.out.println(n));
    }
}
