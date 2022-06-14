package com.example.problem.solving.hackerrank.implementation;

public class HalloweenSale {

    public int howManyGames(int p, int d, int m, int s){

        int currPrice = p;
        int i = 0;
        while (s >= currPrice){
            s = s - currPrice;
            if (currPrice >= m + d){
                currPrice = currPrice - d;
            }
            else{
                currPrice = m;
            }

            i++;
        }
        System.out.println(currPrice);
        System.out.println(i);
        return i;
    }

    public int howManyGames2(int p, int d, int m, int s){

        int count = 0;

        while (s >= p){
            s -= p;
            p = Math.max(p-d, m);
            count++;
        }

        System.out.println(p);

        return count;

    }

}
