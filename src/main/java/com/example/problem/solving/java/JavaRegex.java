package com.example.problem.solving.java;

public class JavaRegex
{

    /**
     * 1--> it can contain single digit i.e ([0-9]);
     * 2--> It can contain two digits i.e ([0-9][0-9]);
     * 3--> Range is (099 to 199)i.e((0|1)[0-9][0-9]);
     * 4--> range is (200 - 249) i.e (2[0-9][0-9]) ;
     * 5--> range is (250-255) i.e (25[0-5]);
     */
    String zeroTo255 = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    // or

    /**
     * \d represents digits in regular expressions, same as [0-9]
     * \\d{1, 2} catches any one or two-digit number
     * (0|1)\\d{2} catches any three-digit number starting with 0 or 1.
     * 2[0-4]\\d catches numbers between 200 and 249.
     * 25[0-5] catches numbers between 250 and 255.
     */
    String zeroTo255_part2 = "(\\d{1, 2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;
}
