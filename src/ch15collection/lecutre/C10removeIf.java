package ch15collection.lecutre;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C10removeIf {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("spring");
        set.add("css");
        set.add("jsp");

        set.removeIf(e -> e.equals("css"));

        /*
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("jsp")) {
                iterator.remove();
            }
        }
        */
        System.out.println("set = " + set);

    }
}
