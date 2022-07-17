package com.example.problem.solving.hackerrank.implementation;

import java.util.List;

public class JumpingOnTheClouds
{
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jumps = 0;
        for (int i =0; i < c.size() - 1; i++)
        {
            // 0 0 1 0 0 1 0 - 4
            // 0 0 0 1 0 0 - 3
            if (c.get(i) == 0)
            {
                i++;
            }
            jumps++;
        }

        return jumps;


    }
}
