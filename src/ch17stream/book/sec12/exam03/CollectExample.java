package ch17stream.book.sec12.exam03;

import ch17stream.book.sec12.exam01.Student;

import java.util.*;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("김자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        Map<String, Double> map1 = totalList.stream()
                .collect(Collectors.groupingBy(s -> s.getSex(),
                        Collectors.averagingDouble(c -> c.getScore())));
        System.out.println(map1);


        // filter 사용해서 남, 여 따로 출력 가능
        Map<String, Double> map = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .collect(Collectors.groupingBy(s -> s.getSex(),
                        Collectors.averagingDouble(c -> c.getScore())));
        System.out.println(map);

        Map<String, Double> map2 = totalList.stream()
                .filter(s -> s.getSex().equals("여"))
                .collect(Collectors.groupingBy(s -> s.getSex(),
                        Collectors.averagingDouble(s -> s.getScore())));
        System.out.println(map2);
    }
}
