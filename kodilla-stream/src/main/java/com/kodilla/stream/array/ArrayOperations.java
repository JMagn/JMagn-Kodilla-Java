package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(i -> System.out.print(numbers[i] + " "));

        OptionalDouble avg = IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average();

        System.out.println("\nAverage: " + avg.getAsDouble());

        return avg.getAsDouble();
    }
}