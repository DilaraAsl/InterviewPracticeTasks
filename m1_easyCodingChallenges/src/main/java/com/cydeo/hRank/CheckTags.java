package com.cydeo.hRank;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckTags {
    public static void main(String[] args) {
        String str = "<h1> at the heading </h1>";
        printValidTags(str);
    }

    public static void printValidTags(String str) {
        boolean matchFound=false;
      Pattern pattern=Pattern.compile("<(.+)>([^<]+)</\\1>");
     //  Pattern pattern=Pattern.compile("/at/g");
        Matcher match=pattern.matcher(str);
        while(match.find()){
            System.out.println(match.group(2));
            matchFound=true;

        }
        if(!matchFound){
            System.out.println("None");
        }

    }
}