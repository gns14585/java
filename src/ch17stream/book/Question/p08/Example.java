package ch17stream.book.Question.p08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> collect = list.stream()
                .collect(Collectors.groupingBy(s -> s.getJob()));

        System.out.println("[개발자]");
        List<Member> dev = collect.get("개발자");
        list.stream()
                .filter(m -> m.getJob().equals("개발자"))
                        .forEach(s -> System.out.println("name : " + s.getName() + " : " + "job : " + s.getJob()));

        System.out.println("[디자이너]");
        List<Member> dis = collect.get("디자이너");
        list.stream()
                .filter(e -> e.getJob().equals("디자이너"))
                .forEach(s -> System.out.println("name : " + s.getName() + " job : " + s.getJob()));
    }
}
