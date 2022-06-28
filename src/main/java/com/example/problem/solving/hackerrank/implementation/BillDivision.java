package com.example.problem.solving.hackerrank.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BillDivision {

    public static void bonAppetit(){

        List<Integer> bill = new ArrayList<>(Arrays.asList(3,10,2,9));
        int k = 1;
        int b = 12;


        // problem starts here
        int s = 0;
        bill.remove(k);

        for (int i = 0; i < bill.size(); i++){
            int a = bill.get(i);
            s += a;

        }
        int actual = s / 2;
        int sum = b - actual;
        if (b == actual){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(sum);
        }
    }
}
