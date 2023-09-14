package P98leetCode.p01_p10.p08;

import java.util.*;
import java.util.stream.Collectors;

public class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
/*
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
*/

        Map<Integer, Long> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(num -> num,
                        Collectors.counting()));
        int sum = list.values()
                .stream()
                .map(n -> (n) * (n - 1) / 2)
                .mapToInt(n -> n.intValue())
                .sum();
        return sum;

    }
}
