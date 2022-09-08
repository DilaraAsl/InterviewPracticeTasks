package com.cydeo.hRank;

import java.util.Arrays;


public class FindMaxMinSum {
    public static void main(String[] args) {
        int[] nums={256741038, 623958417,467905213, 714532089, 938071625};
       int maxNo= Arrays.stream(nums).max().getAsInt();
      //  System.out.println(maxNo);
        int minNo=Arrays.stream(nums).min().getAsInt();
     //   System.out.println(minNo);
int maxSum=0;
int minSum=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==minNo) continue;
            else maxSum+=nums[i];


        }

//        for (int i = 0; i <nums.length ; i++) {
//            if(nums[i]==maxNo) continue;
//            else minSum+=nums[i];
//
//
//        }

       int minNO2= Arrays.stream(nums).filter(n->n!=maxNo).sum();
        System.out.println(minNO2);
        int maxNo2=Arrays.stream(nums).filter(n->n!=minNo).sum();
        System.out.println(maxNo2);
      //  System.out.println(minSum);

    }
}
