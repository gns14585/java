package P98leetCode.p01_p10.p05;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {
    public int numJewelsInstones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            jewelSet.add(c);
        }
        int cnt = 0;
        for (char d : stones.toCharArray()) {
            if (jewelSet.contains(d)) cnt++;
        }

        return cnt++;




    }
}
