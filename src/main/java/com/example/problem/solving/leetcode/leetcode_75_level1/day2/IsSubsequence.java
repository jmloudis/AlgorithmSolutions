package com.example.problem.solving.leetcode.leetcode_75_level1.day2;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t)
    {
        int i = 0;
        int j = 0;

        if (s.length() == 0)
        {
            return true;
        }

        while (i < s.length() && j < t.length())
        {
            if (s.charAt(i) == t.charAt(j))
            {
                i++;

            }

            j++;

            if (i == s.length())
            {
                return true;
            }
        }

        return false;

    }
}
