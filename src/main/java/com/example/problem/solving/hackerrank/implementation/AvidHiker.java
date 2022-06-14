package com.example.problem.solving.hackerrank.implementation;

import java.util.Scanner;

public class AvidHiker {

    //find and print the number of valleys walked through

    public void countingValleys(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of steps: Ex. 8");
        int steps = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the string path, matching the amount of steps: Ex. UDDUUD");
        String path = scan.nextLine();

        int altitude = 0;
        int valleys = 0;

        for (int i = 0; i < steps; i++){

            if (path.charAt(i) == 'U'){
                altitude++;
            }
            else if (path.charAt(i) == 'D'){
                if (altitude == 0){
                    valleys++;
                }
                altitude--;
            }

            System.out.println(altitude);

        }
        System.out.println(" ");
        System.out.println(valleys);




    }

    public int countingValleysWithParameters(int steps, String path){

        System.out.println("The amount of steps is: " + steps);
        System.out.println("The path is: " + path);


        int valley = 0;
        int seaLevel = 0;

        for (int i = 0; i < steps; i++){


            if (path.charAt(i) == 'U'){
                seaLevel++;
            }

            // if Char = D && seaLevel = 1
            else if (path.charAt(i) == 'D') {

                // seaLevel still = 1
                // if seaLevel = 0 is true and Char = D, then if statement is initiated, seaLevel will then be -1
                if (seaLevel == 0){
                    valley++;
                }

                // if seaLevel == 0 is not true
                // seaLevel now equals 0
                seaLevel--;
            }

            System.out.println(seaLevel);

        }
        System.out.println(" ");
        System.out.println(valley);
        return valley;

    }

}
