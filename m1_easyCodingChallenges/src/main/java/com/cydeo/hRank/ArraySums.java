package com.cydeo.hRank;

import java.util.Arrays;
import java.util.List;

public class ArraySums {
    public static void main(String[] args) {
        List<Integer> ar= Arrays.asList(1, 3, 2, 6, 1, 2);
        System.out.println(divisibleSumPairs(6,3,ar));

    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int left=0;
        int right=ar.size()-1;
        int counter=0;
        while(left<ar.size()-1){
            if(right>left){
                if((ar.get(left)+ar.get(right))%k==0){counter++;right--; continue;}
                else right--;continue;
            }
            left++;
            right=ar.size()-1;
        }
        return counter;

    }}

