package com.example.problem.solving.hackerrank.warmup;

import java.util.ArrayList;
import java.util.List;

public class SimpleArraySum {

    public int arraySum(){
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(10);
        ar.add(11);

        // Start of Problem
        int sum = 0;
        int s = ar.size();

        for (int i =0; i < s; i++){
            int add = ar.get(i);
            sum += add;
        }

        System.out.println(sum);
        return sum;

    }
}
