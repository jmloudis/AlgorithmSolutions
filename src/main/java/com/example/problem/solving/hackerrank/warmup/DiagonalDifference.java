package com.example.problem.solving.hackerrank.warmup;

import java.util.ArrayList;

public class DiagonalDifference {

    public int diagonalDif() {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> inner1 = new ArrayList();
        ArrayList<Integer> inner2 = new ArrayList();
        ArrayList<Integer> inner3 = new ArrayList();

        inner1.add(3);
        inner1.add(8);
        inner1.add(4);
        outer.add(inner1);

        inner2.add(2);
        inner2.add(5);
        inner2.add(10);
        outer.add(inner2);

        inner3.add(11);
        inner3.add(7);
        inner3.add(6);
        outer.add(inner3);



        // start of problem

        int absSum = 0;
        int leftToRight = 0;
        int rightToLeft = 0;

        //gets length - ArrayList of ArrayList
        int size = outer.size();

        // get all inner ArrayLists by getting length of
        for(int i = 0; i < size; i++){

            int innerSize = outer.get(i).size();
            // iterate through outer ArrayList to get all inner ArrayLists
            System.out.println(outer.get(i));

            // iterates through inner ArrayLists and ints
            // inner1 - int 1 -> inner2 - int 2 -> inner3 - int 3
            leftToRight += outer.get(i).get(i);

            //
            rightToLeft += outer.get(i).get(innerSize - i - 1);

        }


        System.out.println(leftToRight);
        System.out.println(rightToLeft);

        absSum = Math.abs(leftToRight - rightToLeft);
        System.out.println(absSum);
        return absSum;


    }
}
