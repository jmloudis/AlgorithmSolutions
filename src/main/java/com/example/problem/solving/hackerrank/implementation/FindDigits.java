package com.example.problem.solving.hackerrank.implementation;

public class FindDigits {

    public static int findDigits(int n) {
        // Write your code here
        int d = 0;
        int num = n;
        int count = 0;
        while (n != 0)
        {
            d = n % 10;

            try
            {
                if (d == 0)
                {
                    throw new Exception();
                }
                if (num % d == 0)
                {
                    System.out.println("No remainder");
                    count++;
                }
            }
            catch (Exception ex)
            {
                System.out.println("Not divisible by 0");
            }

            n = n / 10;
            System.out.println(d);
            System.out.println();
        }

        System.out.println("New num");
        System.out.println(count);
        return count;
    }

}
