package com.example.problem.solving.hackerrank.implementation;

public class ViralAdvertising {

    public static int viralAdvertising(int n) {
        // Write your code here
        int shared = 5;
        int liked = 0;
        int total = 0;

        for (int i = 1; i <= n; i++)
        {
            if (i == 1)
            {
                liked = (shared / 2);
                total += liked;
            }
            else
            {
                shared = liked * 3;
                liked = (shared / 2);
                total += liked;
            }

        }

        return total;
    }

}
