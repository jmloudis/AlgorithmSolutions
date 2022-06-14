package com.example.problem.solving.hackerrank.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords() {
        List<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1));

        int maxCount = arr.get(0);
        int minCount = arr.get(0);
        int min = 0;
        int max = 0;

        int size = arr.size();

        for (int i = 0; i < size; i++){
            int num = arr.get(i);

            if (num < minCount){
                min++;
                minCount = num;
            }

            else if (num > maxCount){
                max++;
                maxCount = num;
            }

        }

        List<Integer> count = new ArrayList<>();
        count.add(max);
        count.add(min);

        System.out.println(max + " " + min);
        return count;

    }
}
