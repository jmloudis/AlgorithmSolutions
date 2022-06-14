package com.example.problem.solving.hackerrank.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriyankaAndToys {

    public int toys(){
        List<Integer> w = new ArrayList<>();

        int count = 1;
        int s = w.size();
        Collections.sort(w);
        int min = w.get(0);


        for (int i = 0; i < s; i++){

            if (w.get(i) > (min + 4)){
                min = w.get(i);
                count++;
            }

        }

        System.out.println(count);
        return count;
    }

}
