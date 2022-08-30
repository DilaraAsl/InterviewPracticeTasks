package com.cydeo.hRank;

import java.util.Arrays;

import java.util.stream.Collectors;

public class AnagramUsingStreams {
    public static void main(String[] args) {
        String s="bana";
        String p="anab";
        String[] strList=s.split("");
      String newS=  Arrays.stream(strList)
              .sorted()
              . collect(Collectors.joining());
     String newP=  Arrays.stream(p.split("")).sorted().collect(Collectors.joining());
        System.out.println(newS);
      System.out.println(newP);
        System.out.println(newS.equals(newP));

    }
}
