package com.example.problem.solving.leetcode.leetcode_75_level1.day5_greedy;

import java.util.HashMap;

public class TimeToBuyStock
{
    public static int maxProfit(int[] prices)
    {
        int sell = 0;
        int buy = prices[0];
        int value = 0;

        for (int i = 0; i < prices.length; i++)
        {

            if (prices[i] <= buy)
            {
                buy = prices[i];
            }
            else{
                value = prices[i] - buy;
                if (value > sell)
                {
                    sell = value;
                }
            }


        }

        return sell;

    }

    public static void main(String[] args)
    {
        int[] arr = {2,4,1};
        System.out.println(maxProfit(arr));

    }
}
