package com.example.problem.solving.hackerrank.warmup;

public class TimeConversion {

    public String timeTo24hr(String s){

        String[] split = s.split(":");

        String hr = split[0];
        String min = split[1];
        String sec = split[2].substring(0,2);


        if (s.endsWith("PM")){
            if(!hr.equals("12")){
                int num = Integer.parseInt(hr);
                num += 12;
                hr = String.valueOf(num);

            }
        }

        else if (s.endsWith("AM")){
            if(hr.equals("12")){
                hr = "00";
            }
        }

        return hr + ":" + min + ":" + sec;

    }


    public String newTimeTo24hr(String s){

        String hr = s.substring(0, s.indexOf(':'));
        String min = s.substring(s.indexOf(':') + 1, s.lastIndexOf(':'));
        String sec = s.substring(s.lastIndexOf(':') + 1, s.lastIndexOf(':') + 3);

        int hour = Integer.parseInt(hr);

        if (s.contains("AM")){

            if(hour == 12){
                hr = "00";

            }
        }

        else if (s.contains("PM")){

            if (hour != 12){
                hour += 12;
                hr = String.valueOf(hour);
            }
        }

        System.out.println(hr);

        return hr + ":" + min + ":" + sec;
    }
}
