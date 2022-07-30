package com.example.problem.solving.hackerrank.skills_test_java;

import java.util.Stack;

class Parser{
    static String isBalanced(String s)
    {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();

        for (char c : arr)
        {

            if (c=='{' || c=='[' || c =='(')
            {
                st.push(c);
            }
            else
            {
                if (c == ']' && !st.isEmpty() && st.pop() == '[')
                {
                    continue;
                }
                else if (c == '}' && !st.isEmpty() && st.pop() == '{')
                {
                    continue;
                }
                else if (c == ')' && !st.isEmpty() && st.pop() == '(')
                {
                    continue;
                }
                else
                {
                    return "false";
                }
            }
        }

        if (!st.isEmpty())
        {
            return "false";
        }

        return "true";
    }

}
