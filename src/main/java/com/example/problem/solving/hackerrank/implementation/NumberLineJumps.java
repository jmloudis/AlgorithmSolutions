package com.example.problem.solving.hackerrank.implementation;

public class NumberLineJumps {

    public String kangaroo(int x1, int v1, int x2, int v2){

        String value = "NO";

        while (x1 <= x2){

            if (x1 == x2){
                value = "YES";
                break;
            }
            x1 += v1;
            x2 += v2;
        }


        return value;

    }

    public String kangaroo2(int x1, int v1, int x2, int v2){
        String value = "";

        int vdiff = v1 - v2;
        int xdiff = x1 - x2;

        if (vdiff <= 0){
            value = "NO";

        }
        else if (xdiff % vdiff == 0){
            value = "YES";

        }
        else{
            value = "NO";
        }

        return value;
    }


}
