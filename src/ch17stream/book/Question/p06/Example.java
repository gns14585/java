package ch17stream.book.Question.p06;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("김자바" , 26)
        );

        double avg = list.stream()
                .map(Member::getAge)
                .reduce(0, Integer::sum);
        System.out.println("avg = " + avg);

        //
        System.out.println("가장 많은 나이 구해서 출력");

        Integer maxage = list.stream()
                .map(Member::getAge)
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("maxage = " + maxage);

        System.out.println("가장 적은 나이 구해서 출력");

        Integer minage = list.stream()
                .map(Member::getAge)
                .reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("minage = " + minage);


    }
}
