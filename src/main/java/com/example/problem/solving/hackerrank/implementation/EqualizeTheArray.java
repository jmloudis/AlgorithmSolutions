package com.example.problem.solving.hackerrank.implementation;

import java.util.List;

public class EqualizeTheArray
{
    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        int count = 0;
        int min = 0;
        int[] n = new int[101];
        for (int i =0; i < arr.size(); i++)
        {
            int num = arr.get(i);
            n[num]++;
            if (n[num] > min)
            {
                min = n[num];
            }
            System.out.println(n[num]);
        }
        count = arr.size() - min;

        System.out.println(min);
        return count;
    }
}
