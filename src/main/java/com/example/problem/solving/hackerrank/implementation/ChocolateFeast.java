package com.example.problem.solving.hackerrank.implementation;

public class ChocolateFeast
{
    public static int chocolateFeast(int n, int c, int m) {
        // Write your code here
        int total = 0;
        int candyBars = n / c; // 5
        int wrappers = candyBars; // 5
        while(wrappers>=m)
        {
            int ex_chocs = wrappers / m;
            wrappers = ex_chocs + wrappers % m;
            candyBars += ex_chocs;
        }
        total = candyBars;
        return total;
    }
}
