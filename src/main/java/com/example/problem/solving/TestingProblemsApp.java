package com.example.problem.solving;

import com.example.problem.solving.assesment.*;
import com.example.problem.solving.hackerrank.greedy.*;
import com.example.problem.solving.hackerrank.implementation.*;
import com.example.problem.solving.hackerrank.warmup.*;
import com.example.problem.solving.practice.*;
/**
 * Algorithms Overview
 *
 * Greedy -  In the greedy method, at each step, a decision is
 * made to choose the local optimum, without thinking about the future consequences.
 *
 * Implementation -
 *
 */

public class TestingProblemsApp {

    public static void main(String[] args){



//        Practice.practiceProblems(6);

        AvidHiker avidHiker = new AvidHiker();
//        avidHiker.countingValleysWithParameters(8, "UDDDUDUU");

        DrawingBook drawingBook = new DrawingBook();
//        drawingBook.pageCount(20, 5);

        Staircase staircase = new Staircase();
//        staircase.staircaseProblem(4);
//        staircase.staircaseUpsideDown(6);

        BirthdayCandles birthdayCandles = new BirthdayCandles();
//        birthdayCandles.birthdayCakeCandles();

        MiniMaxSum miniMaxSum = new MiniMaxSum();
//        miniMaxSum.miniMaxSum();

        CompareTriplets compareTriplets = new CompareTriplets();
//        compareTriplets.compareList();

        DiagonalDifference diagonalDifference = new DiagonalDifference();
//        diagonalDifference.diagonalDif();

        PlusMinus plusMinus = new PlusMinus();
//        plusMinus.plusAndMinus();

        ElectronicShop obj = new ElectronicShop();
//        System.out.println(obj.getMoneySpent());

        AppleOrange ano = new AppleOrange();
//        ano.countApplesAndOranges(7, 11, 5, 15);

        SimpleArraySum simple = new SimpleArraySum();
//        simple.arraySum();

//        CatsAndMouse.catAndMouse(1,2,3);
//        BreakingTheRecords.breakingRecords();

        MaximumOccuringChar moc = new MaximumOccuringChar();
//        moc.maxCount("helloworld");

        PickingTickets pt = new PickingTickets();
        pt.maxTickets();



    }
}
