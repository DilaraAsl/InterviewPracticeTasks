package com.cydeo.stream_iterate_tasks;

import java.util.stream.Stream;

public class StreamIterateJava9Demo {
    public static void main(String[] args) {
        System.out.println();
        Stream.iterate(1,n->n<20,n->n*2) // second argument predicate if false iteration stops
                .forEach(x-> System.out.println(x));
    }
}
