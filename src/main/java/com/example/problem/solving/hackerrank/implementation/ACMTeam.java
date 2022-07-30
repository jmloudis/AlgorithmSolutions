package com.example.problem.solving.hackerrank.implementation;

import java.util.ArrayList;
import java.util.List;

public class ACMTeam
{
    public static List<Integer> acmTeam(List<String> topic) {
        // Write your code here
        List<Integer> brr = new ArrayList<>();
        int max = 0;
        int count = 0;
        for (int i = 0; i < topic.size(); i++)
        {
            for (int j = i + 1; j < topic.size(); j++)
            {


                int temp = 0;
                for (int k = 0; k < topic.get(i).length(); k++)
                {
                    if (topic.get(i).charAt(k) == '1' || topic.get(j).charAt(k) == '1')
                    {
                        temp++;
                    }
                }

                if (temp > max)
                {
                    max = temp;
                    count = 1;
                }
                else if( temp == max)
                {
                    max = temp;
                    count++;
                }

            }

        }
        brr.add(max);
        brr.add(count);

        return brr;

    }
}
