package com.cydeo.hRank;

import java.util.Arrays;


public class RemovingNonAlphabeticCharacters {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";

        String[] sArr = s.split("[^a-zA-Z]");

       sArr = Arrays.stream(sArr)
               .filter(str -> !str.isEmpty()).toArray(String[]::new);
       for(String each:sArr){
           System.out.println(each);
       }

//        splits = Arrays.asList(splits).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);




    }
}

