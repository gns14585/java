package ch15collection.lecutre;

import java.util.HashSet;
import java.util.Set;

public class C08set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("kangin");
        set.add("min jae");

        set.forEach(System.out::println);


    }
}
