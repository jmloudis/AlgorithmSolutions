package com.example.problem.solving.hackerrank.one_week_practice.day4;

import java.util.Arrays;
import java.util.List;

public class GridChallenge
{
    public static String gridChallenge(List<String> grid) {
        // Write your code here

        char[] prev = null;
        for (int i=0; i<grid.size(); i++) {
            char[] cur = grid.get(i).toCharArray();
            Arrays.sort(cur);
            if (prev != null)
            {
                for (int j=0; j<grid.get(i).length(); j++)
                {

                    if (cur[j] < prev[j])
                        return "NO";
                }
            }
            prev = cur;
        }
        return "YES";
    }
}
