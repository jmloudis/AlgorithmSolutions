package com.example.problem.solving.hackerrank.implementation;

import java.util.List;

public class TheHurdleRace {

    public static void hurdleRace(int k, List<Integer> height)
    {
        int doses = 0;
        int max = 0;
        int size = height.size();

        for (int i = 0; i < size; i++)
        {
            int n = height.get(i);

            if (n > max)
            {
                max = n;
            }
        }

        if (k < max)
        {
            doses = max - k;
        }
        else if (k >= max)
        {
            doses = 0;
        }

        System.out.println(doses);
    }
}
