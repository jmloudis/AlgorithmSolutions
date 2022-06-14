package com.example.problem.solving.hackerrank.warmup;

public class Staircase {

    public void staircaseProblem(int n){
        int counter = 0;
        for(int i = 1; i <= n; i++){

            // dont use println() - which prints a new line
            //find numOfSpaces
            // k + i = n --> numSpaces = k = n - 1
            for(int k = 0; k < n - i; k++){
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++){
                System.out.print("#");
            }

            System.out.println(" ");

        }

    }

    public void staircaseUpsideDown(int n){

        for (int i = 0; i < n; i++){

            for (int j = n; j > i; j--){
                System.out.print("#");
            }

            for (int j = i; j < n; j++){
                System.out.print("-");
            }

            System.out.println(" ");
        }
    }
}
