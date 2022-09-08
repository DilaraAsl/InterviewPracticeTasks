package com.cydeo.hRank;

import java.util.Arrays;

public class TwoD_Array {
    public static void main(String[] args) {
        int[][] doubleArr={{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,0,0,0,0},
                {0,0,0,0,0,0},{0,0,0,0,0,0}};

        int max_hourglass_sum=Integer.MIN_VALUE;
       int current_hourglass_sum=0;
        for (int i = 0; i < doubleArr.length-2 ; i++) {

            for (int j = 0; j <doubleArr[0].length-2; j++) {

         current_hourglass_sum+= doubleArr[j][i]+ doubleArr[j+1][i]+ doubleArr[j+2][i]+
                 doubleArr[j+1][i+1]+ doubleArr[j][i+2]+doubleArr[j+1][i+2]+doubleArr[j+2][i+2];
       max_hourglass_sum=Math.max(max_hourglass_sum,current_hourglass_sum);

            }


        }

    }
}
