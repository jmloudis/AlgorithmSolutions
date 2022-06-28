package com.example.problem.solving.hackerrank.implementation;

import java.util.List;

public class SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m){
        int count = 0;
        int sum = 0;
        int size = s.size();

        for (int i = 0; i < size; i++){

            int limit = i + m;
            if (limit > size){
                break;
            }

            sum = 0;
            for (int j = i; j < limit; j++){
                sum += s.get(j);
                System.out.println(s.get(j));
                System.out.println();
                System.out.println(sum);
            }
            System.out.println("End of Inner Loop");

            if (sum == d){
                count++;
            }
        }


        return count;
    }
}
