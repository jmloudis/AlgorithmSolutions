package com.example.problem.solving.hackerrank.one_week_practice.day3;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagSequence
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for(int cs = 1; cs <= test_cases; cs++){
            int n = kb.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = kb.nextInt();
            }
            findZigZagSequence(a, n);
        }
    }

    public static void findZigZagSequence(int [] a, int n){
        /*
        Example (1,2,3,4,5,6,7)
         */
        Arrays.sort(a);
        int mid = n/2; // was (n+1)/2
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        // 1,2,3,7,5,6,4

        int st = mid + 1;
        int ed = n - 2; // was n-1
        while(st <= ed){
            /**
             * 1.
             *      st = 4
             *      ed = 5
             *
             */
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed--; // was ed = ed + 1; or ed++;
            /**
             * 1.
             *      temp  = 5
             *      a[st] = 5 -> 6
             *      a[ed] = 6 -> 5
             *
             *      (1,2,3,7,6,5,4)
             *      st = 5
             *      ed = 4
             *
             *      ends after 1st iteration because 5 <= 4 is false
             */
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
