package ch15collection.lecutre;

import java.util.ArrayList;
import java.util.List;

public class C16unmodifiable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("spring");
        list.add("html");

        list.remove(1);

        // 수정 불가 리스트 만들기
        List<String> list2 = List.of("java", "react", "css");
//        list2.add("vue");     // 추가 불가
//        list.remove("java");  // 삭제 불가

        System.out.println();
    }
}
