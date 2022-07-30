package com.example.problem.solving.hackerrank.implementation;

import java.util.HashSet;
import java.util.List;

public class BeautifulTriplets
{
    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here
        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.size(); i++)
        {
            set.add(arr.get(i));
        }

        for(int i=0;i<arr.size();i++)
        {
            int num = arr.get(i);  //for a particular value.
            if(set.contains(num+d) && set.contains(num+2*d))
            {
                count++;
            }
        }

        System.out.println(set);

        return count;


    }
}
