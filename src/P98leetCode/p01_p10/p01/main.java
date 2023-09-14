package P98leetCode.p01_p10.p01;

import java.util.ArrayList;
import java.util.List;

public class main {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;

        for(int candy:candies) {
            max = Math.max(candy, max);
        }

        for(int candy:candies) {
            list.add((candy + extraCandies) <= max);
        }
        return list;
    }
}
