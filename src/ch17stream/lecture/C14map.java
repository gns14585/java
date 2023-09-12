package ch17stream.lecture;

import java.util.List;

public class C14map {
    public static void main(String[] args) {
        var list = List.of("java", "css", "react", "spring");

        System.out.println("각 글자 수 출력");
        list.stream()
                .map(x -> x.length())
                .forEach(System.out::println);
    }
}
