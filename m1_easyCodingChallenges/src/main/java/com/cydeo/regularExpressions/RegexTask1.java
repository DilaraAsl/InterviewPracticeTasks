package com.cydeo.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask1 {
    public static void main(String[] args) {
        String str="Axxb";
        Pattern pattern=Pattern.compile(".xx.");
        Matcher matcher=pattern.matcher(str);
        System.out.println("String matches the given regex: "+matcher.matches());
        System.out.println(Pattern.matches("[a-z&&[^yz]]",str));
    }
}
