package com.example.problem.solving.hackerrank.one_week_practice.day2;

import java.util.ArrayList;
import java.util.List;

public class CountingSort
{
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<Integer>();
        int[] frequency = new int[100];
        for(int each: arr)
            frequency[each]++;
        for(int each : frequency)
            result.add(each);
        return result;
    }

}
