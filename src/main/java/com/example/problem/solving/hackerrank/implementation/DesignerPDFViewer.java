package com.example.problem.solving.hackerrank.implementation;

import java.util.List;

public class DesignerPDFViewer {

    /**
     *
     *
     * When a contiguous block of text is selected in a PDF viewer, the selection is highlighted with a blue rectangle.
     * In this PDF viewer, each word is highlighted independently. For example:
     *
     * There is a list of  character heights aligned by index to their letters.
     * For example, 'a' is at index  and 'z' is at index . There will also be a string.
     * Using the letter heights given, determine the area of the rectangle highlight in assuming all letters are  wide.
     *
     *
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int area = 0;
        int max = 0;
        for (int i = 0; i < word.length(); i++)
        {
            char tempChar = word.charAt(i);
            //max = max < h.get(tempChar - 97) ? h.get(tempChar - 97) : max;

            if (h.get(tempChar - 97) > max)
            {
                max = h.get(tempChar - 97);
            }
        }

        area = max * word.length();
        System.out.println(word.length());

        return area;

    }
}
