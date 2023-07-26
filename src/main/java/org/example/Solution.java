package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> value = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if (value.containsKey(res)) {
                return new int[]{value.get(res), i};
            }
            value.put(nums[i], i);
        }
        return nums;
    }
}
