package com.cydeo.hRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("blue","red","orange"));

        list.add("pink");
        System.out.println(list);
        list.set(0,"black");
        System.out.println(list);
    }
}
