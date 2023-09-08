package ch15collection.book.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("spring");
        set.add("JDBC");
        set.add("JSP");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

            if (element.equals("java")) {
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("JSP");

        for (String e1:set) {
            System.out.println(e1);
        }
    }
}
