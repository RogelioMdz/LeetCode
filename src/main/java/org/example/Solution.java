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

    public int romanToInt(String s){
        HashMap<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);

        int valor = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            String currentSymbol = Character.toString(currentChar);

            int currentValue = roman.getOrDefault(currentSymbol, 0);

            if (i + 1 < s.length()) {
                char nextChar = s.charAt(i + 1);
                String nextSymbol = Character.toString(nextChar);
                int nextValue = roman.getOrDefault(nextSymbol, 0);

                if (currentValue < nextValue) {
                    valor -= currentValue;
                } else {
                    valor += currentValue;
                }
            } else {
                valor += currentValue;
            }
        }
        System.out.println(valor);
        return valor;
    }
}
