package com.cydeo.hRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramHashMap {
    public static void main(String[] args) {
        String a="anagram";
        String b="margana";
        String[] aList=a.split("");
        String[]bList=b.split("");

        Map<String,Integer> aMap= new HashMap<>();
        Map<String,Integer> bMap= new HashMap<>();
        for (int i = 0; i < aList.length; i++) {
            aMap.getOrDefault(aList[i],i+1);
            bMap.getOrDefault(bList[i],i+1);
        }
        if(aMap.equals(bMap)) System.out.println("true");
        else System.out.println("false");

            
        }


    }

