package com.example.problem.solving.hackerrank.implementation;

public class DayOfTheProgrammer {

    public static String leapYear(int year){

        if (year >= 1700 && year <= 1917){
            return year % 4 == 0 ? ("12.09." + year) : ("13.09." + year);
        }
        else if (year == 1918){
            return "26.09." + year;
        }
        else if (year > 1918 && year <= 2700){
            return(year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? ("12.09." + year) : ("13.09." + year);
        }
        return null;
    }
}
