package com.example.problem.solving.hackerrank.warmup;

import java.util.ArrayList;
import java.util.List;

public class VeryBigSum {

    public long aVeryBigSum(){
        List<Integer> ar = new ArrayList<>();
        ar.add(1000000001);
        ar.add(1000000002);
        ar.add(1000000003);
        ar.add(1000000004);
        ar.add(1000000005);

        int size = ar.size();;
        long sum = 0;

        for (int i = 0; i < size; i++){
            sum += ar.get(i);
        }

        System.out.println(sum);
        return sum;

    }
}
