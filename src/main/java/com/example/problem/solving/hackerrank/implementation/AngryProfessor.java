package com.example.problem.solving.hackerrank.implementation;

import java.util.List;

public class AngryProfessor {

    public String lateStudents(int k, List<Integer> a)
    {
        int onTimeStudents = 0;
        String classCanceled = "YES";

        for (int i : a)
        {

            if (i <= 0)
            {
                onTimeStudents++;
            }
        }
        System.out.println(onTimeStudents);

        if ( onTimeStudents >= k)
        {
            classCanceled = "NO";
        }

        return classCanceled;
    }
}
