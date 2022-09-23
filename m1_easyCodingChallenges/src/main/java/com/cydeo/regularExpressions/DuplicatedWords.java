package com.cydeo.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicatedWords {
    public static void main(String[] args) {
        String str = "My dog is a dog which eats dog is a dog";
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            str = str.replaceAll(matcher.group(0), matcher.group(1));


        }
        System.out.println(str);
    }
}
