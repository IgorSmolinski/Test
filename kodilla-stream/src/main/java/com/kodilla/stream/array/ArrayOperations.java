package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getArray(int[] numbers){
        IntStream.range(0,numbers.length)
                .map(n->numbers[n])
                .forEach(System.out::println);


        //double temp=0.1;


                return  IntStream.range(0,numbers.length)
                .map(n->numbers[n])
                .average()
                .getAsDouble();
                        //.sum()/(numbers.length);

                //.average()

    }
}
