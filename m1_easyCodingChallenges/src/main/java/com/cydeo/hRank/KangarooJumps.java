package com.cydeo.hRank;

public class KangarooJumps {
    public static void main(String[] args) {
        System.out.println(kangaroo(0,2,5,3));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if (v1<=v2) return "NO";
        if(((x2-x1)%(v1-v2))==0) {

            System.out.println((x2-x1)%(v1-v2));

        return "YES";}
        return "NO";


    }

}
