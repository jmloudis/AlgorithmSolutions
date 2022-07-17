package com.example.problem.solving.hackerrank.implementation;

public class SherlockAndSquares
{
    public static int squares(int a, int b) {
        // Write your code here


        // int count = 0;
        // for (int i = a; i <=b; i++)
        // {
        //     if (Math.sqrt(i) == i / (int) Math.sqrt(i))
        //     {
        //         count++;
        //     }
        // }

        // return count;
        // }

        int x = (int)Math.ceil(Math.sqrt(a)); // 2
        int y = (int)Math.floor(Math.sqrt(b)); // 3
        int square_count = y - x + 1; // 3 - 2 + 1
        System.out.println(square_count);
        return square_count;
    }
}
