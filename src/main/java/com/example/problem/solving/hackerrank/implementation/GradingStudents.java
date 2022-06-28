package com.example.problem.solving.hackerrank.implementation;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static void gradingStudents(List<Integer> grades){

        List<Integer> array = new ArrayList<>();

        int size = grades.size();



        for (int i = 0; i < size; i++)
        {
            int n = grades.get(i);

//             if (n % 5 < 3 || n < 38)
//             {
//                 int s = n;
//             }
//             else
//             {
//                 int remainder = n % 5;
//                 n += (5 - remainder);
//             }

            int s = (n % 5 < 3 || n < 38) ? n : (n += (5 - (n % 5)));

            array.add(s);


        }

        System.out.println(array);



    }
}
