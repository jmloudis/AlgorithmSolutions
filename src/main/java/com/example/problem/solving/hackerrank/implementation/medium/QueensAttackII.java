package com.example.problem.solving.hackerrank.implementation.medium;

import java.util.List;

public class QueensAttackII
{

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {

        int count = 0;

        int left = c_q - 1;
        int right = n - c_q;
        int top = n - r_q;
        int bottom = r_q - 1;
        int d_bottom_left = Math.min(r_q, c_q) - 1;
        int d_bottom_right = Math.min(r_q-1, n-c_q);
        int d_top_left = Math.min(n-r_q, Math.abs(1-c_q));
        int d_top_right = n - Math.max(r_q, c_q);


        for (int i = 0; i < k; i++)
        {
            int r_obstacle = obstacles.get(i).get(0);
            int c_obstacle = obstacles.get(i).get(1);

            // left
            if ((r_obstacle == r_q && c_obstacle < c_q) && (c_q - c_obstacle < left))
            {
                left = c_q - c_obstacle - 1;
                System.out.println(c_obstacle + " " + r_obstacle);
            }

            // right
            else if ((r_obstacle == r_q && c_obstacle > c_q) && (c_q - c_obstacle < right))
            {
                right = c_obstacle - c_q - 1;
                System.out.println(c_obstacle + " " + r_obstacle);
            }

            // above
            else if ((c_obstacle == c_q && r_obstacle > r_q) && (r_obstacle - r_q < top))
            {
                top = r_obstacle - r_q - 1;
                System.out.println(c_obstacle + " " + r_obstacle);
            }

            // below
            else if ((c_obstacle == c_q && r_obstacle < r_q) && (r_q - r_obstacle < bottom))
            {
                bottom = r_q - r_obstacle - 1;
                System.out.println(c_obstacle + " " + r_obstacle);
            }

            // right - down: Diagonal

            else if (( c_obstacle > c_q && r_obstacle < r_q) && (r_q - r_obstacle == c_obstacle - c_q) && (r_q - r_obstacle < d_bottom_right))
            {
                d_bottom_right = r_q - r_obstacle - 1;
                System.out.println(c_obstacle + " " + r_obstacle);
            }

            // left - Down: Diagonal
            else if ( (c_obstacle < c_q && r_obstacle < r_q) && (r_q - r_obstacle == c_q - c_obstacle) && (r_q - r_obstacle < d_bottom_left))
            {
                d_bottom_left = r_q - r_obstacle - 1;
                System.out.println(c_obstacle + " " + r_obstacle);
            }

            // Right - Up: Diagonal
            else if ((c_obstacle > c_q && r_obstacle > r_q) && (r_obstacle-r_q == c_obstacle-c_q) && (r_obstacle - r_q < d_top_right) )
            {
                // d_top_right -= ((r_obstacle - r_q) + (n - r_obstacle) - 1);
                d_top_right = r_obstacle - r_q - 1;
            }

            // Left - Up: Diagonal
            else if ((c_obstacle < c_q && r_obstacle > r_q) && (r_obstacle - r_q == c_q - c_obstacle) && (r_obstacle - r_q < d_top_left))
            {
                d_top_left = r_obstacle - r_q - 1;
            }

        }

        count = left + top + right + bottom +
                d_top_right + d_top_left + d_bottom_right + d_bottom_left;

        return count;
    }

}
