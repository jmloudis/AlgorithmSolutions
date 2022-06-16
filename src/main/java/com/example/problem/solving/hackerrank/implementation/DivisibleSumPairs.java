package com.example.problem.solving.hackerrank.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {

    /**
     *
     *  Given an array of integers and a positive integer , determine the number of (i,j) pairs where
     *  i < j and ar[i] + ar[j] is divisible by k .
     */

    public static int sumPairs(){
        int k = 3;
        int n = 6;
        List<Integer> ar = new ArrayList<>(Arrays.asList(1,3,2,6,1,2));

        // Problem starts here
        int count = 0;

        for (int i = 0; i < n; i++){
            for (int j = 1; j < n; j++){
                int a = ar.get(i);
                int b = ar.get(j);

                if (i < j && (a + b) % k == 0){
                    count++;
                    System.out.println(i + " " + j);
                }



            }
            System.out.println(" ");

        }

        System.out.println(count);
        return count;
    }
}
