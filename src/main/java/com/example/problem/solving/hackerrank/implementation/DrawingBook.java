package com.example.problem.solving.hackerrank.implementation;

public class DrawingBook {

    public int pageCount(int numberOfPages, int pageNumber){

        // numberOfPages = 10
        // pageNumber = 7

        int front = pageNumber / 2;
        int back = (pageNumber % 2 == 0) ?
                ((numberOfPages - pageNumber) / 2) : ((numberOfPages - pageNumber) + 1) / 2;

        System.out.println("from front: " + front);
        System.out.println("from back: " + back);


        System.out.println("Shortest Length to page: " + Math.min(front, back));
        return Math.min(front, back);

    }
}
