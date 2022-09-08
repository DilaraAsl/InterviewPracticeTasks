package com.cydeo.hRank;

public class TimeConversion {
    public static void main(String[] args) {
        String s="12:45:54PM";
        System.out.println(timeConversion(s));

    }
    public static String timeConversion(String s) {

        // Write your code here

        if (s.substring(0,2).equals("12")&&s.contains("AM")) {
            s=s.replace("AM","");
            return "00"+s.substring(2);}
        if(s.contains("AM")) return s.replace("AM","");
        if(s.contains("PM")&& Integer.valueOf(s.substring(0,2)).equals(12)){
            s=s.replace("PM","");
            return ""+(Integer.valueOf(s.substring(0,2)))+s.substring(2);
        }
        if(s.contains("PM")){
            s=s.replace("PM","");
            return ""+(Integer.valueOf(s.substring(0,2))+12)+s.substring(2);
        }
        return null;
    }
}
