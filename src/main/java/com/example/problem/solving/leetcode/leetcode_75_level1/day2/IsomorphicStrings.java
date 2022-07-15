package com.example.problem.solving.leetcode.leetcode_75_level1.day2;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings
{
    public static boolean isIsomorphicSol1(String s, String t)
    {


        if (s.length() != t.length())
        {
            return false;
        }
        else
        {
            char[] ch_s = s.toCharArray();
            char[] ch_t = t.toCharArray();

            for (int i = 0; i < t.length(); i++)
            {
                if(s.indexOf(ch_s[i]) != t.indexOf(ch_t[i]))
                {
                    return false;
                }

            }


        }

        return true;

    }

    public static boolean isIsomorphicSol2(String s, String t)
    {
        // s - egg
        // t - add


        HashMap<Character,Character> isoMap = new HashMap<Character,Character>();
        for(int i = 0; i < s.length(); i++)
        {
            System.out.println(i);
            Character sCurr = s.charAt(i); // g
            Character tCurr = t.charAt(i); // g

            // Check if mapping for sCurr exists
            if(isoMap.containsKey(sCurr))
            {
                System.out.println(isoMap.entrySet());
                if(!isoMap.get(sCurr).equals(tCurr))
                {   // compare against mapping
                    return false;
                }
            }
            else if(isoMap.containsValue(tCurr))
            {
                // verify tCurr is not already a key value
                return false;
            }
            else
            {   // add the mapping
                isoMap.put(sCurr, tCurr); // {(e,a)}
            }
            System.out.println(isoMap);
            //DaSystem.out.println(isoMap.entrySet());
        }

        return true;



    }
}
