package com.example.problem.solving.hackerrank.implementation;

public class AppendAndDelete
{
    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int matchingCharacters = 0;
        for (int i = 0; i <  Math.min(s.length(), t.length()); i++)
        {

            if(s.charAt(i) != t.charAt(i))
            {
                break;
            }
            matchingCharacters++;

        }
        int nonMatchingCharactersInS = s.length() - matchingCharacters;
        int nonMatchingCharactersInT = t.length() - matchingCharacters;

        //I reassign here to make the conditions more readable down below
        int nmcS = nonMatchingCharactersInS;
        int nmcT = nonMatchingCharactersInT;

        //use the number of non matching characters in an equation to determine if it can be done

        //Naming the conditions to increase readability
        boolean conditionA = nmcS + nmcT == k;
        boolean conditionB = (nmcS + nmcT < k && (nmcS + nmcT - k) % 2 == 0 );
        boolean conditionC = s.length() + t.length() <= k;

        System.out.println(matchingCharacters);
        return (conditionA || conditionB || conditionC) ? "Yes" : "No";

    }
}
