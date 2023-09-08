package ch15collection.lecutre;

import java.util.HashSet;
import java.util.Set;

public class C07set {
    public static void main(String[] args) {
        // set : 객체(item, element, 원소, 요소)를 담고 있는 객체
        // 특징 : 중복된 element를 저장하지 않음

        // add : 추가
        Set set1 = new HashSet();
        set1.add("java");
        set1.add("spring");
        set1.add("react");
        set1.add("java");

        // size : 갯수
        System.out.println(set1.size()); // 3

        // contains : 있는지 확인 ( true, false )로 반환
        System.out.println(set1.contains("java"));
        System.out.println(set1.contains("html"));

        // remove : 삭제
        boolean remove1 = set1.remove("java");
        boolean remove2 = set1.remove("html");

        System.out.println("remove1 = " + remove1);
        System.out.println("remove2 = " + remove2);

        System.out.println(set1.size());

        // of : 수정할 수 없는 새로운 set 객체 만듬
        Set<String> set2 = Set.of("css", "react", "html");
//        set2.add("java"); // 불가

        // 전체 탐색
        // 향상된 for문
        for (String str : set2) {
            System.out.println(str);
        }

        // forEach
        System.out.println("forEach로 전체 탐색");
//        set2.forEach(item -> System.out.println(item));
        set2.forEach(System.out::println);



    }
}

