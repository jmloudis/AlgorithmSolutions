package com.example.problem.solving.assesment;

import java.util.Arrays;

public class ToolList {

    public static int toolChanger() {

        String[] tools = {"ballendmill", "keywaycutter", "slotdrill", "facemill", "drill", "screwdriver"};
        int startIndex = 1;
        String target = "slotdrill";

        // start problem

        int right = 0;
        int left = 0;
        int size = tools.length;
        int position = Arrays.asList(tools).indexOf(target);

        if (position > startIndex){
            right = size - position + startIndex; // 6 - 3 + 1 = 4
            left = position - startIndex; //
        }
        else if (position < startIndex){
            right = startIndex - position;
            left = size - startIndex + position; // 6 - 1 + 0
        }

        int count = Math.min(right, left);
        System.out.println(right + " " + left);
        System.out.println(count);
        return count;
    }
}
