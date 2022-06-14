package com.example.problem.solving.hackerrank.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public void miniMaxSum(){

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(3);
        arr.add(7);
        arr.add(9);

        int max = 0;
        int min = arr.get(0);
        long sum = 0;

        // for each loop - specific for finding elements in arrays
        // most efficient way
        for (int i : arr){
            sum += i;

            if (i < min){
                min = i;
            }

            else if (i > max) {
                max = i;
            }
        }

        System.out.println((sum - max) + " " + (sum - min));


    }

    public void miniMaxSorted(){

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(3);
        arr.add(7);
        arr.add(9);

        Collections.sort(arr);

        int n = arr.size();
        long sum = 0;
        int min = arr.get(0);
        int max = arr.get(n -1);

        for (int i = 0; i < n; i++){
            sum += arr.get(i);
        }

        System.out.println((sum - max) + " " + (sum - min));

    }

    public void miniMaxSumSol(){

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(3);
        arr.add(7);
        arr.add(9);

        int s = arr.size();
        int min = arr.get(0);
        int max = 0;
        long sum = 0;


        for (int i = 0; i < s; i++){
            sum += arr.get(i);
            int n = arr.get(i);

            if (n < min ){
                min = n;
            }

            else if (n > max){
                max = n;
            }
        }

        long minSum = sum - max;
        long maxSum = sum - min;

        System.out.println(minSum + " " + maxSum);
    }

}
