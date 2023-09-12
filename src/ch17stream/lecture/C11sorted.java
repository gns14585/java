package ch17stream.lecture;

import java.util.List;

public class C11sorted {
    public static void main(String[] args) {
        var list = List.of(10,35,1,8,5,7,9);

        System.out.println("가장 큰 값");
        list.stream()
                // o2 - o1 역순 , o1 - o2 오름차순
                .sorted((o1, o2) -> o2 - o1)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("가장 작은 값");
        list.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);
    }
}
