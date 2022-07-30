package com.example.problem.solving.hackerrank.implementation;

public class RepeatedString
{
    public static long repeatedString(String s, long n) {
        // Write your code here
        long a = 0;
        int count = 0;
        long full = n / s.length();
        long rem = n % s.length();
        if (s.length() == 1)
        {
            if (s.charAt(0) == 'a')
            {
                a = n;
            }
        }
        else
        {
            for (int i = 0; i < s.length(); i++)
            {
                if (s.charAt(i) == 'a')
                {
                    a++;
                }
            }

            a *= full;

            for (int i = 0; i < rem; i++)
            {

                if (s.charAt(i) == 'a')
                {
                    a++;
                }
            }


        }
        System.out.println(count);


        return a;
    }
}
