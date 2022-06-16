package com.example.problem.solving.hackerrank.implementation;

import java.util.ArrayList;
import java.util.Collections;

public class MigratoryBirds {


    public static int typeBirds(ArrayList<Integer> arr){

        int num[] = new int[arr.size()];
        int type = 0;
        int count = 0;
        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++){
            int n = arr.get(i);

            num[n]++;

            if (num[n] > count){
                count = num[n];
                type = n;

            }

        }

        return type;
    }


}
