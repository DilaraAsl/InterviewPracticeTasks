package com.cydeo.hRank;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RunningTimeComplexityPrime {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kb=new Scanner(System.in);
        int counter=kb.nextInt();
        while(counter>0){
            int number=kb.nextInt();
        if (number > 1 && !IntStream.range(2, number/2+1).anyMatch(i -> number%i==0)) System.out.println("Prime");
        // possibility of finding a match is greater than finding a not match so when you find any match
        // that means it is not a prime by falsifying the condition you change the output to prime
        else System.out.println("Not prime");


        }
    }
}
