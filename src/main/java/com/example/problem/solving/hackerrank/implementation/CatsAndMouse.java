package com.example.problem.solving.hackerrank.implementation;

public class CatsAndMouse {

    /**
     * Two cats and a mouse are at various positions on a line.
     * You will be given their starting positions.
     * Your task is to determine which cat will reach the mouse first,
     * assuming the mouse does not move and the cats travel at equal speed.
     * If the cats arrive at the same time, the mouse will be allowed to move and,
     * it will escape while they fight.
     *
     *
     * int z - Mouse C
     * int y - Cat B
     * int x - Cat A
     */

    public static String catAndMouse(int x, int y, int z){

        String value = "Mouse C";
        int a = Math.abs(x - z);
        int b = Math.abs(y - z);

        if (a < b){
            value = "Cat A";
        }

        else if (b < a){
            value = "Cat B";

        }

        System.out.println(value);
        return value;

    }



}
