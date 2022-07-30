package com.example.problem.solving.hackerrank.constructive_algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlippingTheMatrix
{
    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        /**
         * [112, 42, 83, 119]
         * [56, 125, 56, 49]
         * [15, 78, 101, 43]
         * [62, 98, 114, 108]
         */
        int n = matrix.size() / 2;
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                /**
                 * 1. --- j = 0 & i = 0 ---
                 *
                 *      sum1 = 112
                 *      sum2 = 119 --- Max ---
                 *      sum3 = 62
                 *      sum4 = 108
                 *
                 *      sum = 119
                 *
                 * 2. --- j = 1 & i = 0 ---
                 *
                 *      sum1 = 42
                 *      sum2 = 83
                 *      sum3 = 98
                 *      sum4 = 114 -- Max ---
                 *
                 *      sum = 119 + 114
                 *
                 * 3. --- j = 0 & i = 1 ---
                 *
                 *      sum1 = 56 --- Max ---
                 *      sum2 = 49
                 *      sum3 = 15
                 *      sum4 = 43
                 *
                 *      sum = 119 + 114 + 56
                 *
                 * 4. --- j = 1 & i = 1 ---
                 *
                 *      sum1 = 125 --- Max ---
                 *      sum2 = 56
                 *      sum3 = 78
                 *      sum4 = 101
                 *
                 *      sum = 119 + 114 + 56 + 125 -> 414
                 */
                int sum1 = matrix.get(i).get(j); // top left
                int sum2 = matrix.get(i).get((2 * n) - j - 1); // top right
                int sum3 = matrix.get((n * 2) - i - 1).get(j); // bottom left
                int sum4 = matrix.get((n * 2) - i - 1).get((2 * n) - j - 1); // bottom right
                sum += Math.max(sum1, Math.max(sum2, Math.max(sum3, sum4)));

            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> a1 = new ArrayList<>(Arrays.asList(112, 42, 83, 119));
        List<Integer> a2 = new ArrayList<>(Arrays.asList(56, 125, 56, 49));
        List<Integer> a3 = new ArrayList<>(Arrays.asList(15, 78, 101, 43));
        List<Integer> a4 = new ArrayList<>(Arrays.asList(62, 98, 114, 108));
        arr.add(a1);
        arr.add(a2);
        arr.add(a3);
        arr.add(a4);

        System.out.println(flippingMatrix(arr));
    }
}
