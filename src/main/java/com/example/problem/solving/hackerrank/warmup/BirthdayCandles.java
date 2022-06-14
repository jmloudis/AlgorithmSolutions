package com.example.problem.solving.hackerrank.warmup;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCandles {

    public int birthdayCakeCandles(){

        List<Integer> candles = new ArrayList<>();
        candles.add(6);
        candles.add(3);
        candles.add(2);
        candles.add(6);

        int n = candles.size();
        int count = 0;
        int tallestNum = 0;

        for (int i = 0; i < n; i++){
            int num = candles.get(i);

            if (num > tallestNum){
                tallestNum = num;
                count = 1;
            }

            else if (num == tallestNum){
                count++;
            }

        }
        System.out.println(count);
        return count;
    }


}

