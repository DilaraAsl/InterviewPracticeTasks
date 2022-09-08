package com.cydeo.hRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDArrayList {

        public static void main(String[] args) {
            List<Integer> noList1=Arrays.asList(1,1,1,0,0,0);
            List<Integer> noList2=Arrays.asList(0,1,0,0,0,0);
            List<Integer> noList3=Arrays.asList(1,1,1,0,0,0);
            List<Integer> noList4=Arrays.asList(0,0,0,0,0,0);
            List<Integer> noList5=Arrays.asList(0,0,0,0,0,0);
            List<Integer> noList6=Arrays.asList(0,0,0,0,0,0);
            List<List<Integer>> arr= Arrays.asList(noList1,noList2,noList3,noList4,noList5,noList6);

            int maxNO=Integer.MIN_VALUE;
            int sum=0;
            for (int i = 0; i < arr.size()-2 ; i++) {

                for (int j = 0; j <arr.get(i).size()-2; j++) {

                    sum=arr.get(j).get(i)+arr.get(j).get(i+1)+arr.get(j).get(i+2)
                            +arr.get(j+1).get(i+1)+arr.get(j+2).get(i)+arr.get(j+2).get(i+1)+
                            arr.get(j+2).get(i+2);

                    maxNO=Math.max(maxNO,sum);

                }



            }
            System.out.println(maxNO);

        }
    }
