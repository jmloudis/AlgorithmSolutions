package com.example.problem.solving.hackerrank.implementation;

public class LibraryFine
{
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        int fee = 0;

        if (y2 > y1 || (y2 == y1 && m2 > m1))
        {
            fee = 0;
        }
        else if (y1 > y2){
            fee = 10000;
        }
        else if (d1 > d2)
        {
            fee = 15 * (d1-d2);
            if(m1 > m2)
            {
                fee = 500 * (m1 - m2);
            }
        }
        else if (m1 > m2)
        {
            fee = 500 * (m1-m2);
            if (d1 > d2)
            {
                fee = 15 * (d1-d2);
            }
        }
        return fee;

    }
}
