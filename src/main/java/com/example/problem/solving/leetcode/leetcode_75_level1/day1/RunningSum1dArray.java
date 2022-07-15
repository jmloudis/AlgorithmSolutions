package com.example.problem.solving.leetcode.leetcode_75_level1.day1;

public class RunningSum1dArray {

    /**
     *
     * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
     *
     * Return the running sum of nums.
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,4]
     * Output: [1,3,6,10]
     * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     */

    public int[] runningSum(int[] nums)
    {

        int[] arr = new int[nums.length];
        int num = 0;
        for (int i = 0; i < nums.length; i++)
        {
            num += nums[i];
            arr[i] = num;
        }
        return arr;
    }
}
