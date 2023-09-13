package ch17stream.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C22collect {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "css", "html");

        List<Integer> res1 = new ArrayList<>();
        for (String str : list) {
            res1.add(str.length());
        }
        System.out.println("res1 = " + res1); // res1 = [4, 6, 3, 4]

        List<String> res2 = list.stream()
                .map(String::intern)
                .collect(Collectors.toList());
        System.out.println("res2 = " + res2); // res2 = [java, spring, css, html]

        Set<Integer> res3 = list.stream()
                .map(String::length)
                .collect(Collectors.toSet());
        System.out.println("res3 = " + res3); // res3 = [3, 4, 6]

        Map<String, Integer> collect = list.stream()
                .collect(Collectors.toMap(x -> x, String::length));
        System.out.println("collect = " + collect); // collect = {spring=6, css=3, java=4, html=4}

        Map<String, Integer> collect1 = list.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println("collect1 = " + collect1); // collect1 = {spring=6, css=3, java=4, html=4}
    }
}
