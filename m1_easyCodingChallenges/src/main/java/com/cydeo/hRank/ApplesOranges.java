package com.cydeo.hRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplesOranges {
    public static void main(String[] args) {
        List<Integer> apples=new ArrayList<>(Arrays.asList(-2,2,1));
        List<Integer> oranges=new ArrayList<>(Arrays.asList(5,-6));
        countApplesAndOranges(7,11,5,15,apples,oranges);

    }
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int countApples=0;
        int countOranges=0;
        for(Integer each:apples){
            if((each+a)>=s&&(each+a)<=t) countApples++;
        }
        for(Integer each:oranges){
            if((b-each)>=s&&(b-each)<=t) countOranges++;
        }
        System.out.println(countApples);
        System.out.println(countOranges);
    }

}

