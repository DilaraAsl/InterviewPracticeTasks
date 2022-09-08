package com.cydeo.hRank;

import java.util.Stack;

public class BinaryCount {
    public static void main(String[] args) {
 binaryMaxOnes(439);
    }
    public static void binaryMaxOnes(int n){
        Stack<Integer> binStack=new Stack<>();
        int rem=0;
        String str="";
        while(n>0){
            rem=n%2;
            binStack.push(rem);
            n=n/2;

        }
        while(!binStack.isEmpty()){
            str+=""+binStack.pop();
        }
        System.out.println(str);
        int i=str.length();
        int sum=0;int max=0;
       String[] arr=str.split("0");
       for(String each:arr){
           if(each.length()>max){
               max=each.length();
           }
       }
        System.out.println(max);

    }
}
