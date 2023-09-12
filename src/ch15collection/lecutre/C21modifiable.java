package ch15collection.lecutre;

import java.util.HashMap;
import java.util.Map;

public class C21modifiable {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "흥민", 7,
                "강인", 10,
                "민재", 30);
        Map<String, Integer> map2 = new HashMap<>(map);

        map2.put("지성", 13);

        System.out.println("map.size() = " + map.size());
        System.out.println("map2.size() = " + map2.size());
        
    }
}
