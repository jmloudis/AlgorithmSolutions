package com.example.problem.solving.hackerrank.implementation;

import java.util.HashMap;
import java.util.List;

public class MinimumDistances
{
    /**
     *
     *
     */

    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        int minDist = Integer.MAX_VALUE, currIndex = 0, prevIndex = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.size(); i++)
        {
            System.out.println(a.get(i));

            // if map already contains key - or number in List find the distance between them
            if (map.containsKey(a.get(i)))
            {
                currIndex = i;
                prevIndex = map.get(a.get(i));
                System.out.println(prevIndex);
                minDist = Math.min(currIndex - prevIndex, minDist);
            }
            map.put(a.get(i) , i);
            System.out.println();
        }


        System.out.println(map);
        if (minDist == Integer.MAX_VALUE)
        {
            minDist = -1;
        }
        return minDist;
    }
}
