package P98leetCode.p01_p10.p02;

import java.util.ArrayList;
import java.util.List;

public class Solution1046 {
    public int lastStoneWeight(int[] stones){
        List<Integer> list = new ArrayList<>();

        for(int stone : stones) {
            list.add(stone);
        }

        while(list.size() > 1) {
            list.sort((o1, o2) -> o2 - o1);

            int stone1 = list.remove(0);
            int stone2 = list.remove(0);

            int diff = stone1 - stone2;
            if (diff > 0) {
                list.add(diff);
            }
        }

        return list.get(0);
    }
}
