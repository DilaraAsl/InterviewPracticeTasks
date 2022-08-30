package com.cydeo.stream_iterate_tasks;

import java.util.stream.Stream;

public class StreamIterateDemo {
    public static void main(String[] args) {

        // print numbers from 0-9
        Stream.iterate(0,n->n+1)
                .limit(10)
                .forEach(x-> System.out.print(x+" "));
        System.out.println();
        System.out.println("***************************");

        // print odd numbers
        Stream.iterate(0,n->n+1)
                .filter(n->n%2!=0)
                .limit(10)
                .forEach(n-> System.out.print(n+" "));

        System.out.println("******************************");

        //fibonacci example
        Stream.iterate(new int[]{0,1},n->new int[]{n[1],n[0]+n[1]})
                .limit(10)
              //  .forEach(n-> System.out.printf("%-6d%-6d\n",n[0],+n[1]));
                .map(n->n[0])
                .forEach(x-> System.out.println(x));

        // sum all fibonacci value
        int sum=Stream.iterate(new int[]{0,1},n->new int[]{n[1],n[0]+n[1]})
                .limit(10)
                .map(n->n[0])
                .mapToInt(n->n)
                .sum();
        System.out.println( "Fibonacci 10 sum: " +sum);
    }
}
