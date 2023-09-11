package p98leetCode.p08;

import java.util.HashMap;
import java.util.Map;

public class Solution1512 {
    public int numIdenticalPairs(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}

record Person(String name, int age) {

}