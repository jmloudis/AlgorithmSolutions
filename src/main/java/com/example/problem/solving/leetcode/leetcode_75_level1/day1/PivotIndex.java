package com.example.problem.solving.leetcode.leetcode_75_level1.day1;

public class PivotIndex
{
    /**
     How this works

     For ex: nums = [1,7,3,6,5,6]
     Total sum = 28

     if say index 3 is the pivot index i.e. left sum to pivot == Right sum to pivot
     which also means

     total sum - pivot index value should give us (X) == left sum to pivot  + Right sum to pivot == total sum - X
     = 2 * (left sum to pivot or right sum)

     So, first calculate total sum
     then start from index 0 and check if left sum match above condition (keep left sum running count)


     index 0, total = 28, left sum = 0; 2*0 -> 0 != 28 - 1 (nums[0]))
     index 1, total = 28, left sum = 1; 2*1 -> 2 != 28 - 7
     index 2, total = 28, left sum = 8; 2*8 -> 16 != 28 - 3
     index 3, total = 28, left sum = 11; 2*11 -> 22 == 28 - 6 (true return index 3)

     **/
    public static int pivotIndex(int[] nums)
    {
        //if(nums == null || nums.length == 0) return -1;
        int total = 0;
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++)
        {
            total += nums[i];
        }

        for (int i =0; i < nums.length; i++)
        {
            if (2 * sum1 == total - nums[i])
            {
                return i;
            }
            sum1 += nums[i];
        }

        return -1;

    }
}
