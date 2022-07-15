package com.example.problem.solving.hackerrank.implementation;

public class BeautifulDays {

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        //int n = i;
        int rev = 0, count = 0, diff = 0;

        for (int n = i; n <= j; n++)
        {
            rev = 0;
            int x = n;
            while ( x != 0)
            {
                int digit = x % 10 ;
                rev = rev * 10 + digit;
                x /= 10;
            }
            diff = Math.abs(n - rev);
            if ( diff % k == 0)
            {
                count++;
            }

        }


        return count;
    }
}
