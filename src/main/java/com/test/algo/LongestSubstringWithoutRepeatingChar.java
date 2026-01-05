package com.test.algo;

import java.util.HashMap;
import java.util.Map;


public class LongestSubstringWithoutRepeatingChar {

    public static void main(String[] args) {

        System.out.println(firstSolution("abcabcbb"));
        System.out.println(firstSolution("bbbbb"));
        System.out.println(firstSolution("pwwkew"));

    }

    public static int firstSolution(String s) {
        if (s == null || s.isEmpty()) return 0;

        Map<Character, Integer> lastSeen = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                left = lastSeen.get(c) + 1;
            }

            lastSeen.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
