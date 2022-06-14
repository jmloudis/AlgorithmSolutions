package com.example.problem.solving.assesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingTickets {

    public int maxTickets(){

        List<Integer> a = new ArrayList<>(Arrays.asList(8,9,7,11,12,13,13,13,14,16,5,4,8,3,3,3,18,19,20));
        Collections.sort(a);
        System.out.println(a);

        // Problem Starts here
        int start = 1;
        int n = 0;
        int i = 0;
        int max = 0;

        for (int j = 1; j < a.size(); j++) {
            if (Math.abs(a.get(j - 1) - a.get(j)) > 1){
                max = j - i;
                System.out.println(j);
                if (max > n){
                    n = max;
                }
                i = j;
            }
        }

        System.out.println(" ");
        System.out.println(n);
        return n;
//        return Math.max(max, i - start + 1);

//        for (int j = 1; j < a.size(); j++) {
//            if (Math.abs(a.get(j - 1) - a.get(j)) > 1){
//                start = j;
//                max = j - i;
//                System.out.println(j);
//                if (max > n){
//                    n = max;
//                }
//                i = j;
//                start = j;
//            }
//            start++;
//        }

    }
}
