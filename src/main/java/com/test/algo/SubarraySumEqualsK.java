package com.test.algo;

public class SubarraySumEqualsK {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3,2,3};
        int k = 3;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
