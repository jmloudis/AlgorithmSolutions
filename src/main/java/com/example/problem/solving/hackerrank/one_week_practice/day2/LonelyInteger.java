package com.example.problem.solving.hackerrank.one_week_practice.day2;

import java.util.HashSet;
import java.util.List;

public class LonelyInteger
{
    public static int lonelyInteger(List<Integer> a) {
        // Write your code here
        int element = 0;
        HashSet<Integer> hs = new HashSet<>();

        for (int i : a)
        {
            if(!hs.contains(i))
            {
                hs.add(i);
            }
            else{
                hs.remove(i);
            }
        }
        element = (int) hs.toArray()[0];
        return element;

    }

    public static int lonelyIntegerSol2(List<Integer> a) {
        int uniq = 0;
        for (int i=0; i<a.size(); i++){
            uniq = a.get(i);
            a.remove(i);
            if (a.contains(uniq)==false)
                return uniq;
            a.add(i, uniq);
        }
        return uniq;
    }
}
