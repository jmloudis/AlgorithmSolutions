package com.example.problem.solving.hackerrank.implementation;

public class UtopianTree {

    public static int UtopianTree(int n)
    {
        int height = 0;
        System.out.println(n);
        for (int i = 0; i <= n; i++)
        {
            if (i % 2 == 0)
            {
                height++;
            }
            else if (i % 2 != 0)
            {
                height *= 2;
            }
        }


        return height;
    }
}
