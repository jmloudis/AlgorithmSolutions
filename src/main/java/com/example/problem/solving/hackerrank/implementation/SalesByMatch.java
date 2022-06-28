package com.example.problem.solving.hackerrank.implementation;

import java.util.List;

public class SalesByMatch {

    public static int sockMerchant(List<Integer> ar){

        int pairs = 0;
        int[] p = new int[101];
        for (int i = 0; i < ar.size(); i++){
            int num = ar.get(i);
            p[num]++;

            if (p[num] % 2 == 0){
                pairs++;
            }
            System.out.println(p[num]);
        }

        System.out.println(pairs);


        return pairs;



    }
}
