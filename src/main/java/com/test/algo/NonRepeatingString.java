package com.test.algo;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingString {

    public static void main(String[] args) {

        System.out.println(firstNonRepeatingLetter("Stress"));
        System.out.println(firstNonRepeatingLetter("sTreSSs"));
    }

    public static String firstNonRepeatingLetter(String s) {
        if (s == null || s.isEmpty()) return "";

        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            char lower = Character.toLowerCase(c);
            freq.merge(lower, 1, Integer::sum);
        }

        for (char c : s.toCharArray()) {
            if (freq.get(Character.toLowerCase(c)) == 1) {
                return String.valueOf(c);
            }
        }

        return "";
    }
}
