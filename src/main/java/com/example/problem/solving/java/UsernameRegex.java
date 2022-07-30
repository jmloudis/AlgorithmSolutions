package com.example.problem.solving.java;

public class UsernameRegex
{
    /**
     * ^  -> means the first character starting with a-z or A-Z
     *
     * [a-zA-Z] ->  means any character in b/w a-z or A-Z
     *
     * Next step
     *
     * [0-9_|a-zA-Z]  -> means any character in 0-9 _ or a-zA-Z
     */
    public static final String regularExpression = "(^[a-zA-Z][0-9_|a-zA-Z]{7,29})";
}
