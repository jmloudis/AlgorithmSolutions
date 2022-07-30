package com.example.problem.solving.hackerrank.implementation;

import java.util.List;

public class SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m){
        int total = 0;
        for (int i = 0; i < s.size(); i++)
        {
            int limit = i + m;
            if (limit > s.size())
            {
                break;
            }

            int sum = 0;
            for (int j = i; j < limit; j++)
            {
                sum += s.get(j);
                System.out.println(s.get(j));
            }

            if (sum == d)
            {
                total++;
            }

        }

        return total;
    }
}
