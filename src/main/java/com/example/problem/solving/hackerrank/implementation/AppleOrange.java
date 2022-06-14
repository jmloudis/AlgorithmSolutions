package com.example.problem.solving.hackerrank.implementation;

import java.util.ArrayList;
import java.util.List;

public class AppleOrange {

    public void countApplesAndOranges(int s, int t, int a, int b){
        /**
         * int s = start of Sam's house
         * int t = end of Sam's house
         * int a = location of apple tree
         * int b = location of orange tree
         */

        List<Integer> oranges = new ArrayList<>();
        oranges.add(5);
        oranges.add(-6);

        List<Integer> apples = new ArrayList<>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);

        // Start of Problem

        int m = apples.size();
        int n = oranges.size();

        int aCount = 0;
        int oCount = 0;

        // iterate through apple array

        for (int i = 0; i < m; i++){

            // gets array of apple fallen location
            int aa = apples.get(i);

            // location of tree + location of where apple fell
            int appleLocation = a + aa;

            // if appleLocation fell on sam's house count + 1
            if (appleLocation >= s && appleLocation <= t){
                aCount++;
            }
        }

        for (int j = 0; j < n; j++){
            int oo = oranges.get(j);

            int orangeLocation = b + oo;

            if (orangeLocation >= s && orangeLocation <= t){
                oCount++;
            }
        }

        System.out.println("Apple Count: " + aCount);
        System.out.println("Orange Count: " + oCount);



    }
}
