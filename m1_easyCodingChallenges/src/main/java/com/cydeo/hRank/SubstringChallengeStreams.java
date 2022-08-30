package com.cydeo.hRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubstringChallengeStreams {
    public static void main(String[] args) {
        int k=3;
        String str="welcometojava";
        List<String> subList=new ArrayList<>();
        for (int i = k; i < str.length(); i++) {

               subList.add(str.substring(i-k, i));

        }

        subList.add(str.substring(str.length()-k));
        Collections.sort(subList);
        String min=subList.get(0);
       String max=subList.get(subList.size()-1);
        System.out.println(min+"\n"+max);
    }
}
