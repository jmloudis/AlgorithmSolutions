package com.example.problem.solving.hackerrank.warmup;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

    public List<Integer> compareList(){

        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(6);
        a.add(2);
        List<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(6);
        b.add(4);

        System.out.println("Array A: " + a);
        System.out.println("Array B: " + b);

        // Start of program solution
        int Alice = 0;
        int Bob = 0;
        int size = a.size();

        List<Integer> difArr = new ArrayList<>();

        for (int i = 0; i < size; i++){

            if (a.get(i) > b.get(i)){
                Alice++;
            }

            else if (b.get(i) > a.get(i)){
                Bob++;
            }
        }
        difArr.add(Alice);
        difArr.add(Bob);
        System.out.println(Alice + " " + Bob);

        return difArr;
    }

}
