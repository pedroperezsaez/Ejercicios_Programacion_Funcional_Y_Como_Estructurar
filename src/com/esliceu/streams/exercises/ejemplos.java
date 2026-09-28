package com.esliceu.streams.exercises;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class ejemplos {
    static void main() {
        Integer[] ar= {1,2,3,4,5};
        Stream<Integer> opt= Arrays.stream(ar).filter(n-> n>3).findFirst().stream();
        System.out.println(opt.findAny().orElse(0));



    }
}
