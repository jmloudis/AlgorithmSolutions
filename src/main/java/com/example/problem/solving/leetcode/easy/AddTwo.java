package com.example.problem.solving.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class AddTwo
{
    public int[] twoSumBrute(int[] nums, int target) {

         int[] arr = new int[2];
         for (int i = 0; i < nums.length; i++)
         {
             for (int j = i + 1; j < nums.length; j++)
             {
                 if (nums[i] + nums[j] == target)
                 {
                     System.out.println(nums[i] + " " + nums[j]);
                     arr[0] = i;
                     arr[1] = j;
                 }
             }
         }
         return arr;

    }

    public int[] twoSumSol2(int[] nums, int target) {

        Map<Integer, Integer> hash = new HashMap<>();
        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++){
            int newInt = target - nums[i]; // 7,2


            if (hash.containsKey(newInt))
            {
                arr[0] = hash.get(newInt);
                arr[1] = i;
                break;

            }

            //System.out.println(hash);
            hash.put(nums[i], i);

        }

        return arr;


    }
}
