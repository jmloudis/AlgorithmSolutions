package com.example.problem.solving.assesment;

public class MaximumOccuringChar {

    public char maxCount(String s) {

        char a = ' ';
        int count = 0;
        int size = s.length();
        int freq[] = new int[256];

        for (int i = 0; i < size; i++){
            // convert char -> ASCII
            int n = s.charAt(i);
            System.out.println(n);

            // array index n - increment by 1
            freq[n]++;
            System.out.println(freq[n]);

            // if 1 > 0
            if (freq[n] > count){
                count = freq[n];
                a = s.charAt(freq[n]);
            }
        }

        System.out.println(" ");
        System.out.println(count);
        System.out.println(a);
        return a;
    }
}
