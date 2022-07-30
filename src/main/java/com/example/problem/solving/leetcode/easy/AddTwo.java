package com.example.problem.solving.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class AddTwo
{
    public static void main(String[] args)
    {
        int[] arr = {3,2,4};
        twoSumSol2(arr, 6);
    }
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

    public static int[] twoSumSol2(int[] nums, int target) {

        // 3,2,4 - target = 6

        Map<Integer, Integer> hash = new HashMap<>();
        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++){
            // {3=0}, {2=1},
            int newInt = target - nums[i]; // 2


            if (hash.containsKey(newInt)) //  2
            {

                arr[0] = hash.get(newInt); // value = 1
                arr[1] = i; // 2
                break;

            }

            //System.out.println(hash);
            hash.put(nums[i], i);

            System.out.println(hash);
        }

        System.out.println(arr[0] + " " + arr[1]);
        return arr;


    }
}
