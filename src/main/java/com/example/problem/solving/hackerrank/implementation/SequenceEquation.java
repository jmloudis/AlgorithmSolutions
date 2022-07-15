package com.example.problem.solving.hackerrank.implementation;

import java.util.ArrayList;
import java.util.List;

public class SequenceEquation {

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here

        List<Integer> y = new ArrayList<>();
        int n = p.size();


        for(int i = 0; i< n; i++)
        {
            int pos = 0;
            for(int j = 0; j< n; j++)
            {
                if(p.get(j) == i+1)
                {
                    pos = j+1;
                    System.out.println(pos);
                    break;

                }
            }

            int pos2 =0;
            for(int j = 0; j<n; j++)
            {
                if(p.get(j)==pos)
                {
                    pos2 = j;
                    break;
                }
            }
            System.out.println();
            System.out.println(pos2+1);
            y.add(pos2 + 1);
        }

        return y;

    }
}
