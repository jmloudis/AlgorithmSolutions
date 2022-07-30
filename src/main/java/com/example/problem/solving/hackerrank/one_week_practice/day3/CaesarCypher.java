package com.example.problem.solving.hackerrank.one_week_practice.day3;

public class CaesarCypher
{
    public static String caesarCipher(String s, int k) {
        // Write your code here
        // Write your code here
        String ans = "";
        int t =0;

        for(char c : s.toCharArray()){

            if(Character.isLetter(c)){

                if(Character.isUpperCase(c)){
                    t=((int)(c + k-65))%26;

                    ans +=  String.valueOf((char)(t + 65));
                }

                else{
                    if(Character.isLowerCase(c)){
                        t=((int)(c + k-97))%26;

                        ans +=  String.valueOf((char)(t + 97));
                    }
                }
            }
            else{
                ans += c;
            }
        }
        return ans;
    }
}
