package ch17stream.lecture;

import java.util.List;

public class C12filter {
    public static void main(String[] args) {
        var list = List.of(3,1,4,9,10,33,2);

        list.stream()
                // 첫번째 e는 매개변수 , -> 람다식 ,
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);

        System.out.println("짝수 중 가장 작은 값");
        list.stream()
                .filter(e -> e%2 ==0)
                .sorted()
                .limit(1)
                .forEach(System.out::println);

        System.out.println("홀수 중 가장 큰 값");
        list.stream()
                .filter(e -> e % 3 == 0)
                .sorted((o1, o2) -> o2 - o1)
                .limit(1)
                .forEach(System.out::println);

    }
}
