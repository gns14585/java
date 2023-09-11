package ch15collection.lecutre;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C09iterator {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("spring");
        set.add("css");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("element = " + element);
            if (element.equals("java")) {
                iterator.remove();
            }
        }
        System.out.println();

        for (String e : set) {
            System.out.println("e = " + e);
        }

        /*
        for (String e : set) {
            // 반복문 사용 중 collections 아이템 삭제시 exception 발생 할 수 있음
            // 다만 실제 코딩 할 때 이런 코딩 할 일이 거의 없음
            System.out.println("e = " + e);
            if (e.equals("css")) {
                set.remove("css");
            }
        }
        */
    }
}
