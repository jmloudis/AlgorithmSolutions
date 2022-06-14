package com.example.problem.solving.hackerrank.warmup;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

//    Given an array of integers, calculate the ratios of its elements that are positive,
//    negative, and zero. Print the decimal value of each fraction on a new line with
//    places after the decimal.

    public void plusAndMinus(){
        List<Integer> arr = new ArrayList<>();
        arr.add(-3);
        arr.add(1);
        arr.add(0);
        arr.add(-5);
        arr.add(3);
        arr.add(12);


        System.out.println(arr);
        int p = 0;
        int n = 0;
        int z = 0;

        int s = arr.size();

        for (int i = 0; i < s; i++){

            if (arr.get(i) > 0){
                p++;
            }

            else if (arr.get(i) < 0){
                n++;
            }

            else if (arr.get(i) == 0){
                z++;
            }

        }

        // convert int p -> float and get ratio by dividing by size of array
        float pRatio = ( (float) p / s);
        float nRatio = ( (float) n / s);
        float zRatio = ( (float) z / s);

        System.out.println(pRatio);
        System.out.println(nRatio);
        System.out.println(zRatio);

    }

}
